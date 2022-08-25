package Nitya_java.Poly;

public class PolyObjDEmo {
	public static void main(String[] args) {
		Santa s = new Santa();
		s.add();// add() : Snata
		s.mul();//
		s.sub();
//		s.div();
		
		System.out.println("==================");
		Banta b = new Banta();
		b.add();
		b.div();
		b.sub();
		
		
		System.out.println("==================");
		// Parent ref => Child class memory 
		Santa sb =  new Banta();
		sb.add();
		sb.sub();
		sb.mul();
//		sb.div();
	}//end of main
}//end of class 

class Santa{
	void add() {
		System.out.println("add(): Santa");
	}
	void sub() {
		System.out.println("sub(); Santa");
	}
	void mul() {
		System.out.println("mul(): Santa");
	}
}//end of class Santa

class Banta extends Santa{
	void add() {
		System.out.println("add(): Banta ");
	}
	void div() {
		System.out.println("div() : Banta");
	}
}//end of Banta
