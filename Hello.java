package com.first_java;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
	//1
		int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        
        int c=a+b;
        System.out.println("Addition of two no is:"+c);
        
   //2  
        int loop; 
        final String name="Aishwarya"; 
         
        loop=1; 
        while(loop<=10){
            System.out.println(name);
            loop++; 
       }
        loop=1;
        while(loop<=10){
            System.out.print(name+" ");
            loop++; 
       }
    //3
        System.out.println(" ");
        System.out.println("Enter student marks :");
        int marks= s.nextInt();
        System.out.println("The student Grade is: ");
        if(marks>=80)
        {
            System.out.print("A");
        }
        else if(marks>=60 && marks<80)
        {
           System.out.print("B");
        } 
        else if(marks>=40 && marks<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
     //4
        System.out.println(" ");
        System.out.println("Fibonacci Series 1 - 20 ");
        int n1=0,n2=1,n3,i,count=20;    
        System.out.print(n1+" "+n2);
           
        for(i=2;i<count;++i) 
        {    
         n3=n1+n2;    
         System.out.print(" "+n3);    
         n1=n2;    
         n2=n3;    
        }  
     //5
        System.out.println(" ");
        System.out.println("Table of 7:"); 
        n1 = 7;
        for(int j=1; j <= 10; j++)
        {
            System.out.println(n1+" * "+j+" = "+n1*j);
        }
     //6
        int num = 29;
        boolean flag = false;
        for(int k = 2; k <= num/2; ++k)
        {
            if(num % k == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
      //7  
        int n, sum = 0;
        float average;
       
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int l = 0; l < n ; l++)
        {
            arr[l] = s.nextInt();
            sum = sum + arr[l];
        }
        System.out.println("Sum:"+sum);
        average = (float)sum / n;
        System.out.println("Average:"+average);
        
      //8
        System.out.println("Enter the number you want to reverse:");
        num = s.nextInt() ;
        int reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
        
      //9
        System.out.println("Pattern:");	
        for(i=1;i<=7;i++)
        {
        	for(int j=0;j<i;j++)
        	{
        		System.out.print(j*i + " ");	
        	}
           System.out.println("");
        }
      //10
        System.out.println(" ");
        float fah;
        double cel;
        System.out.print("Enter Temperature in Fahrenheit : ");
        fah = s.nextFloat();
        cel = (fah-32) / 1.8;
        System.out.println("Equivalent Temperature in Celsius = " + cel);
     //11
        System.out.println(" ");
         int fact=1;  
        int number=10;  
        for(i=1;i<=number;i++){    
            fact=fact*i;    
        }    
        System.out.println("Factorial of "+number+" is: "+fact); 
        
      //12
        System.out.println("Cube of 1 - 10 : ");
        for(i=1;i<=10;i++)
        {
        System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));     
       }
      //13
        int r;
        double pi = 3.14, area;
        System.out.println("Enter radius of circle:");
        r = s.nextInt();
        area = pi * r * r;
        System.out.println("Area of circle:"+area);
        
       //14
        sum = 0;
		for ( i = 1; i <= 99; i++) 
		{
			if (i % 2 != 0) 
			{
				sum = sum + i;
			}
		}
		System.out.println("The Sum Of 99 Odd Numbers are:" + sum);
	  //15
		n1 = 10; 
        n2 = 5; 
        n1 = n1 + n2; 
        n2 = n1 - n2; 
        n1 = n1 - n2; 
        System.out.println("After swaping:"
                           + " x = " + n1 + ", y = " + n2);
       //16
        System.out.println("Enter the number in Command Line ");
        System.out.println("Table of given number:"); 
        
        try 
        { 
            
        	n1 = Integer.parseInt(args[2]);
            System.out.println(n1+ " is a valid integer number"); 
        }  
        catch (NumberFormatException e) 
        { 
            System.out.println(n1+ " is not a valid integer number"); 
        } 
        
        for(int j=1; j <= 10; j++)
        {
            System.out.println(n1+" * "+j+" = "+n1*j);
        }
       //17
       sum=0;
       try 
       { 
    	   for(i=3; i<args.length ; i++)
           {
           sum = sum+Integer.parseInt(args[i]);
           }
       }  
       catch (NumberFormatException e) 
       { 
           System.out.println("Not a valid integer number"); 
       } 
       
       System.out.println("sum is = " + sum);
      
       //18
    int temp=0,rem=0,counter=0;
    System.out.print("Enter the start number: ");
   	n1= s.nextInt();
   	System.out.print("Enter the end number: ");
   	n2 = s.nextInt();
   	
   	for(i=n1+1; i<n2; i++)
   	{
   	   temp = i;
   	   num = 0;
   	   while(temp != 0)
   	   {
   		rem = temp%10;
   		num = num + rem*rem*rem;
   		temp = temp/10;
   	   }
   	   if(i == num)
   	   {
   		if(counter == 0)
   		{
   		   System.out.print("Armstrong Numbers Between "+n1+" and "+n2+": ");
   		}
   		   System.out.print(i + "  ");
   		   counter++;
   	   }
   	}
   	// if no Armstrong number is found
   	if(counter == 0)
   	{
   	   System.out.print("There is no Armstrong number Between "+n1+" and "+n2);
   	}
       
       
	s.close();  
        
        
}
	
}
