import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*Insert element into sorted list 
Given a sorted list with an unsorted number V in the right-most cell, 
can you write some simple code to insert V into the array so it remains sorted?

Print the array every time a value is shifted in the array until the array is fully sorted. 
The goal of this challenge is to follow the correct order of insertion sort.

Guideline: You can copy the value of V to a variable, and consider its cell "empty". 
Since this leaves an extra cell empty on the right, you can shift everything over until V can be inserted. 
This will create a duplicate of each value, but when you reach the right spot, you can replace a value with V.

Input Format 
There will be two lines of input:
s - the size of the array
ar - the sorted array of integers

Output Format 
On each line, output the entire array every time an item is shifted in it.

*/

public class InsertionSortI {
	public static void insertIntoSorted(int[] ar) {
		// Fill up this function  
	    // Set the last one in the array as "key"
	    int key = ar[ar.length - 1];
	    //Looping through the entire "sorted" array
	    for(int i = ar.length - 1; i > 0; i--){
	        //If the key is less than the element set in front of it
	        if (key < ar[i-1]){
	            //Copy the value of the bigger one to the position of the key
	            ar[i] = ar[i-1];
	            printArray(ar);
	        }else{
	            //If not, meaning that the array is sorted, print and return
	            ar[i] = key;
	            printArray(ar);
	            return;
	        }
	    }
	    //If the "else" statement was never reached, then meaning that the key is the smallest value, set it 
	    //at the beginning of the array
	    ar[0] = key;
	    printArray(ar);
	        
	}
	    
	    
	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int s = in.nextInt();
	    int[] ar = new int[s];
	    for(int i=0;i<s;i++){
	    	ar[i]=in.nextInt(); 
	    }
	    insertIntoSorted(ar);
	}
	    
	    
	private static void printArray(int[] ar) {
		for(int n: ar){
			System.out.print(n+" ");
	    }
	        System.out.println("");
	}

}

	