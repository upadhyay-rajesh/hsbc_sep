// 1 + 1/x + x^2/2 + x^3/3 + ....+ x^n/n 
import static java.lang.Math.pow; 
  
class Nineteen
{
// sum of the series 
static double sum(int x, int n) 
{ 
    double i, total = 1.0; 
    for (i = 1; i <= n; i++) 
        total = total +  
                (Math.pow(x, i) / i); 
  
    return total; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int x = 2; 
    int n = 5; 
    System.out.printf("%.2f", sum(x, n)); 
} 
}