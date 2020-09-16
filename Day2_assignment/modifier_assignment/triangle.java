package assignment2;

public class triangle extends shape {

	void sides()
	{
		System.out.println("I have 3 sides");
	}
	
	void sample()
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		shape obj = new triangle();
		obj.sides();
		//obj.sample();					//cannot be accessed using parents reference
		
		System.out.println("Moving to child reference");
		triangle ob1= new triangle();
		ob1.sides();
		ob1.sample();
		
	}

}
