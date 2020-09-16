package assignment1;
import java.util.*;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, i, j, temp;
	    Scanner sc = new Scanner(System.in);
	 
	    System.out.println("Enter the number of integers to sort");
	    num = sc.nextInt();
	 
	    int array[] = new int[num];
	 
	    System.out.println("Enter " + num + " integers: ");
	 
	    for (i = 0; i < num; i++) 
	      array[i] = sc.nextInt();
	 
	    for (i = 0; i < ( num - 1 ); i++) {
	      for (j = 0; j < num - i - 1; j++) {
	        if (array[j] > array[j+1]) 
	        {
	           temp = array[j];
	           array[j] = array[j+1];
	           array[j+1] = temp;
	        }
	      }
	    }
	 
	    System.out.println("Sorted list of integers:");
	 
	    for (i = 0; i < num; i++) 
	      System.out.println(array[i]);
	  }
	}


