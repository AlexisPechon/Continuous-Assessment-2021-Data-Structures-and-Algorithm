/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidvaccineprogramme;

import javax.swing.JOptionPane;

/**
 * CovidVaccineApp.java
 * 19/02/2021
 * @author Alexis Pechon
 * @Student Number x19358953
 */
public class CovidVaccineApp {
    
    /*
     * The Data Structures used in this project are the:
     * 1. Priority Queue
     * 2. ArrayLists
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // The main class will run our application when it is executed
        
        String choice = JOptionPane.showInputDialog(null,"Do you wish to be vaccinated?");
        
        if(choice.equalsIgnoreCase("Yes")){
            CovidVaccineGUI gui = new CovidVaccineGUI(); //Create an object class of the CovidVaccineGUI class and called it guis
            gui.setVisible(true); //The gui will be visible when the program is executed
        }
        else if(choice.equalsIgnoreCase("No")){
            System.exit(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "You can only answer yes or no");
        }
        
        
    }
    
}
