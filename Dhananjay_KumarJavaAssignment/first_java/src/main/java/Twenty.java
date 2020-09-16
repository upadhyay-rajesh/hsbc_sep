import java.util.Scanner;

class Twenty{ 
	public static void Desc(int array[],int num) {
	for (int i = 0; i < ( num - 1 ); i++) {
	      for (int j = 0; j < num - i - 1; j++) {
	        if (array[j] < array[j+1]) 
	        {
	          int temp = array[j];
	          array[j] = array[j+1];
	          array[j+1] = temp;
	        }
	      }
	    }
	 
	    System.out.println("Sorted list of integers:");
	 
	    for (int i = 0; i < num; i++) 
	      System.out.println(array[i]);
	  } 

  public static void main(String []args) {
    int num, i, j, temp;
    Scanner input = new Scanner(System.in);
 
    System.out.println("Enter the number of integers to sort:");
    num = input.nextInt();
 
    int array[] = new int[num];
 
    System.out.println("Enter " + num + " integers: ");
 
    for (i = 0; i < num; i++) 
      array[i] = input.nextInt();
 Desc(array,num);
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