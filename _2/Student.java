package Esercizi_OOP._2;

public class Student {

    String name=null;
    Integer age=null;

    Student(String name,Integer age) {

        System.out.println("Constructing!");
        this.name=name;
        this.age=age;
        System.out.println("Constructed!");

    }

    Student(String name) {

        System.out.println("Constructing!");
        this.name=name;
        System.out.println("Constructed!");

    }

    Student(Integer age) {

        //System.out.println("Constructing!");
        this.age=age;
        //System.out.println("Constructed!");

    }

    Student(){

        //System.out.println("Constructing!");
        //System.out.println("Constructed!");
    }

    public void stampaStudente (){

        System.out.println("Nome: "+name);
        System.out.println("Età: "+ age);

    }

}
