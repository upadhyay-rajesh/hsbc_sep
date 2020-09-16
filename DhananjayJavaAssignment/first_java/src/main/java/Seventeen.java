import java.util.Scanner;
public class Seventeen {
	static boolean isNumber(String s) 
    { 
        for (int i = 0; i < s.length(); i++) 
        if (Character.isDigit(s.charAt(i))  
            == false) 
            return false; 
  
        return true; 
    } 
   public static void main(String args[]){
      int sum = 0;
      int num=0;
      System.out.print("Enter the number value:");
      if(isNumber(args[0])) {
    	   num=Integer.parseInt(args[0]);}
     

      for (int i =1; i<=num; i++){
         sum = sum +i;
      }
      System.out.println("Sum of numbers : "+sum);
   }
}