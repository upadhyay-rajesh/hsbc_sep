package Assignments;

public class Assign2 {
	public static void main(String ar[])
    {
         String name="Drishika";
         int length= name.length();
         int i,j=0;
         //horizontally
         for( i=1;i<=10;i++)
         {
        	 System.out.println(i+" "+name);
         }
         //vertically
         for( i=1;i<=10;i++)
         {
        	 System.out.println(i);//for numbering
        	 for(j=0;j<length;j++)
        	 {
        		 System.out.println(name.charAt(j));
        	 }
         }
         
         
    }

}
