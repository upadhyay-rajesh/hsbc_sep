package day2;


//Notes:

// jvm -> daemon thread -> main -> userdefined thread ( order of who starts whom)
// priority can be [1,10]
//1 ---> lowest priority
//5 ---> default priority
//10---> maximum priority


public class Thread_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Thread t = Thread.currentThread();
			System.out.println(t);
			// Thread[main, 5, main]
			t.setName("hsbc thread");
			System.out.println(t);
			//Thread[hsbc thread, 5 , main] reference name changed to hsbc thread
	}

}
