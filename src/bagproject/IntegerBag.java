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
public class IntegerBag {
    private int Data[];                 //this is the bag data array
    private static int Capacity = 10;   //this is the total capacity of the bag
    private int numberOfEntries = 0;    
    
    public IntegerBag(){
        Data = new int[Capacity];
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
    
    public void add(int newData){
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
        if(numberOfEntries>=0){
            Data[numberOfEntries-1] = 0;
            numberOfEntries--; 
        }else { 
            System.out.println("bag is empty! cannot delete");
        }
    }
    
    public void clear(){
        while(numberOfEntries>=0){
            remove();
        }
        
    }
    
    
}
