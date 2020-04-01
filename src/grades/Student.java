package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private ArrayList<Integer> studentGrades;

    //constructor
    public Student(String x){
        this.studentName = x;
        this.studentGrades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return studentName;
    }

    // adds a grade
    public void addGrade(int grade){
        studentGrades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double allTheGrades = 0;
        for (double grade: studentGrades){
            allTheGrades += grade;
        }
        return (allTheGrades / studentGrades.size());
    }

    public static void main(String[] args) {
        //all my stuff works!! Yay!!
        Student kate = new Student("Kate");
        kate.addGrade(98);




    }
}
