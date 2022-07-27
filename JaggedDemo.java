package Nitya_java;
import java.util.Scanner;

public class JaggedDemo {

//	Scanner sc = new Scanner(System.in);///class level object 
	public static void main(String[] args) {
		//JaggedDemo jd= new jaggedDemo();
		System.out.println("Enter the number of rows "); // rows fixed 
		//int r = jd.sc.nextInt();
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int a[][] = new int [r][];
		
		for(int i=0;i<a.length;i++) {// rows 
			System.out.println("Enter the number of records you want to store in "+ (i+1)+" row");
			int x = sc.nextInt();
			a[i]= new int[x];// 1 -> 3 , 2-> 4
 			
		}//end of for
		
		for(int i=0;i<a.length;i++) {
			for(int j =0;j<a[i].length;j++) {
				System.out.println("Enter the data");
				a[i][j]= sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j =0;j<a[i].length;j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}//end of print 
	}//end of main
}//end of class

