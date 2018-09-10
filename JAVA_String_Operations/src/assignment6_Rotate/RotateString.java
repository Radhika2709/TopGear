/*Create a JAVA program to rotate the string by clock-wise direction if the
length is even and to rotate the string to the anti-clockwise direction if the
length is odd. Perform one rotation at any case.
*/

package assignment6_Rotate;

import java.util.Scanner;

public class RotateString{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the String: ");
        String userString=sc.next();
        char[] strArray= userString.toCharArray();
        
        if(userString.length()%2==0){
            System.out.println("The Length Of The String Is Even :");
            System.out.print(strArray[strArray.length-1]);
            for(int i=0;i<strArray.length-1;i++){
                System.out.print(strArray[i]);
            }
        }
        else{
            System.out.print("The Length Of The String Is Odd :");
            for(int i=1;i<strArray.length;i++){
                System.out.print(strArray[i]);
            }
             System.out.print(strArray[0]);
        }
        sc.close();
    }
}

