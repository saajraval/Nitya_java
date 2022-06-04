package Nitya_java;

import java.util.Scanner;
public class StrRev{
//1 2 3 4 => size -1
//sum=0 sum +=i
	public static void main(String[] args ){

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String to reverse:");
		String str=sc.nextLine();
		System.out.println("The reverse of the string is : ");
		for(int i= str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}
	}//end of main
}//end of class

//1221 1221 -> palindrome 
// kanak -> kanak