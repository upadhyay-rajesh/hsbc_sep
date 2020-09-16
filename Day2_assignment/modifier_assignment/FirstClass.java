package assignment2;

public class FirstClass {

	public void A()
	{
		System.out.println("I'm non static A");
		//System.out.println("Calling Non Static from Non Static...");
		//C();
	}
	
	public void C()
	{
		System.out.println("I'm non static C");
		System.out.println("Calling Static from Non Static...");
		D();
		
	}
	public static void B()
	{
		FirstClass obj = new FirstClass();
		
		System.out.println("I'm static");
		System.out.println("Calling Non Static from Static...");
		obj.A();
		
	}
	
	public static void D()
	{
		System.out.println("I am static D! ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Calling Static from Static...");
		B();
		
	}

}
