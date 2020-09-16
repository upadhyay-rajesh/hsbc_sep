package assignment2;

public class AnotherClass {
	
	public static void s()
	{
		System.out.println("Static CALLING Static of FirstClass..");
		FirstClass.D();
		System.out.println("Static Calling Non Static of FirstClass..");
		FirstClass ob1= new FirstClass();
		ob1.A();
	}

	
	public void NS()
	{
		System.out.println("CALLING Static from non static of FirstClass..");
		FirstClass.D();
		System.out.println("CALLING Non Static from non static of FirstClass..");
		FirstClass ob2= new FirstClass();
		ob2.A();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s();
		AnotherClass ob3 = new AnotherClass();
		ob3.NS();
		
	}

}
