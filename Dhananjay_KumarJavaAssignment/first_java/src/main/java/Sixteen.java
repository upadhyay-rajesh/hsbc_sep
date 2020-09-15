import java.util.Scanner;
 import java.io.*;
public class Sixteen {
 
	static boolean isNumber(String s) 
    { 
        for (int i = 0; i < s.length(); i++) 
        if (Character.isDigit(s.charAt(i))  
            == false) 
            return false; 
  
        return true; 
    } 
 public static void main(String[] args) {
  System.out.print("Input a number: ");
  int num=0;
  if(isNumber(args[0])) {
   num=Integer.parseInt(args[0]);}
  
  for (int i=0; i< 10; i++){
   System.out.println(num + " x " + (i+1) + " = " + 
     (num * (i+1)));
  }
 }
}