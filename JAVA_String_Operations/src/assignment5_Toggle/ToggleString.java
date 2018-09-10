/*Toggle the strings using JAVA. Toggling is the process of converting the
uppercase characters to lower case and vice versa.*/

package assignment5_Toggle;

import java.util.Scanner;

public class ToggleString {
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter The String: ");
		String userString=sc.nextLine();
		char[] temp=userString.toCharArray();
		for(int i=0;i<temp.length;i++) {
			if(temp[i]>=65 && temp[i]<=90){
				temp[i]+=32;
			}
			else {
				if(temp[i]>=97 && temp[i]<=122){
					temp[i]-=32;
				}
			}
		}
		System.out.print("The Toggled String is: ");
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]);//Case sensitive print
		}
		sc.close();
	}
}
