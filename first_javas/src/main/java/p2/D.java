package p2;
import p1.A;//as A is not public it is not accessable
public class D extends A{
	public void add()
	{
		System.out.println(t);//done
		System.out.println(k);
	}
	
	public static void main()
	{
		A a= new A();         
		//System.out.println(a.i);
		//System.out.println(a.t);via object it is not allowed as child
		
		System.out.println(a.k);
		//System.out.println(a.j);
		
	}

}
