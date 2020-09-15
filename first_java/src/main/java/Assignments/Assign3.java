package Assignments;

import java.io.*;
public class Assign3 {
	 public static void main(String ar[])throws IOException
     {
		 BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
          
		 // user input
           System.out.println("Enter score from 0-100");
           int mark = Integer.parseInt(stdin.readLine());
           char grade;
           
           //grade allocation
           if(mark>80)
        	   grade='A';
           else if(mark>60&&mark<80)
        	   grade='B';
           else if(mark>40&&mark<60)
        	   grade='C';
           else
        	   grade='D';
           System.out.println("Your grade is "+grade);
     }
}
