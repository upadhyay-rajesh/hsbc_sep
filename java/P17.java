
public class P17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = Integer.parseInt(args[0]);			
		System.out.println("for loop");
		int s=0;
		for(int i=1;i<=n;i++)
		{
			s=s+i;
		}
		System.out.println("sum via for"+s);
		
		int i=1,s1=0;
		System.out.println("while loop");
		while(i<=n)
			{
			s1=s1+i;i++;
			}
		System.out.println("sum via while"+s1);
		
		i=1;s1=0;
		System.out.println("dowhile loop");
		do
		{
			s1=s1+i;i++;
		}while(i<=n);
		System.out.println("sum via dowhile"+s1);	
	}
	}


