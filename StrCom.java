//string comparisions 


/*
	equals => boolean true / false
	compareTo=> int 

	unicode-> a-> 97 z -122  
		     A- > 65 Z - 90 // 
*/

public class StrCom{

	public static void main(String[] args){

		String s1="SACHIN";
		String s2="SAAJ";
		String s3="saaj";
	// r    s -> -1
	//20 21 
	// s   r => 1
		//System.out.println(s1.equals(s2));
		//System.out.println(s2.compareTo(s3));
		//System.out.println(s3.compareTo(s2));

		//s2=s2.toLowerCase();
		//System.out.println(s2.equals(s3));

		//s3=s3.toUpperCase();
		//System.out.println(s2.equals(s3));

		//equalsIgnoreCase()
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s2.compareToIgnoreCase(s3));

		System.out.println(s1.length());
		System.out.println(s1.concat(s2));
		
	}//end of main
}//end of class