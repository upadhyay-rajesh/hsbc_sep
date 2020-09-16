public class TwentyFive{
 
    public static void main(String args[]) 
    { 
        double a = 100; 
   
        System.out.println(Math.sqrt(a));
        // Input positive value, Output square root of x  
   
        double b = -81.00; 
   
        System.out.println(Math.sqrt(b));
        // Input negative value, Output NaN  
   
        double c = 0.0/0; 
        // Input NaN, Output NaN  
   
        System.out.println(Math.sqrt(c)); 
   
        double d = 1.0/0;  
        // Input positive infinity, Output positive infinity   
   
        System.out.println(Math.sqrt(d));
        double e = 0.0;
        // Input positive Zero, Output positive zero  
         
        System.out.println(Math.sqrt(e)); 
    } 
         
}