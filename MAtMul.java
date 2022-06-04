package Nitya_java;
//A => 1 2         B =>1 2 0
//	 -1 0 		   1 -1 3 
import java.util.Scanner ;   
public class MAtMul{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and col for matrix one :");
		int r1 =sc.nextInt();
		int c1 = sc.nextInt();
		int a[][] = new int [r1][c1];
		
		System.out.println("Enter the number of rows and col for matrix two :");
		int r2 =sc.nextInt();
		int c2 = sc.nextInt();		
		int b[][] = new int [r2][c2];
		int c[][] = new int [r1][c2];

// A = 2*2 
//B = 2*3
//
//Product  = 2*3

		if(c1 == r2 ){

		for(int i =0;i<r1;i++){
			for(int j=0;j<c1;j++){
				System.out.println("a["+i+"] [ "+j+"] : "); //a[0][0]
				a[i][j] = sc.nextInt();			
			}
		}//end of scanning of matrix one

		for(int i =0;i<r2;i++){
			for(int j=0;j<c2;j++){
				System.out.println("b["+i+"] [ "+j+"] : "); //b[0][0]
				b[i][j] = sc.nextInt();			
			}
		}//end of scanning of matrix two

		for(int i =0;i<r1;i++){
			for(int j=0;j<c1;j++){
				System.out.print(" "+a[i][j]); 			
			}
			System.out.println(" ");
		}//end of printing of matrix one
		

		for(int i =0;i<r2;i++){
			for(int j=0;j<c2;j++){
				System.out.print(" "+b[i][j]); 			
			}
			System.out.println(" ");
		}//end of printing of matrix two

// the loops will till what we checked for compatiblity
		for(int i=0 ; i<c1;i++){//0
			for(int j =0;j<r2;j++){//1
				c[i][j] =0;
				for(int k=0;k< c2;k++){ // 2
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		for(int i =0;i<r1;i++){
			for(int j=0;j<c2;j++){
				System.out.print(" "+c[i][j]); 			
			}
			System.out.println(" ");
		}//end of printing of  product matrix 
		}//end of if
		else{
			System.out.println("The matrices are not compatible for multiplication !!");
		}
	}//end of main
}//end of class