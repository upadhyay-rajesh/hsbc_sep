package assignment2;

public class Scooty extends Overriding_example {

	public void vehiclewheel(int b)					
	{
		System.out.println(b+ " wheels in scooty");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scooty obj =new Scooty();
		obj.vehiclewheel(2);
	}

}
