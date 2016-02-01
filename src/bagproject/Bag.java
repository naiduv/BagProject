/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagproject;

/**
 *
 * @author vnaidu
 */
public class Bag <T> {
    private T Data[];                 //this is the bag data array
    private static int Capacity = 10;   //this is the total capacity of the bag
    private int numberOfEntries = 0;    
    
    public Bag(){
        Data = (T[]) new Object[Capacity];
    }
    
    public int getCurrentSize(){
        return numberOfEntries;
    }
    
    public boolean isEmpty(){
        if(numberOfEntries == 0)
            return true;
        else
            return false;
//        return numberOfEntries == 0;
    }
    
    public void add(T newData){
        //if bag is full??
        if(numberOfEntries<Capacity)
        {
            //basic addition of data
            Data[numberOfEntries] = newData;
            numberOfEntries++;
        } else { 
            System.out.println("bag is full! Delete something");
        }
    }
    
    public void remove(){
        if(numberOfEntries>0){
            Data[numberOfEntries-1] = null;
            numberOfEntries--; 
        }else { 
            System.out.println("bag is empty! cannot delete");
        }
    }
    
    public void clear(){
        while(numberOfEntries>0){
            remove();
        }
        
    }
    
    public void removeAt(int index){
        if(numberOfEntries>index && index < Capacity){
            System.out.println("Trying to remove at " + index);            
            Data[index] = null;
            for(int i=index; i<numberOfEntries-1; i++){
                Data[i] = Data[i+1];
            }

            numberOfEntries--;
            
            Data[numberOfEntries]=null;
        } else {
            System.out.println("Nothing at that index");
        }
    }
    
    public void removeItem(T item){
        Boolean found = false;
        for(int i=0; i<numberOfEntries; i++){
            if(Data[i]==item){
                removeAt(i);
                found = true;
            }
        }
        
        if(found==false){
            System.out.println("Item was not found");
        } else {
            System.out.println("Item was found");
        }
    }
    
    public String toString(){
        String returnString = "";
        for(int i=0; i<numberOfEntries; i++){
           returnString = returnString + "\n index " + i + 
                   " = "+ Data[i];
        }
        
        return returnString;
    }
}
