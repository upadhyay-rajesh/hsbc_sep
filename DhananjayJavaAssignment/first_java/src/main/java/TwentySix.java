import java.util.Scanner;
class TwentySix {
	public static void Square() {
		
	     int num=0;
	     Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        num=sc.nextInt();

        System.out.println("Square of "+ num + " is: "+ Math.pow(num, 2));
	}
   public static void main (String[] args)
   {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Enter the length of Rectangle:");
	   double length = scanner.nextDouble();
	   System.out.println("Enter the width of Rectangle:");
	   double width = scanner.nextDouble();
	   //Area = length*width;
	   double area = length*width;
	   System.out.println("Area of Rectangle is:"+area);
	   Square();
   }
}