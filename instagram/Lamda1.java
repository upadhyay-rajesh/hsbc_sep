

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
 
public class Lamda1 {
    public static void main(String [] a)  {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
         System.out.println("Print all numbers:");
        evaluate(list, (n)->true);
         System.out.println("Print no numbers:");
        evaluate(list, (n)->false);
         System.out.println("Print even numbers:");
        evaluate(list, (n)-> n%2 == 0 );
         System.out.println("Print odd numbers:");
        evaluate(list, (n)-> n%2 == 1 );
         System.out.println("Print numbers greater than 5:");
        evaluate(list, (n)-> n > 5 );
        
     
     }
    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list)  {
            if(predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }
 
}




































//Old way:
/*List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
int sum = 0;
for(Integer n : list1) {
    int x = n * n;
    sum = sum + x;
}
System.out.println(sum);*/
  //New way:
/*List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7);
int sum1 = list2.stream().map(x -> x*x).reduce((x,y) -> x + y).get();
System.out.println(sum1);*/


