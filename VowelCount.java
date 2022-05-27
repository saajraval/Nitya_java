import java.util.Scanner ;

public class VowelCount{

	public static void main (String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		System.out.println(str);
		int vowel =0;
		// convert our str too lower case character only
		str = str.LowerCase();
		for(int i=0;i<str.length();i++){

			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || ){
				vowel++;
			}
			
		}//end of for
		System.out.println("Vowels in the String are : "+vowel);
	}//end of main
}//end of class