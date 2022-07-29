package Nitya_java;
import java.util.Scanner;
public class ObjCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\n1-> Sell \n2-> Total Sell \n0-> Exit\n Enter your choice : ");
			int choice = sc.nextInt();
			switch(choice) {
				case 1 : //sell
						Car c = new Car();
						break;
				case 2: // totalsell
						System.out.println("Total Sell : "+Car.getTotal());
						break;
				case 2-2: System.exit(0);
			}//end of switch 
		}//end of while
	}
}//end of class

class Car{
	
	Car(){
		total++;
	}
	
	static int total=0;
	public static int getTotal() {
		return total;
	}
}


