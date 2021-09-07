/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidvaccineprogramme;

import javax.swing.JOptionPane;

/**
 * Patient.java
 * 19/02/2021
 * @author Alexis Pechon
 * @Student Number x19358953
 */
public class Patient {
    /*This class is going to be the instantiable class to store the patient's info*/
    
    //Data Types
    private String name; //Variable used to store the patient's name
    private String medicalCondition; //Variable used to store the patient's medical condition
    private int age; //Variable used to store the patient's name
    
    
    //No args Constructor
    public Patient(){
        name = "";
        medicalCondition = "";
        age = 0;
    }
    
    
    //Setters and Getterss
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    public String getDetails(){
          //Prints all the patient's details stored in the instance class back to the user
           return "Name: " + name + "\nAge: " + age + "\nMedical Condition: " + medicalCondition;
    }
    
   
}
