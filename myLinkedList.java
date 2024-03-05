/**
 * myLinkedList - allows for a LinkedList to 
 * be created using Nodes
 * @author Professor Mansouri and esther greene
 * @version March 4, 2024
 */

package accidentpack;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class myLinkedList {
	
	/**
	 * Node A class used to create a Nodes
	 * for the Binary Tree (each having two pointers)
	 * @param <E> Node object of type E (placeholder)
	 */
    private static class Node
    {
        Report data;
        Node next;
        Node nextCounty;
        public Node(Report data)
        {
            this.data = data;
            this.next = null;
            this.nextCounty = null;
        }
    }
    
    ArrayList<Node> heads;
    Node head;
    
    /**
     * myLiknkedList A constructor for the class
     */
    public myLinkedList()
    {
        heads = new ArrayList<Node>();
        head = null;
    }
    
    /**
     * Adds a new object (newReport) to the BinnaryTree
     * @param newReport An object to be added to the LinkedList
     */
    public void add(Report newReport)
    {
        Node newNode = new Node(newReport);
        if (head == null) {
            head = newNode;
            return;
        }
     
        Node current = head;
        Node prev = null;
        while (current != null && current.data.compareTo(newReport) < 0) {
            prev = current;
            current = current.next;
        }

        if (prev == null) {
        	
            newNode.next = head;
            head = newNode;
        } else {
            newNode.next = current;
            prev.next = newNode;
        }
    }
    
    /**
     * fixNextCountyPointers Creates new pointers
     * based on county and organized by county
     */
    public void fixNextCountyPointers()
    {
        Node current = this.head;
        while(current!=null)
        {
            checkArrayList(current);
            
            Node temp = current.next;

            while(temp!=null && !temp.data.getCounty().equals(current.data.getCounty()))
                temp=temp.next;

            current.nextCounty = temp;
            
            current = current.next;
        }
    }
    
    /**
     * fixNextStatePointers Creates new pointers
     * based on state and organized by state
     */
    public void fixNextStatePointers()
    {
        Node current = this.head;
        while(current!=null)
        {
            checkArrayList(current);
            
            Node temp = current.next;
            while(temp!=null && !temp.data.getState().equals(current.data.getState()))
                temp=temp.next;

            current.nextCounty = temp;
            
            current = current.next;
        }
    }
    
    /**
     * checkArrayList Used to check the objects inside
     * an array list.
     * @param current The current Node
     */
    private void checkArrayList(Node current) {
        for(Node temp: heads)
        {
            if(temp.data.getCounty().equals(current.data.getCounty()))
                return;
        }
        heads.add(current);
        return;
    }

    /**
     * iterator Iterates through the data in the Report class
     * @param county Could be any object, but in this case is county-- 
     * used to determine the object to be searched for
     * @param start StartTime to be searched
     * @param end EndTime to be searched
     * @return iterator
     */
    public Iterator<Report> iterator(String county, String start, String end) {
        LocalDate s = myFileReader.dateConvert(start + " 00:00:00");
        LocalDate e = myFileReader.dateConvert(end + " 00:00:00");
        myItr iterator = new myItr(county, s, e);
        return iterator;
    }
    
    /**
     * myItr A class that implements the Iterator class
     * of type Report (class)
     */
    private class myItr implements Iterator<Report>
    {
        Node current = null;
        public myItr(String county, LocalDate start, LocalDate end)
        {
            for(Node temp: heads)
                if(temp.data.getCounty().equals(county)){
                    current = temp;
                    break;
                }
            // moving the current pointer to the according start date
            while(start.compareTo(current.data.getStartTime())<0)
                current = current.nextCounty;       
        }
        
        /**
         * hasNext Used to see if current "has next" item
         */
        @Override
        public boolean hasNext() {
            return current!=null;
        }

        /**
         * next Used to "peek" at the next item
         */
        @Override
        public Report next() {
            if(!hasNext())
                throw new NoSuchElementException();
            // TODO Auto-generated method stub
            Report temp = current.data;
            current=current.nextCounty;
            return temp;
        }
        
    }
  
}
