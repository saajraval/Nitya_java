package Nitya_java.inh;
import java.util.Scanner;
public class Amazon {

	public static void main(String[] args) {
		//IndianProduct p = new IndianProduct();
		IndianProduct ip[] = new IndianProduct[3];
		NonIndianProduct nip[] = new NonIndianProduct[3];
		int indCount =0,nonIndCount =0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("\n 1 -> Insert \n 2 -> Display \n 0 -> Exit \n Enter your choice :");
			int choice =sc.nextInt();
			switch (choice) {
				case 1: System.out.println("\n 1 -> For Indian Product \n 2 -> For Non Indian Product \n Enter your choice ");
						int subChoice = sc.nextInt();
						if(subChoice == 1 ) {
							//indian
							ip[indCount] = new IndianProduct();
							ip[indCount].getData(); // 0 
							ip[indCount].calculateDiscount();//0
							indCount++;
							
						}
						else if (subChoice == 2) {
							//non indian
							nip[nonIndCount] = new NonIndianProduct();
							nip[nonIndCount].getData();
							nip[nonIndCount].calcuateDuty();
							nonIndCount++;
						}
						else {
							System.out.println("\n Invalid choice!!");
						}
						break;
				case 2: // display
						System.out.println(" Indian Products : ");
						for(int i=0;i< indCount;i++) {
							ip[i].display();
						}
						System.out.println(" Non Indian Products : ");
						for(int i=0;i<nonIndCount;i++) {
							nip[i].display();
						}
						break;
				case 2-2 : System.exit(0);
			}//end of choice
		}//end of while
	}//end of main
}//end of class


class Product {
	String name;
	int price,qty;
	void getData() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Name of the product  : ");
		name = sc.nextLine();// iphone 13
		System.out.println("Enter Price of the product  : ");
		price = sc.nextInt();
		System.out.println("Enter Quantity of the product  : ");
		qty = sc.nextInt();
	}//end of void getData
	
	int a =7;
	
	void display () {
		System.out.println(" "+name +"  "+ price+ "  "+qty);
	}//end of display
}//end of class product 

class IndianProduct extends Product{
	int disc;
//	int a ;

	// price
	float discPer;
	public IndianProduct() {
//		this.a = super.a; // product to -> indianProduct
		this.discPer = 5;
	}
	void calculateDiscount() {
		this.disc = (int) (this.price*this.discPer)/100; 
	}
	
	void display() {
		super.display();// parent class -> 3  
		System.out.println("Discount : "+disc);
	}
	
}//end of class

//this 
class NonIndianProduct extends Product{
	
	int duty;
	float dutyPer;
	public NonIndianProduct() {
		this.dutyPer =5;
	}
	
	void calcuateDuty() {
		this.duty = (int)(this.dutyPer*this.price)/100;
	}
	void display() {
		super.display();  
		System.out.println("Duty tax : "+duty);
	}
}//end of class