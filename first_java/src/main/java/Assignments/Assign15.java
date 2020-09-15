package Assignments;
import java.io.*;
public class Assign15 {

	public static void main(String[] args)throws IOException {
		  BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
	         
			 // user input
	           System.out.println("Enter nos  : "); 
		  int  num1= Integer.parseInt(stdin.readLine());
		  int  num2= Integer.parseInt(stdin.readLine());
		  num1=num1+num2;
		  num2=num1-num2;
		  num1= num1-num2;
		  
		  System.out.println("no1 : "+num1 +"\nno2 :"+num2); 
		  

	}

}
