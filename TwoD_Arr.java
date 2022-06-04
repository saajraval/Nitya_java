package Nitya_java;



import java.util.Scanner;

public class TwoD_Arr{
	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);
		/* int a[][] = { {1,2,3}, 
			      { 4,5,6 },
			      {7,8,9} };
		int b[][] = { {11,12,13}, 
			      { 14,15,16 },
			      {17,18,19} };
		*/

		System.out.println("Enter the rows and cols for array 1 :");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		
		System.out.println("Enter the rows and cols for array 2 :");
		int r2=sc.nextInt();
		int c2=sc.nextInt();

		int a[][] = new int [r1][c1];
		int b[][] = new int [r2][c2];

		System.out.println("Enter the elements for array one : \n");
		for(int i =0 ;i<r1;i++){ //a[0][0] : 
			for(int j=0;j<c1;j++){
				System.out.println("a["+i+"]["+j+"]: ");//a[0][0] : 
				a[i][j] =sc.nextInt();
			}
		}		


		System.out.println("Enter the elements for array two : \n");
		for(int i =0 ;i<r2;i++){ //a[0][0] : 
			for(int j=0;j<c2;j++){
				System.out.println("b["+i+"]["+j+"]: ");//a[0][0] : 
				b[i][j] =sc.nextInt();
			}
		}


		System.out.println("The array 1 is : \n ");
		for(int i =0;i<r1;i++){
			for(int j=0;j<c1;j++){
				System.out.print(" "+a[i][j]);
			}
			System.out.println("");
		}//end of rows
	
		System.out.println("The array 2 is : \n ");
		for(int i =0;i<r2;i++){
			for(int j=0;j<c2;j++){
				System.out.print(" "+b[i][j]);
			}
			System.out.println("");
		}//end of rows		

		if(r1==r2 && c1==c2){

		int c[][]= new int[r1][c1];

		for(int i =0;i<r1;i++){
			for(int j =0;j<c1;j++){
				c[i][j] = a[i][j]+ b[i][j];
			}
		}
		System.out.println("The Addition of two matrices is : \n ");
		for(int i =0;i<r1;i++){
			for(int j =0;j<c1;j++){
				System.out.print(" "+c[i][j]); 
			}
			System.out.println(" ");
		}
		}//end of if

		else{
			System.out.println(" The addition is not possible !!");
		}			
	}//end of main
}