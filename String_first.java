import java.util.Scanner;

public class String_first{

	public static void main (String [] args){

		Scanner sc =new Scanner(System.in);
		/*
		String str ="Hello";
		String str2 ="";
		System.out.println(str);
		//str2=str.concat("World");
		//System.out.println(str2);
		System.out.println(str.concat(" Wolrd"));

		System.out.println("Enter your name :");
		//String s1= sc.next();
		String s1 =sc.nextLine();
		System.out.println(s1+" is your name!!!");

		unicode -> ASCI 
		*/

		String s1= "saaj";
		String s2="SAAJ";
		String s3="S";
		
		// 3 ways  -> ==  	// true false  -> boolean 
		// 		equals() // true false 
		//		compareTo()
	
		/*
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s1));
		System.out.println(s3.compareTo(s2));
		*/
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s2.length());//will return the length of the string
		System.out.println(s2.charAt(0));
	}//end of main
}//end of class