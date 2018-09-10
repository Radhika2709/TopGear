/*Write a JAVA program to reverse the given String S. Perform the reversal
operation if and only if the string S is equivalent to S1 are equal. (Perform
case-sensitive comparison). If the strings are not equal print “Reverse Not
Supported”.
Example: String S = “Hari”, S1 = “Wipro”, output should be “Reverse Not
Supported”.*/


package assignment1_Reversal;

import java.util.Scanner;

public class StringReversal {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String reverse="";
		
		System.out.print("Please Enter the String S: ");
		String userString1=sc.next();
		System.out.print("Please Enter the String S1: ");
		String userString2=sc.next();
		
		if(userString1.equals(userString2)) { //The comparison is case sensitive
			char[] charArr=userString1.toCharArray();
			for(int i=charArr.length-1;i>=0;i--) { 
				reverse+=charArr[i];
			}
			System.out.println(" The Reverse Of The String "+userString1+" is: "+reverse); 
		}
		else {
			System.out.println("Reverse Not Supported");
		}
		sc.close();
	}
}