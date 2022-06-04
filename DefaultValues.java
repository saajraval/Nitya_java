package Nitya_java;
/*
	3 - > primary , derived user defined 

		
	primitive and non primitive 

	primitive => byte -> 0 char -> null  boolean -> False short -> 0 int ->0 float - >0.0f double 0.0 

	default constructor is automatically called by the java compiler and is used to initialize the default values to the variables 

	class A{
		
		A(){
			
		}
	}

	max of three numbers : 


*/

public class DefaultValues {
		short s;
		char ch;
		boolean b;
		

		void display(){
			System.out.println(" The default values of short is  :"+s);
		}

		public static void main(String args[]){
		
		DefaultValues dv = new DefaultValues();
		dv.display();
		System.out.println(" Char default value is : "+dv.ch);
		System.out.println(" Boolean default value is : "+dv.b);
			
	}//end of main
}//end of class