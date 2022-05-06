// Array -> It is a collection of elements of same data type 
//1 2 3 4 

import java.util.Scanner;
public class Arr{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//int a[] ={1,2,3,4,12,12,23,22,12,133,43,44,55,46,77,44}; // inti. while declaring
		//int len = a.length;
		//System.out.println(len);
		
		System.out.println("Enter the size of the array :");
		int SIZE= sc.nextInt();
		int a[] = new int[SIZE];
		for(int i=0; i<a.length ;i++){

			System.out.println(" Enter the element at a[ "+i+" ] :");// a[0]: 
			a[i] = sc.nextInt();
		}//end of for 
		System.out.println("The elements of the array are : ");
		for(int i=0; i<a.length ;i++){

			System.out.print("  "+a[i]);
		}//end of for 

	}//end of main
}//end of class 


/*
	case 1 : for scanning
	case 2: for printing 
*/