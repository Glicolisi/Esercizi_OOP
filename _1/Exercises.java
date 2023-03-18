package Esercizi_OOP._1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        exercise2();exercise3();
    }

    /**
     * 1: Create a new Class in this package
     *
     *    Call this class 'Course'
     *
     *    Inside add the following variables, using an appropriate type.
     *    courseName, maxStudents, qualityRatingOutOf10
     *
     *    On top of this choose 2 variables of your choice!
     */

    /**
     * 2: use the class called 'Student', add variables
     *    (class variables are called 'fields' or 'attributes')
     *    called 'name' and 'age'
     *
     *    Using the function below set the student name and ages
     *
     */
    private static void exercise2() {
        System.out.println("Exercise 2:");
        List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);
        /*Non avevo capito inizialmente cosa richiedesse l'esercizio, così ho impostato la classe Student con Liste invece che primitivi/stringhe
         Il primo ciclo for infatti ritorna Studente già completo senza dover utilizzare la funzione.
         Poi mi sono accorto della seconda parte del es 2 e ho provato a svolgerlo senza modificare niente
         */
        Student allievo = new Student();
        for (int i=0;i<studentNames.size();i++){

            allievo.name.add(studentNames.get(i));
            allievo.age.add(studentAges.get(i));
        }

       ArrayList<Student> Classe = new ArrayList<>();

        for (int i=0;i<studentNames.size();i++){

            createNewStudent(studentNames.get(i),studentAges.get(i));
            Classe.add(createNewStudent(studentNames.get(i),studentAges.get(i)));
        }

        System.out.println(studentAges.size());
        System.out.println(Classe.size());

        //Entrambi i metodi funzionano avendo inizializzato come liste i campi di "Student"


    }

    private static Student createNewStudent(String name, Integer age) {
        Student student = new Student();

        student.name.add(name);
        student.age.add(age);

        return student;
    }

    /*
     * 3: Finally lets edit our 'Course' class once more,
     *
     *    This time we are going to add another internal variable (field or attribute) called
     *    students. It's going to be a List<Student> called students
     *
     *    Copy the code above and add the students from exercise 2
     *
     *    Bonus: Using an appropriate loop of your choice find the average age of our students.
     *
     *    Hint: use a double to stop automatic integer rounding
     */

    private static void exercise3() {
        System.out.println("\nExercise 3:");

        List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);

        Course corso= new Course();
        for (int i=0;i<studentNames.size();i++){

            corso.students.add(createNewStudent(studentNames.get(i),studentAges.get(i)));

        }


        ArrayList<Integer>somma= new ArrayList<>();
        double media= 0.0;
        for (int j=0;j<corso.students.size();j++){

             somma.add(corso.students.get(j).age.get(0));
             //Arrotondato con trucco
             media+=somma.get(j);

        }
        media=Math.round((media)/corso.students.size()*100.0)/100.0;
        System.out.println(media);


        // Write your code here
    }
}
