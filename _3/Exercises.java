package Esercizi_OOP._3;

import java.util.ArrayList;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        Student student = new Student();
        student.setName("Mario");
        student.setID("AR14587");
        student.setMaxStudent(10);
        student.setQualityRatingOutOf10(8);
        student.setAge(18);
        student.setGrades(new ArrayList<>());
        student.printGet();

    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        Student student=new Student();

        student.setName("Giacomo");
        student.setAge(78);
        student.setID("@R14587");
        student.setMaxStudent(10);
        student.setQualityRatingOutOf10(8);
        student.setAge(-8);
        student.setGrades(new ArrayList<>());
        student.printGet();
    }

}
