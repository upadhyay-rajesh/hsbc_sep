package day;

public class Method_overriding {

	    void add(int i,int j)
		{
			System.out.println("parent"+i+j);
		}

	

}
class B extends Method_overriding
{
	@Override//this will tell overriding happens or not
	void add(int j,int k)
	{
		System.out.println("child"+j+k);
	}

	public static void main(String args[])
	{
		B o = new B();
		o.add(5, 6);
		Method_overriding o1 = new B();
		o1.add(4, 7);
		Method_overriding o2 = new Method_overriding();
		o2.add(4, 7);
	}
}
