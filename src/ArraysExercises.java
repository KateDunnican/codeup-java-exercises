import java.sql.Array;
import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson (Person[] personArray, Person newPerson){
        Person[] newArray = Arrays.copyOf(personArray, personArray.length + 1);
        newArray[3] = new Person(newPerson.getName());
        return newArray;
    }

    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
            people[0]= new Person("Casey");
            people[1]= new Person("Vivian");
            people[2]= new Person("Trant");

            int x = people.length;

//            for (Person individual : people){
//                System.out.println(individual.getName());
//            }

//            addPerson(people, new Person("Jimbo"));
            for (Person individual : addPerson(people, new Person("Jimbo"))){
                System.out.println(individual.getName());
            }
    }
}
