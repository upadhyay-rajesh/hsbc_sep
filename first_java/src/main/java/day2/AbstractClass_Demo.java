package day2;

public abstract class AbstractClass_Demo {
	
	public abstract void add();
	
	public void sub() {
		System.out.println("sub");
	}

}


class Child extends AbstractClass_Demo{
	public void add() {
		System.out.println("add method inside child");
	}
	
	public void mult() {
		System.out.println("mult");
	}
	
	public static void main(String arg[]) {
		AbstractClass_Demo a=new Child();
		a.sub();
		a.add();
		//a.mult();
		
		
		Child c=new Child();
		c.add();
		c.sub();
		c.mult();
	}
}





