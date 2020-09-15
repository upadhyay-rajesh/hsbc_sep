
public class P28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=3;
		for(int k=1;k<=4;k++)
		{
		for(int i=space;i>0;i--)
		{
			System.out.print(" ");
		}
		space--;
		for(int s=k;s>=1;s--)
			System.out.print(s);
		for(int l=2;l<=k;l++)
			System.out.print(l);
		System.out.println("");
		}

	}

}
