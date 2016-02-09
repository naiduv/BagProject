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
public class DNode {
    public int data;
    public DNode prev;
    public DNode next;
    
    public DNode(int data){
        this.data = data;
        next = null;
        prev = null;
    }
    
    public String toString(){
        String result = "";
        int prevs = this.prev!=null ? prev.data : 0;
        int nexts = this.next!=null ? next.data : 0;
        
        result = prevs + " " + data + " " + nexts;
        return result;
    }
}
