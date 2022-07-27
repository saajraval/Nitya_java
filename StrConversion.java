package Nitya_java;
import java.util.Scanner;
public class StrConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to convert ");
		String str = sc.nextLine();
		StringBuffer str2 = new StringBuffer("");
		
		for(int i=0;i<str.length();i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				str2.setCharAt(i,(char) Character.toUpperCase(i));
			}
			else if(Character.isUpperCase(str.charAt(i))){
				str2.setCharAt(i,(char) Character.toLowerCase(i));
			}
		}//end of for
		System.out.println(" the converted string is : "+str2);
	}
}
