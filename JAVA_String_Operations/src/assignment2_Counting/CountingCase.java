/*Write a JAVA program to count the total upper-case and lower-case
characters of a String T. After counting, print them if and only if the count is
not equal. If the count is equal, print “Equally Distributed”.*/

package assignment2_Counting;

import java.util.Scanner;

public class CountingCase {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int countLower=0,countUpper=0;
		System.out.print("Enter The String: ");
		String T=sc.next();
		char[] temp = T.toCharArray();
		for(int i=0;i<temp.length;i++) {
			if(temp[i]>=65 && temp[i]<=90){
				countUpper++;
			}
			else {
				if(temp[i]>=97 && temp[i]<=122) {
				countLower++;
				}
			}
		}
		if(countUpper==countLower) {
			System.out.println("Equally Distributes");
		}
		else{
			System.out.println("The Total Number Of Lower Case Letters Are: "+countLower);
			System.out.println("The Total Number Of Upper Case Letters Are: "+countUpper);
		}
		sc.close();
	}

}
