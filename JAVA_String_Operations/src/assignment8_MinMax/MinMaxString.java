/*Create a JAVA program to find the maximum and minimum occurred
character in a String.*/

package assignment8_MinMax;

import java.util.Scanner;

public class MinMaxString {
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The String :");
		String userString= sc.next();
		int minOccur=200,maxOccur=0;
		char minChar=0,maxChar=0;
		char chArray[]= userString.toCharArray();
		
		for(int i=0;i<chArray.length;i++) {
			int counter=0;
			for(int j=0;j<chArray.length;j++) {
				if(chArray[j]==chArray[i]) {
					counter++;
				}
			}
			if(counter>=maxOccur) {
				maxOccur=counter;
				maxChar=chArray[i];
			}
			if(counter<=minOccur) {
				minOccur=counter;
				minChar=chArray[i];
			}
			
		}//for
		System.out.println("The Minimum Occuring Character Is :"+minChar);
		System.out.println("The Number Of Times "+minChar+" Ocurred Is :"+minOccur);
		System.out.println("The Minimum Occuring Character Is :"+maxChar);
		System.out.println("The Number Of Times "+maxChar+" Ocurred Is :"+maxOccur);
		sc.close();
	}
	

}

