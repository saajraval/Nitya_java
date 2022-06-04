package Nitya_java;

/*


	case 1: prime 
	case 2: reverse 
	case 3: palindrome 
	case 4: Armstrong 
	case 5 : Prime in Range 
	case 6: Armstrong in range 
*/

import java.util.Scanner;

public class Numbers{

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a number to check:");
		int num=sc.nextInt();

		System.out.println("1 To check whether the number is Prime or not !");
		System.out.println("2 To check whether the number is Reverse or not !");
		System.out.println("3 To check whether the number is Palindrome or not !");
		System.out.println("4 To check whether the number is Armstrong or not !"); // 1 1000 -> 153 370 371
		System.out.println("5 To check whether the number is Prime or not  in a range!");
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();

		switch(choice){
			case 1: int cnt =0; // 3 
				for(int i=1;i<=num;i++){ // 1 2 3 4
					if(num%i == 0 ){ // 3%3 == 0
						cnt++; // 2
					}//
				}
				if(cnt == 2){
					System.out.println("The number is Prime !!");
				}
				else{
					System.out.println("The number is Composite !!");
				}
				break;
		
			case 2: System.out.println("The reverse of the number is :");
	
				//123
				int r, rev=0;
				while(num>0){ // 1  
					r= num%10;  // 1 
					rev = rev*10+ r; // 321
					num/=10;  //0   num =num/10   
				}//end of while 
				System.out.print(" "+rev);
			
				break;

			case 5: 
				System.out.println("Enter the lower limit:");
				int n1=sc.nextInt();
				System.out.println("Enter the upper limit:");
				int n2=sc.nextInt();
				int i;
				for(int j=n1;j<=n2;j++){ //13  14 .....20
					int c=0;
					for( i=1;i<=j;i++){ // 
						if(j%i == 0 ){ 
							c++; // 2
						}//end od if
					}//end of inner for
					if(c == 2){
						System.out.println(" "+j);
					}
				}//end of outer for 
		}//end of switch
	}//end of main
}//end of class