package Assignments;

public class Assign4 
{

	public static void main(String args[])  
	{    
	 int num1=0,num2=1,num3,i,count=10; 
	 //printing first 2 aka 0 1 
	 System.out.print(num1+" "+num2);   
	  
	 //printing the rest in range till 20
	 for(i=2;i<count;i++)   
	 {    
	  num3=num1+num2; 
	  if(num3>20)
		  break; //range ends
	  System.out.print(" "+num3);    
	  num1=num2;    
	  num2=num3;    
	 }    
	  
	} 
}
