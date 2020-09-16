package assignment2;

public class Overriding_example {
	
	public void vehiclewheel(int w )				//try giving static and final here
	{
		System.out.println("4 wheels");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overriding_example obj= new Overriding_example();
		obj.vehiclewheel(4);
	}

}

