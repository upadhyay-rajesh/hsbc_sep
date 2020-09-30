package day2;

//this and super you'll not be able to call inside static methods.
public class Constructor_demo {
	Constructor_demo(){
		System.out.println("A");
	}
//	Constructor_demo(int j){
//		System.out.println("A");
//		//Must explicity call super in child class if we're using paramaterized constuctor here
//	}
	int i=8;
	void add() {
		System.out.println("add function");
	}
}

class B extends Constructor_demo{
	B(){
		System.out.println("B");
		System.out.println(super.i);
		super.add();
		//super();
		//error: Constructor call must be the first statement in the constructor;
	}
	
//	static void sub() {
//		super.add();
//	}
	
}

class C extends B{
	C(){
		System.out.println("C");
	}
}

class D{
	public static void main(String arg[]) {
		new C();
	}
}
