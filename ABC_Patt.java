package Nitya_java;
import java.util.Scanner; 
import Nitya_java.Packages.PackageDemo;
public class ABC_Patt extends PackageDemo{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		ABC_Patt patt = new ABC_Patt();
		patt.display();
		System.out.println("Enter the number of line :");
		int n=sc.nextInt();

		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" "+(char)(j+64));
			}
			System.out.println(" ");
		}
	}
}
