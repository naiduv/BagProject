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
public class BagProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(25);
        list.add(1);        
        list.removeItem(1);
        list.removeItem(30);

        
        System.out.println(list);
        
        
    }
    
    public static void TestLinkedBag(){
        LinkedBag myBag = new LinkedBag();    
        myBag.add("test");
        myBag.add("a");
        myBag.add("is");
        myBag.add("this");
        System.out.println(myBag);
                
        myBag.removeItem("this");
        
        System.out.println("trying to remove this...\n");
        System.out.println(myBag);

        myBag.removeItem("test");
        
        System.out.println("trying to remove test...\n");
        System.out.println(myBag);
    }  
    
    public static void TestStringBag(){
       Bag<String> myStringBag = new Bag<String>(); 

       myStringBag.add("nick0");
       myStringBag.add("nick1");
       myStringBag.add("nick2");
       System.out.println(myStringBag);
       myStringBag.removeItem("nick2");
       System.out.println(myStringBag);
       myStringBag.removeAt(0);
       System.out.println(myStringBag);
       myStringBag.clear();
    }
    
    public static void TestIntegerBag(){
        IntegerBag myBag = new IntegerBag();
        
        myBag.add(10);
        myBag.add(11);
        myBag.add(12);
        myBag.add(13);
        myBag.add(14);
        myBag.add(15);
        myBag.add(16);
        myBag.add(17);
        myBag.add(18);
        myBag.add(12);
        myBag.add(10);
        myBag.add(12);   
        
        myBag.remove();
        myBag.remove();
        
        System.out.println(myBag);
        myBag.removeAt(3);
        System.out.println(myBag);
        myBag.removeAt(0);
        
        
        System.out.println(myBag);
        
        myBag.removeItem(11);
        System.out.println(myBag);
        
        myBag.removeItem(111);
    }
    
}
