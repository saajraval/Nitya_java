import java.util.Scanner;
// java is a prog lang => str

// str.spilt("a") -> 
public class StrSplit{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the sentence :");
		String str= sc.nextLine();

		System.out.println("Enter the word you want to search :");
		String word = sc.next();
	
		int count =0;
		String x[] = str.split(" ");// 
		//x[i] = >  java is a prog lang
		
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
			if(x[i].equals(word)){
				count++;
			}
		}
		System.out.println(word+" found "+count+" times.");
	}//end of main
}//


// equals() , compareTo()


//s1  s2 

//s1.equals(s2) -> true if both are same 