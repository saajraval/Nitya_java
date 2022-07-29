package Nitya_java;
import java.util.Scanner;
public class GetterSetterDemo { // Employee
	private static int a ;
	private String str;
	
	String name ;
	public static void main(String[] args) {
		System.out.println("a : "+a);
		GetterSetterDemo gs = new GetterSetterDemo();
		System.out.println(" Str : "+ gs.str);
		
		Laptop l = new Laptop();
		l.setBrand("Dell");
		System.out.println("Brand : "+l.getBrand());
		
		l.setName("XPS 13 plus");
		System.out.println(" name : "+l.getName());
		
		l.setPrice(150000);
		System.out.println(" Price : "+ l.getPrice());
	}//end of main
}//end of class

class Laptop{ // Bank  -> name , post ,sal , tax 
	private String name;
	private String brand;
	private int price;
	
	//accessors 
	
	// getters and setters 
	
	public String getName() {
		return name;
	}// display  -> getter 
	
	public void setName(String name) {
		this.name = name; //shadow copying  
	} // setter 
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price ;
	}
}// end of class laptop

