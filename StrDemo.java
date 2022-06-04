package Nitya_java;
// length  chatAt indexOf() contains trim  startswith ends with 

public class StrDemo{

	public static void main(String[] args){

		String str = "   Jony jony yes papa   ";
		System.out.println(str.length());
		str=str.trim();
		System.out.println(str.length());
		//String are immutable 
		
		System.out.println(str.startsWith("Jony yes"));
		System.out.println(str.endsWith("papa"));
		

		System.out.println(str.contains("s"));
		System.out.println(str.indexOf("s"));
		
		System.out.println(str.charAt(17));
	}//end of main
}//end of class


/*
		Take a string from user  remove extra side space if any .......then count the number of vowels in it 
		reverse the string and also check if its palindrome or not  
*/