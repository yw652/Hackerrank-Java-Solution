import java.util.*;

public class RemoveDuplicate {
	public static void main(String args[]){
		String testing = "abcddefg";
		char [] character = new char[8];
		for (int i = 0; i <= testing.length()-1; i++){
			character[i] = testing.charAt(i);
		}
		removeDuplicates(character);
	}
	
	/*This algorithm is designed to push the duplicate property to the end of the 
	 * array and make it 0 to get rid of it. 
	 */
	public static void removeDuplicates(char[] str) {
		if(str == null) return;
		int len = str.length;
		if(len < 2) return;
		//variable 'tail' is a pointer to the array at where is the duplicate character stays
		int tail = 1;
		for(int i = 1; i < len; ++i){
			System.out.println("The value of i is " + i);
			int j;
			for(j = 0; j < tail; ++j){
				System.out.println("The value of j is " + j);
				
				if (str[i] == str[j]) break;
				
			}
			if(j == tail){
				str[tail] = str[i];
				++tail;
				System.out.println("The value of tail is " + tail);
				
			}
			System.out.println(Arrays.toString(str));
			System.out.println();
		}
		str[tail] = 0;
		System.out.println(Arrays.toString(str));
	}
		
		
}
