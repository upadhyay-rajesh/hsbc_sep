package day2;

public class Static_Demo {
	
	
	public void add() {
		System.out.println("i am non static add method");
	}

	public static void sub() {
		System.out.println("i am static sub method");
	}

	void mult() {
		//calling non static method inside another non static I.E. DIRECTELY
		add();
		
		//calling static method inside another non static i.e. directly
		sub();
	}

	static void div() {
		//calling non static method inside another static method via object
		Static_Demo s=new Static_Demo();
		s.add();
		
		//calling static method inside another static i.e. directly
		sub();
	}

	public static void main(String[] args) {
		div();
		
		
		Static_Demo s=new Static_Demo();
		s.mult();

	}

}












