package Assignments;

import java.io.*;

public class Assign6 {

	public static void main(String[] args)throws IOException {
		 BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
         int i;
         boolean flag = true;
		 // user input
           System.out.println("Enter a number to check for prime ");
           int num = Integer.parseInt(stdin.readLine());
           
           //prime check
           for(i=3;i<num/2;i++)
           {
        	   if(num%i==0)
        	   { 
        		   	flag=false; //checking mod, setting flag
        	   		break;
        	   }
           }
           
           if(flag==false)
        	   System.out.println("Not prime ");
           else
        	   System.out.println("Prime ");
        	   

	}

}
