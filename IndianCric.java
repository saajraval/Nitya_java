package Nitya_java;
import java .util.Scanner;
public class IndianCric {
	// const , class , object, methods , inheritance , vari.
	int runs,wick,rank,age;
	String name , type;
	
	public IndianCric() {
		runs =0;
		wick=0;
	}
	public static void main(String[] args) {
		Player p1 =new Player();
		Player p2 = new Player();
		
		while(1) {
			switch() {
			case 1: 
//				batsman -> type ="Batsman"
				p1.getData();
				p1.batsman();
				
				
			}//end of choice
		}//end of while
	}//end of main
}//end of class


class Player extends IndianCric{
	
	void getData() {
//		age  name    
	}
	void batsman(){
		runs  
		if(runs > 3000) {
			type="ALL Rounder";
					rank= 5;
		}
	}
	void display() {
		if(type.compareTo()) {
//			runs type rank name age 
		}
		else if (type.equals("Bolwer")) {
			
		}
	}
}