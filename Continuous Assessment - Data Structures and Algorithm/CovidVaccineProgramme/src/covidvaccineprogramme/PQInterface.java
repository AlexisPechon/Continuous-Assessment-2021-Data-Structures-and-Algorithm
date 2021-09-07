/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidvaccineprogramme;

/**
 * PQInterface.java
 * 19/02/2021
 * @author Alexis Pechon
 * @Student Number x19358953
 */
public interface PQInterface {
    
    /*The interface class lays out a set of rules that a class must follow whe it has the implements keyword*/
    
    public boolean isEmpty(); //Checks if the ArrayList is empty - returns true or false
    public int size(); //Checks the size of the ArrayList
    public void enqueue(int key, Object element); //Placeholder for when storing an object element with a priority listing in the priority queue
    public Object dequeue(); //Removes an element from the Priority Queue
    public String printQueue(); //Method to print out the contents/elements of the priority queue
}
