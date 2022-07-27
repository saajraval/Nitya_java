package Nitya_java;
// string are immutable  -> s1 ="Hello"
// s1.concat(" hi") => hello hi in string pool

// hello hi -> help to make our strings mutable -> string buffer and string builder 
// character by character -> hello 
public class StingBufferDemo {
	
	public static void main(String[] args) {
		String s1 = "hello";
		System.out.println(s1.hashCode());//hascode will print the memory location  
		s1 = s1.concat(" hi");
		System.out.println(s1.hashCode());
		
		String str = "java world";
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.hashCode());
		sb.append(" hi");
		System.out.println(sb.hashCode());
		
		System.out.println(sb.indexOf("i"));
		
		// hejavallo  
		// 012
		//hello
		//0123
		System.out.println(sb.insert(2,"java"));
		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println(sb1.replace(3, 5, "p"));
		//hejavallo hi -> delete  
		//0123456
		System.out.println(sb.delete(2, 6));
		System.out.println(sb1.reverse());
		sb.setCharAt(1, 's');
		System.out.println(sb);
		
		// you have to take a string from a user and convert the upper case characters to 
		//lower case and vice versa 
	}
}
