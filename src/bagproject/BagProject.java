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
        // TODO code application logic here
        TestIntegerBag();
        
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
