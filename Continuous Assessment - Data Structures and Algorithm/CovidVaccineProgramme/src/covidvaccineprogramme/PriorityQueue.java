/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidvaccineprogramme;

import java.util.ArrayList;

/**
 * PriorityQueue.java
 * 19/02/2021
 * @author Alexis Pechon
 * @Student Number x19358953
 */
public class PriorityQueue implements PQInterface{
    
    /*The whole point of the PriorityQueue class is to create a series of general methods that can be called inside of the GUI class*/
    /*These methods will carry out specific functions when they are called in the GUI class*/
    
    //Creating an arraylist used to store the patient elements
    private ArrayList <PQElement> myArrList;
    
    public PriorityQueue(){
        myArrList = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return myArrList.isEmpty(); //Returns a true or false value.
    }
    
    public int size(){
        return myArrList.size(); //Returns the size of the array based on how many enttires were there
    }
    
    private int findPosition(int newKey){
        
        boolean found = false;
        int position = 0;
        PQElement temp;
        
        while(position < myArrList.size() && !found){
            temp = myArrList.get(position);
            
            if(temp.getKey() > newKey){
                position++;
            }
            else{
                found = true;
            }
        }
        
        return position;
    }
    
    public void enqueue(int priorityKey, Object items){
        //The enqeue method follows the rule of expecting a priority key and an Object element, which in this case is called items
        int index;
        PQElement temp = new PQElement(priorityKey, (Patient)items);
        
        index = findPosition(priorityKey);
        
        if(index == size()){
            myArrList.add(temp);
        }
        else{
            myArrList.add(index, temp);
        }
    }

    
    public Object dequeue(){
        return myArrList.remove(0); //Returns the first index of the Priority Queue
    }
    
    public String printQueue(){
        
        //When this method is called it will return all of the patient's information back to the user
        String printMessage = "";
        PQElement temp; //Creating a temporary object of the PQElement class
        
        for(int i = 0; i < myArrList.size(); i++){
            temp = myArrList.get(i);
            printMessage = printMessage.concat(temp.printDetails() + "\n" + "Priority: " + temp.getKey() + "\n");
        }
        
        return printMessage;
    }

    
}
