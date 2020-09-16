package day;

public abstract class Abstract_logic {
	public abstract void sum();
	public void add() {
		System.out.print("k");
	}}
class Child extends Abstract_logic
{
	
	public void sum()
	{
		System.out.println("child");
	}
	void f()
	{
		System.out.println("..");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_logic ob = new Child();//refering parent 
		ob.sum();
		ob.add();
		//ob.f();//you can only access parent related property as reference of p
		/*as in real project all functions are defined in parent class
		 * no one can create their own functions in child class so we use reference of
		 * par always.
		 */
		Child c = new Child();//refering child
		c.sum();ob.add();c.f();
	}

}
