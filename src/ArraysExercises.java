import java.sql.Array;
import java.util.Arrays;

public class ArraysExercises {

    // Method to add a Person object to the people array by making a new array
    public static Person[] addPerson (Person[] personArray, Person newPerson){
        Person[] newArray = Arrays.copyOf(personArray, personArray.length + 1);
        // see instructor version for better way to do this
        newArray[3] = new Person(newPerson.getName());
        return newArray;
    }

    public static void main(String[] args) {
        // Iterating through an array of numbers
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        // an array of Person objects named "people"
        Person[] people = new Person[3];
            people[0]= new Person("Casey");
            people[1]= new Person("Vivian");
            people[2]= new Person("Trant");

            // Iterating through people
            for (Person individual : people){
                System.out.println(individual.getName());
            }

            // Iterating through people + Jimbo (newArray from addPerson)
            for (Person individual : addPerson(people, new Person("Jimbo"))){
                System.out.println(individual.getName());
            }
    }
}
