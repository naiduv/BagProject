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
public class DoubleLinkedList {

    DNode first = null;
    DNode last = null;

    public String toString() {
        DNode current = first;
        String result = "";
        while (current != null) {
            result += "\n" + current.toString();
            current = current.next;
        }
        return result;
    }

    public void add(int item) {
        DNode newNode = new DNode(item);
        //empty
        if (first == last && first == null) {
            first = newNode;
            last = first;
            return;
        }

        //not empty and single entry
        if (first == last && first != null) {
            if (item < first.data) {
                first = newNode;
                first.next = last;
                last.prev = first;
            } else {
                last = newNode;
                last.prev = first;
                first.next = last;
            }

            return;
        }

        //data found anywhere
        if (first != last) {
            DNode current = first;
            //traverse list to find a number greater than item
            while (current != null) {
                //find it and place new data in list
                if (current.data > item) {
                    //item is smaller than first in list
                    if (current == first) {
                        current.prev = newNode;
                        newNode.next = current;
                        first = newNode;
                        return;
                    }

                    newNode.next = current;
                    newNode.prev = current.prev;
                    current.prev.next = newNode;
                    current.prev = newNode;
                    return;
                }
                //keep searching till done
                current = current.next;
            }

            //done.. did not find bigger number
            newNode.prev = last;
            last.next = newNode;
            last = newNode;
            return;
        }

    }

    public void removeAll() {
        //linear time method
        //        while(first!=null){
        //            removeFirst();
        //        }

        //constant time method
        first = null;
        last = null;
    }

    public void removeFirst() {
        //check for empty list
        if (first == null) {
            return;
        }

        //first and last are the same
        if (first == last) {
            first = null;
            last = null;
            return;
        }

        //list is not empty
        first = first.next;
        first.prev = null;
    }

    public void removeLast() {
        //check for empty list
        if (last == null) {
            return;
        }

        //first and last are the same
        if (first == last) {
            first = null;
            last = null;
            return;
        }
        //list is not empty
        last = last.prev;
        last.next = null;
    }

    public boolean isEmpty() {
        if (first == null && last == null) {
            return true;
        } else {
            return false;
        }
    }

    public void removeItem(int item){
        DNode current = first;
        //traverse list to find a number greater than item
        while (current != null) {
            if(current.data == item){
                //if first
                if(first == current){
                    removeFirst();
                    return;
                }
                
                //if last
                if(last == current){
                    removeLast();
                    return;
                }                
                
                //anything else
                current.prev.next = current.next;
                current.next.prev = current.prev;
                return;
            }
            current = current.next;
        }
        
    }
    
    public int GetNumberOfItems() {
        DNode current = first;
        int count = 0;
        //traverse list to find a number greater than item
        while (current != null) {
            count++;
            current = current.next;
        }
        
        return count;
    }
}
