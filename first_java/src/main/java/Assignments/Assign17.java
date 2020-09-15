package Assignments;

public class Assign17 {

	public static void main(String[] args) {
		
		String s = args[0];
		try
		{
		int n = Integer.parseInt(s);
		System.out.println("sum = " + ((n + 1) * n) / 2);
		}
		catch (Exception NumberFormatException)
		{
			System.out.println("not int");
		}
		
	}

}
