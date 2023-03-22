package Esercizi_OOP._3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name=null;
    private String ID=null;
    private Integer maxStudent=null;
    private Integer qualityRatingOutOf10=null;
    private Integer age =null;
    private ArrayList<Double> grades= new ArrayList<>();
    private Integer idIteration=0;
    private Integer ageInsertion=0;


    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getID(){
        idIteration+=1;
        if (ID==null){
            ID="Non valido";
        }return ID;
    }
    public void setID(String ID){

        if (ID.contains("@")){
            System.out.println("Carattere proibito");
        } else {
            this.ID=ID;
        }

    }
    public Integer getMaxStudent(){
        return maxStudent;
    }
    public void setMaxStudent(Integer maxStudent){
        this.maxStudent=maxStudent;
    }
    public Integer getQualityRatingOutOf10(){
        return qualityRatingOutOf10;
    }

    public void setQualityRatingOutOf10(Integer qualityRatingOutOf10) {
        if (qualityRatingOutOf10<0||qualityRatingOutOf10>10){
            System.out.println("Rating fuori range");
        } else{
            this.qualityRatingOutOf10 = qualityRatingOutOf10;
        }
    }

    public Integer getAge() {

        ageInsertion+=1;
        if (ageInsertion>=2){
            System.out.println("Troppe età");
            return null;
        }
        else if(age<0) {
           System.out.println("L'età non può essere negativa");
           return 0;
        }
        else {
            return age;
        }

    }

    public void setAge(Integer age) {
        if (age==null){

        }
        else{this.age = age;}
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }

    public void printGet(){

    System.out.println("Nome: "+getName()+"\nID: "+getID()+"\nEtà: "+getAge()+"\nMaxStudent: "+getMaxStudent()+"\nQuality Rating: "+getQualityRatingOutOf10());

    }
}

