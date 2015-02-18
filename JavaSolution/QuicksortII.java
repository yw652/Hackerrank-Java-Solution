import java.util.*;

/*
 * In the previous challenge, you wrote a partition method to split an array into 2 sub-arrays, 
 * one containing smaller elements and one containing larger elements. 
 * This means you 'sorted' half the array with respect to the other half. 
 * Can you repeatedly use partition to sort an entire array?
 * In this challenge, print your array every time your partitioning method finishes, 
 * i.e. print every sorted sub-array 
 * The first element in a sub-array should be used as a pivot. 
 * Partition the left side before partitioning the right side. 
 * The pivot should not be added to either side. Instead, put it back in the middle when combining the sub-arrays together.
 * 
 * Input Format 
 * There will be two lines of input:
 * n - the size of the array
 * ar - the n numbers of the array
 * 
 * Output Format 
 * Print every partitioned sub-array on a new line.
 */

public class QuicksortII {
	static int hackerrankPartition(int[] ar, int p, int r) {
		//p:the beginning index
		//r:the ending index
		
		//Use the first element as pivot
		int x = ar[p];
		List<Integer> smaller = new ArrayList<Integer>();
		List<Integer> bigger = new ArrayList<Integer>();

		for(int j = p+1; j<=r;j++){
			if(ar[j] <= x){
				smaller.add(ar[j]);
			}else{
				bigger.add(ar[j]);
			}
		}
		
		int j;
		for(j = 0; j< smaller.size();j++){
			//Cast element to an integer
			ar[p+j] = (Integer)smaller.toArray()[j];
		}
		
		//Set the pivot to be the last element of the array with smaller elements
		ar[p+smaller.size()] = x;
		
		for(j = 0; j < bigger.size();j++){
			ar[smaller.size()+p+j+1] = (Integer)bigger.toArray()[j];
		}
		//Return the pivot position
		return p+smaller.size();
	}
    static void hackerrankQuickSort(int[] ar, int p, int r){
        if(p<r){
        	//Recursive call
            int q = hackerrankPartition(ar,p,r);
            hackerrankQuickSort(ar,p,q-1);
            hackerrankQuickSort(ar,q+1,r);
            printArray(ar, p, r);
        }
    }
    static void printArray(int[] ar, int p, int r) {
        for(int i = p; i <=r;i++){
            System.out.print(ar[i]+" ");
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
        hackerrankQuickSort(ar,0,ar.length-1);
    }
}