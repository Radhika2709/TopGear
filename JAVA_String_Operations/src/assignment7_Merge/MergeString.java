/*Create a JAVA program to merge two given strings S1 and S2. Perform
merge operation by taking single character from each string.
Example: If the string S1 = “ABC”, S2= “DEF”, Output: ADBECF.*/

package assignment7_Merge;

import java.util.Scanner;

public class MergeString {
	
public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter The First String: ");
        String userString1=sc.next();
        System.out.print("Please Enter The Second String: ");
        String userString2=sc.next();
        String newString="";
        
        if(userString1.length()>userString2.length()){
        
        for(int i=0;i<userString1.length();i++){
            if(i<userString1.length()){
                newString+=userString1.charAt(i);
            }
            if(i<userString2.length()){
                newString+=userString2.charAt(i);
            }
        }
          System.out.println("The New String is :"+newString);
          sc.close();
    }
}
}
