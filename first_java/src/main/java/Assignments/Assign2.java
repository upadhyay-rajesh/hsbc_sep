package Assignments;

public class Assign2 {
	public static void main(String ar[])
    {
         String name="Drishika";
         int length= name.length();
         int i,j=0;
         for( i=1;i<=10;i++)
         {
        	 System.out.println(i+" "+name);
         }
         for( i=1;i<=10;i++)
         {
        	 System.out.println(i);
        	 for(j=0;j<length;j++)
        	 {
        		 System.out.println(name.charAt(j));
        	 }
         }
         
         
    }

}
