import java.io.*;
import java.util.*;

/*
 * In Insertion Sort Part 1, you sorted one element into an array. 
 * Using the same approach repeatedly, can you sort an entire unsorted array?

Guideline: You already can place an element into a sorted array. 
How can you use that code to build up a sorted array, one element at a time? 
Note that in the first step, when you consider an element with just the first element 
- that is already "sorted" since there's nothing to its left that is smaller than it.

In this challenge, don't print every time you move an element. 
Instead, print the array every time an element is "inserted" into the array in (what is currently) its correct place. 
Since the array composed of just the first element is already "sorted", begin printing from the second element and on.

Input Format 
There will be two lines of input:
s - the size of the array
ar - the list of numbers that makes up the array

Output Format 
On each line, output the entire array at every iteration
 */

public class InsertionSortII {

    public static void insertionSortPart2(int[] ar){
        // Fill up the code for the required logic here
        // Manipulate the array as required
        // The code for Input/Output is already provided
        for (int i = 1; i <= ar.length - 1; i++){
            int key = ar[i];
            
            //The index of the previous element
            int j = i-1;
            
            //While the index is still in range and the key is smaller than the previous element
            while((j >= 0) && (key < ar[j])){
                
            	//Copy the previous element to the key's current position
                ar[j+1] = ar[j];
                
                //Decrement the index to move the cursor to the next available previous element
                j -= 1;
            }
            
            //Set key to the new sorted position
            ar[j+1] = key;  
            printArray(ar);
        }
        
    }  
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
    	for(int n: ar){
    		System.out.print(n+" ");
        }
        System.out.println("");
   }
}
