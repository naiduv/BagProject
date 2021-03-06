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
public class LinkedBag {
    private Node firstNode;
    private int numberOfEntries;
    
    public LinkedBag(){
        firstNode = null;
        numberOfEntries = 0;
    }
    
    public void add(String dataPortion){
        Node newNode = new Node(dataPortion);
        newNode.next = firstNode;
        
        firstNode = newNode;
        numberOfEntries++;
        System.out.println("Created first node");
    }
    
    public void remove(){
        if(numberOfEntries>0){
            firstNode = firstNode.next;
            numberOfEntries--;   
        }
        else {
            System.out.println("Nothing to remove");
        }
    }
    
    public void removeItem(String item){
        Node iterator = firstNode;
        Node previous = null;
        boolean found = false;
        
        while(!found && iterator!=null){
            if(iterator.data == item){
                if(previous==null){
                    //this handles the first node
                    remove();
                } else {
                    previous.next = iterator.next;
                    numberOfEntries--;  
                }
                
                found = true;
                //break;
            }

            previous = iterator;
            iterator = iterator.next;   
        }
    }
    
    public String toString(){
        Node iterator = firstNode;
        String result = "";
        while(iterator!=null){
            result = result + "\n" + iterator.data;
            iterator = iterator.next;   
        }
        
        return result;
    }
    
}
