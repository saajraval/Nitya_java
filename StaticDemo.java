package Nitya_java;
import java.util.Scanner;
public class StaticDemo {
	//class 
	//local 
	
	//static -> method , variable
	
	public static void main(String[] args) {
	
		TestStatic ts = new TestStatic();
		ts.num = 100;
//		ts.x = 2000;
		System.out.println("num: "+ts.num);//100
		System.out.println("x : "+ ts.x);//2000
		
		TestStatic ts1 = new TestStatic();
		ts1.x = 7;
		System.out.println("object 2 : num: "+ts1.num);//
		System.out.println("object 2 : x : "+ ts1.x);//
		System.out.println("object 1 : x : "+ ts.x);//
		
		System.out.println("====================================");
		
		ts.add();
		ts.print();
	}//end of main
}//end of class

class TestStatic{
	int num;//   they will create n ref. for n no. of objects 
	static int x; // one copy of the variable 
	
	void add() {
//		num = 70;
//		x = 700;
		System.out.println(num);
		System.out.println(x);
	}
	
	static void print() {
		int num1 = 70; // local variable 
		System.out.println(num1);// 70
//		num = 70;
		x = 700;
		System.out.println(x);// 
	}
}//end of class