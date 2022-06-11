package Nitya_java;
import java.util.Scanner;
public class BsicCal {
	//instance level 
	//functions -> 
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// c- > declare 
		BsicCal b = new BsicCal();  //-> constructor : to initialize its value in the memory 
	//classname	obj name   keyword  
		b.add();
		b.add();
	}
	void add() {
		System.out.println("enter two number to add :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("SUM : "+(a+b));
	}
}
// 2 methods 
// 1-> signup   2-> bill calculation 