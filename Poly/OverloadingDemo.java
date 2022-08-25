package Nitya_java.Poly;

public class OverloadingDemo {
	public static void main(String[] args) {
		OverloadingDemo ov = new OverloadingDemo();
		ov.print();
		ov.print(7);
		ov.print("Raj");
		ov.print(3, 4);
		System.out.println("=====================");
		
		TestOverloading tov= new TestOverloading();
		tov.print(4, 5);
		
	}//end of main
	
	
	
	void print() {
		System.out.println("print()");
	}
	void print(int a) {
		System.out.println("print(int) : "+a);
	}
	
	void print(String name) {
		System.out.println("print(String )"+ name);
	}
	void print(int a,int b) {
		System.out.println("print(int , int ) : "+ (a+b));
	}
}//end of class 

class TestOverloading extends OverloadingDemo{
	void print(int a ,int b) {
		System.out.println("Chile : print(int ,int ) "+(a+b));
	}
}//end of class