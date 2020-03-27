import java.util.Arrays;

public class ArraysExercises {



//    public static void addPerson (Person[], Person){
//        return Arrays.copyOf(people, people.length + 1);
//    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
            people[0]= new Person("Casey");
            people[1]= new Person("Vivian");
            people[2]= new Person("Trant");

        int x = Person people.length;

            for (Person individual : people){
                System.out.println(individual.getName());
            }
    }
}
