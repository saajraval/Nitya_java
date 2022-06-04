package Nitya_java;
import java.util.Scanner;
public class Calc{

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter two numbers :");
		int n1 =sc.nextInt();
		int n2= sc.nextInt();

// printf() printf("\n ")
// 3 + 4 = 7 
// without using sum as 3rd 

		int sum = n1+n2;
		System.out.println("Sum : "+sum);
		System.out.println(n1+" + " + n2 + " = " +sum);

		System.out.println("Sum : "+(n1+n2));
	}//end of main
} // end of class calc

//switch + - / * % 