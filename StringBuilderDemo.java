package Nitya_java;
//String Buffer -> String Builder
// to mutable
public class StringBuilderDemo {
	public static void main(String[] args) {
		String s1 = "Hello";
		System.out.println(s1.hashCode());
		s1 = s1.concat("hi");// Hellohi
		System.out.println(s1.hashCode());
		
		// String Buffer vs String Builder
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb.hashCode());
		sb.append("hi");
		System.out.println(sb.hashCode());
		// append insert delete 
		
	}
}
