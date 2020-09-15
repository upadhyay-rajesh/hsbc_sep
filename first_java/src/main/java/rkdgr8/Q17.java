package rkdgr8;
import java.util.*;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{	
			int a = Integer.parseInt(args[0]);
			StringBuffer s = new StringBuffer(Integer.toString(a));
			System.out.println(s.reverse());
			
		}
		catch(NumberFormatException ex)
		{
			System.out.println("not an integer");
		}
		finally
		{
		}
		
	}

}
