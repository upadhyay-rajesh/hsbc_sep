package day;

public class Static_k {


		// TODO Auto-generated method stub
		void add()
		{
			System.out.println("add non static method called");
			//System.out
		}
		public static void sub()
		{
			System.out.println("sub a static method called");
			//System.out
		}
		void mult()
		{
			System.out.println("mult non static method called");
			//System.out
			add();//call non static frm non
			sub();//ns to s
		}
		static void di()
		{
			System.out.println("di a static method called");
			//System.out
			sub();//s to s
			
			Static_k ob = new Static_k();
			ob.mult();
			//mult();//s to ns
		}
		public static void main(String[] args) {
			Static_k ob = new Static_k();
			ob.add();ob.mult();
			di();//static method cann be called directly
	}

}
