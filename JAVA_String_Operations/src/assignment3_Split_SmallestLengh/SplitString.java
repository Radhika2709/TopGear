/*Create a JAVA program to split the strings based on the white-spaces, after
the split operation, print the string with the smallest length. */

package assignment3_Split_SmallestLengh;

import java.util.Scanner;

public class SplitString {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The String :");
		String userString= sc.nextLine();
		String chArray[]=userString.split("\\s+");
		String splitString;
		for(int i=0;i<chArray.length;i++) {
			for(int j=i+1;j<chArray.length;j++) {
				
				if(chArray[i].length()>chArray[j].length()){
					
					splitString=chArray[i];
					chArray[i]=chArray[j];
					chArray[j]=splitString;
				}
			}
		}
		System.out.println("String With The Smallest Length Is :"+chArray[0]);
		sc.close();	
	}
}
