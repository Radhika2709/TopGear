/*Create a JAVA program to split the strings based on white-spaces, after th
split operation, print all the strings in the dictionary order.*/

package assignment4_Split_DictionaryOrder;

import java.util.Arrays;
import java.util.Scanner;

public class DictionaryOrder {
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter The String: ");
		String userString=sc.nextLine();
		String[] strArray = userString.split(" ");
		
		System.out.println("The String After The Split is: ");
		for(int i=0;i<strArray.length;i++){
			System.out.println(strArray[i]);
		}
		
		Arrays.sort(strArray);
		System.out.println("The Dictionary Order is: ");
		for(int i=0;i<strArray.length;i++){
			System.out.println(strArray[i]);//Case sensitive print
		}
		sc.close();
	}
}