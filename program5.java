/**
 * program5 - A main method for a file to be read and 
 * its data printed to the console window.
 * @author Professor Mansouri  and esther greene 
 * @version March 4, 2024
 */

package accidentpack;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.*;

public class program5 {
	
	/**
	 * main A main method used to print out a CSV file to the console window
	 * @param args An array of type String
	 * @throws FileNotFoundException
	 */
    public static void main(String[]args) throws FileNotFoundException
    {
    	
		System.out.println("Please enter a STATE and a DATE" + "\n(ex. IL 2022-09-08) ");
		
    	// scanner
    	Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();


        myLinkedList linkedlist = myFileReader.readFileToLinkedList("C:\\Users\\eggyc\\Downloads\\accidents.csv", "OHo");
        System.out.println("Done");
        linkedlist.fixNextStatePointers();;
        binarySearchTree bst  = new binarySearchTree(linkedlist);  
        bst.inOrderPrint();
          Iterator<Report> itr = linkedlist.iterator("Bernalillo", "2021-01-01", "2021-03-01");
          while(itr.hasNext())
              System.out.println(itr.next().toString());
        
        System.out.println();
    }


}
