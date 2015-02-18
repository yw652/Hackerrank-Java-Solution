import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 * Can you modify your previous Insertion Sort implementation to keep track of the number of shifts it makes while sorting? 
 * The only thing you should print is the number of shifts made by the insertion sort algorithm to completely sort the array. 
 * A shift occurs when an element's position changes in the array. (Do not shift an element if it is not necessary.)
 
 * Input Format 
 * The first line contains N, the number of elements to be sorted. The next line contains N integers a[1],a[2]...,a[N].
  
 * Output Format 
 * Output the number of shifts it takes.
 */

public class RunningTimeAlgorithm {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
                ar[i]=in.nextInt(); 
        }
        int count = 0;
        
        for(int i = 1; i < ar.length; i++){
            int value = ar[i];
            int j = i - 1;
            while(j >= 0 && ar[j] > value){
                ar[j + 1] = ar[j];
                j = j - 1;
                count++;
            }
            ar[j + 1] = value;
            //count++;
        }
        System.out.println(count);

    }
}
