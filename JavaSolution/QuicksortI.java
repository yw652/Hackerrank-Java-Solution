import java.lang.*;
import java.util.*;

/*You're given an array ar and a number p. 
 * Partition the array, so that, all elements greater than p are to its right, and all elements smaller than p are to its left.
 * In the new sub-array, the relative positioning of elements should remain the same, 
 * i.e., if n1 was before n2 in the original array, it must remain before it in the sub-array. 
 * The only situation where this does not hold good is when p lies between n1 and n2
 * i.e., n1 > p > n2.
 * Guideline - In this challenge, you do not need to move around the numbers 'in-place'. 
 * This means you can create 2 lists and combine them at the end.
 * 
 * Input Format
 * You will be given an array of integers. The number p is the first element in ar.
 * There are 2 lines of input:
 * n - the number of elements in the array ar
 * the n elements of ar (including p at the beginning)
 * 
 * Output Format 
 * Print out the numbers of the partitioned array on one line.
 */

public class QuicksortI {
	static void partition(int[] ar) {
		int key = ar[0];
        ArrayList <Integer> listSmall = new ArrayList<Integer>();
        ArrayList <Integer> listLarge = new ArrayList<Integer>();
        for (int i = 1; i <= ar.length - 1; i++){
        	int element = ar[i];
            if (element < key){
            	listSmall.add(element);
            } else if (element > key){
                listLarge.add(element);
            } 
        }
            listSmall.add(key);
            listSmall.addAll(listLarge);
            for(int n: listSmall){
            	System.out.print(n+" ");
            }
            System.out.println("");
    }   
	
	static void printArray(int[] ar) {
		for(int n: ar){
			System.out.print(n+" ");
        }
        System.out.println("");
    }
       
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
        	ar[i]=in.nextInt(); 
        }
        partition(ar);
    }    
}