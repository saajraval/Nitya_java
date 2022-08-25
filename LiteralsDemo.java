package Nitya_java;

public class LiteralsDemo {

	public static void main(String[] args) {
		int a = 10 ;//10
		float f = 12.22f;
		double d = 22.47;
		char ch = 'a';
		char ch2 ='\u0000';
		// java -> Unicode -> ASCII Code 
		// A -> 65 
		// UNICODE -> A -> 
		// A - uncode -> Asci 
		char c = '\u0041';
		System.out.println("A -> "+ c);
//		char ch1 = 'sad';
		String s = "Sad";
		
		// number system -> binary , octal , decimal , hexadecimal 
		
		int h0 = 0b10; // binary 
		int h1 = 100;//decimal 
		int h2 = 0100;// octal 
		int h3 = 0X1234F3; // hexadecimal 
		
		int  x = 10_00_00; 
		System.out.println(" X : "+ x);
	}//end of main
	
}//end of class
