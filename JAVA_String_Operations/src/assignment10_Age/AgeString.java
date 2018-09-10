/*Write a JAVA program to compute the string age. Age of the string can be
calculated using the formula:
Age = Length of the string S + Alphabetical index of the last-character.
Example: If the string is “ABAB”, output = (4+2) = 6.*/

package assignment10_Age;

import java.util.Scanner;

public class AgeString {
	
public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The String :");
		String userString= sc.next();
		
		String lowerString=userString.toLowerCase();
		char[] stringAge=lowerString.toCharArray();
		int alphaIndex=(int)stringAge[stringAge.length-1];
		int position = alphaIndex-96;
		int stringAge1=userString.length()+position;
		System.out.println("The Age of "+userString+" is: "+stringAge1);
		sc.close();
		}
}
