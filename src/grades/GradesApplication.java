package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        //Made a HashMap
        HashMap<String, Student> students = new HashMap<>();

        //Made all them students
        students.put("BrycePayne", new Student("Bryceroni"));
            students.get("BrycePayne").addGrade(100);
            students.get("BrycePayne").addGrade(95);
            students.get("BrycePayne").addGrade(97);
        students.put("JasmineRivera", new Student("Jazzercise"));
            students.get("JasmineRivera").addGrade(100);
            students.get("JasmineRivera").addGrade(99);
            students.get("JasmineRivera").addGrade(93);
        students.put("JeffWalton", new Student("JEFFREY"));
            students.get("JeffWalton").addGrade(90);
            students.get("JeffWalton").addGrade(75);
            students.get("JeffWalton").addGrade(67);
        students.put("KateMcKinney", new Student("Kate"));
            students.get("KateMcKinney").addGrade(100);
            students.get("KateMcKinney").addGrade(99);
            students.get("KateMcKinney").addGrade(98);

        //Output some STUFF!
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;

        do {
            System.out.println();
            System.out.println(students.keySet());
            System.out.println("Which student would you like to learn more about?\nSay 'exit' when you are done.\n");
            String userInput = scanner.nextLine().strip();

            if (userInput.equalsIgnoreCase("Exit")){
                keepGoing = false;
                break;
            }
            else if (userInput.equalsIgnoreCase("BrycePayne")){
                System.out.println(students.get("BrycePayne").getName());
                System.out.println(students.get("BrycePayne").getGradeAverage());
            }
            else if (userInput.equalsIgnoreCase("JasmineRivera")){
                System.out.println(students.get("JasmineRivera").getName());
                System.out.println(students.get("JasmineRivera").getGradeAverage());
            }
            else if (userInput.equalsIgnoreCase("JeffWalton")){
                System.out.println(students.get("JeffWalton").getName());
                System.out.println(students.get("JeffWalton").getGradeAverage());
            }
            else if (userInput.equalsIgnoreCase("KateMcKinney")){
                System.out.println(students.get("KateMcKinney").getName());
                System.out.println(students.get("KateMcKinney").getGradeAverage());
            }
            else {
                System.out.println("This person isn't in the list, try again!");
            }
        }
        while (keepGoing);
    }
}