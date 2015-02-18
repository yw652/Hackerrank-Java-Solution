import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

/*James found a love letter his friend Harry has written for his girlfriend. 
 * James is a prankster, so he decides to meddle with the letter. 
 * He changes all the words in the letter into palindromes.
 To do this, he follows 2 rules:

(a) He can reduce the value of a letter, e.g. he can change 'd' to 'c', but he cannot change 'c' to 'd'. 
(b) In order to form a palindrome, if he has to repeatedly reduce the value of a letter, 
he can do it until the letter becomes 'a'. Once a letter has been changed to 'a', it can no longer be changed.

Each reduction in the value of any letter is counted as a single operation. 
Find the minimum number of operations required to convert a given string into a palindrome. 

Input Format 
The first line contains an integer T, i.e., the number of test cases. 
The next T lines will contain a string each. The strings do not contain any spaces.

Output Format 
A single line containing the number of minimum operations corresponding to each test case.
*/


public class LoveLetterMystery {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        for (int i = 0; i < size; i++){
            char [] charArray = in.next().toCharArray();
            int count = 0;
            for (int j = 0; j < charArray.length / 2; j++){
                char first = charArray[j];
                char last = charArray[charArray.length - 1 - j];
                //Compare letters using natural ordering
                if (first>last){
                    while(first != last){
                        first--;
                        count++;
                    }
                } else if (first<last) {
                    while(last != first){
                        last--;
                        count++;
                    }
                } 
            }
            System.out.println(count);
        }
    }
}
