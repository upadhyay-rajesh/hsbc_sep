package assignment1;

public class Multiplication {		//CommandLine

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=Integer.parseInt(args[0]);
		for (int i=0; i< 10; i++){
			   System.out.println(num1 + " x " + (i+1) + " = " + 
			     (num1 * (i+1)));
	}

	}
}
