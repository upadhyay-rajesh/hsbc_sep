package rkdgr8;

public class Q1 {
	   public static void main( String[] args )
	    {
	       int ans=0;
	       
	       for(int i = 0; i<args.length; i++) {
	          ans+= Integer.parseInt(args[i]);
	        }
	       System.out.println(ans);
	    }
}
