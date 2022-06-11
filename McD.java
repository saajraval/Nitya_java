package Nitya_java;
import java.util.Scanner;
public class McD {
// polymorphism inher. construc .class objects 
	// qt_bur += tempQty //3+4 =7 
	// default -> access 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User x =new User();
		x.signup();
		int choice,tempQty;
		while(true) {
			System.out.println("item no\tItem name\tPrice($)");
			System.out.println("1\tMc Burger\t25");
			System.out.println("2\tPizza\t100");
			System.out.println("3\tPasta\t120");
			System.out.println("4 Check out with Bill and exit");
			System.out.println("Enter your choice !!");
			choice = sc.nextInt();
			switch(choice) {
			case 1: System.out.println("You have selected McBurger");
					System.out.println("How much quantity for burger ?");
					tempQty = sc.nextInt();
					if(x.qty_bur+x.qty_pas+x.qty_piz+tempQty<=30) {
					if(x.qty_bur + tempQty >10) {//
						System.out.println("Please enter the quantity less then 10!! \n You can buy more : "+(10 - (x.qty_bur)));
						
					}
					else {
						x.qty_bur+= tempQty;
					}
					}//end of outer if
					else {
						System.out.println("You have  quantity left :"+ (30-(x.qty_bur+x.qty_pas+x.qty_piz)));
					}
					break;
			case 2: System.out.println("You have selected Pizza");
				System.out.println("How much quantity for Pizza ?");
				tempQty = sc.nextInt();
				if(x.qty_bur+x.qty_pas+x.qty_piz+tempQty<=30) {
					if(x.qty_piz + tempQty >10) {
					System.out.println("Please enter the quantity less then 10!!");
				
				}
				else {
					x.qty_piz+= tempQty;
				}
			}//end of outer if
			else {
				System.out.println("You have  quantity left :"+ (30-(x.qty_bur+x.qty_pas+x.qty_piz)));
			}
				break;
			case 3: System.out.println("You have selected Pasta");
				System.out.println("How much quantity for Pasta ?");
				tempQty = sc.nextInt();
				if(x.qty_bur+x.qty_pas+x.qty_piz+tempQty<=30) {
					if(x.qty_pas + tempQty >10) {
					System.out.println("Please enter the quantity less then 10!!");
				}
				else {
					x.qty_bur+= tempQty;
				}
		}//end of outer if
		else {
			System.out.println("You have  quantity left :"+ (30-(x.qty_bur+x.qty_pas+x.qty_piz)));
		}
				break;
			case 4: x.bill();
				System.out.println("Thank you !! \nVisit again!!");
				System.exit(0);
			}//end of choice
		}//end of while
	}//end of main
}//end of class McD 

class User{
	// void sign up
	// bill
	int qty_bur,qty_piz,qty_pas,mobNum,total,tax;// 0 
	String name;
	void signup() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first name :");
		name = sc.nextLine();
		System.out.println("Please enter mobNum");
		mobNum =sc.nextInt();
	}//end of signup
	
	void bill() {
		total = (qty_bur*25)+(qty_pas*120)+(qty_piz*100);
		tax = (int)(total*0.1);// 10/100 -> 0.1
		total+=tax;
		System.out.println("Total : "+total);
	}//end of bill
}//end of user
