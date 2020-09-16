package day;

public class Another_Class {

	void add1()
	{
		//calling non staticmethod from non static method of another cls via ob
		Static_k o = new Static_k();
		o.add();
		//calling static method of one class inside another non static of different class via classname
		Static_k.sub();
	}
	static void sub1()
	{
		Static_k o=new Static_k();//s to non
		o.mult();
		Static_k.sub();//s to s
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_k o = new Static_k();
		o.add();
		Static_k.sub();
		Another_Class p = new Another_Class();
		p.add1();

	}

}
