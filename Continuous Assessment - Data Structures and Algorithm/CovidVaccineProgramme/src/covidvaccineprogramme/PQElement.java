/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidvaccineprogramme;

/**
 * PQElement.java
 * 19/02/2021
 * @author Alexis Pechon
 * @Student Number x19358953
 */
public class PQElement {
    
    /*
      The PQElement class declares and assigns the basic functionalities of the
      priority keys and the elememts
    */
    
    //Data Members
    private int key; //declaring the priority key element called key
    private Patient element; //declaring the patient elemeents being added into the Priority Queue as element
    
    public PQElement(int key, Patient element){
        this.key = key;
        this.element = element;
    }
    
    //Setters and Getters
    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Patient getElement() {
        return element;
    }

    public void setElement(Patient element) {
        this.element = element;
    }
    
    public String printDetails(){
        
        //Print details method to return all of the necessary info about the patient
        String message = "Name: " + element.getName() + "\nAge: " + element.getAge() + "\nMedical Condition: " + element.getMedicalCondition();
        
        return message; //Returns the message when the method is called
    }
    
}
