package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        //Made a map
        HashMap<String, Student> students = new HashMap<>();

        //Made all them students
        students.put("BrycePayne", new Student("Bryce"));
            students.get("BrycePayne").addGrade(100);
            students.get("BrycePayne").addGrade(95);
            students.get("BrycePayne").addGrade(97);
        students.put("JasmineRivera", new Student("Jasmine"));
            students.get("JasmineRivera").addGrade(100);
            students.get("JasmineRivera").addGrade(99);
            students.get("JasmineRivera").addGrade(93);
        students.put("JeffWalton", new Student("Jeff"));
            students.get("JeffWalton").addGrade(90);
            students.get("JeffWalton").addGrade(75);
            students.get("JeffWalton").addGrade(67);
        students.put("KateMcKinney", new Student("Kate"));
            students.get("KateMcKinney").addGrade(100);
            students.get("KateMcKinney").addGrade(99);
            students.get("KateMcKinney").addGrade(98);

        //Output some stuff!

    }
}