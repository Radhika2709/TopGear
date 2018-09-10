/*Create a JAVA program to sort the characters of the string S. After sorting,
extract the odd-positioned characters and store it into a string variable and
print it.*/

package assignment9_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The String :");
		String userString= sc.next();
		String newString="";
		char[] chArray= userString.toCharArray();
		
		Arrays.sort(chArray);//The sort is case sensitive
		System.out.println("The String After Sorting Is :");
		for(int i=0;i<chArray.length;i++){
			System.out.println(chArray[i]);
		}
		System.out.print("The Odd Positioned Characters Are: ");
		for(int i=0;i<chArray.length;i++){
			if(i%2!=0){
				newString+=chArray[i];
			}
		}
		System.out.println(newString);	
		sc.close();
	}
}