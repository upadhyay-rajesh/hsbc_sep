package day2;

class ThreadSynch1 extends Thread{
	
	String a[] = {"hello", "how",  "are", "you"};
	
	ThreadSynch1(String name){
		super(name);
	}
	
	public void run() {
		try {
			Synch1.execute(getName(), a);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Synch1{
	public static synchronized void  execute(String name, String[] a) throws InterruptedException {
	
		for(int i=0;i<4;i++) {
			if(name.contains(Integer.toString(i+1))) {
				System.out.println(name + " " + a[i]);
				Thread.sleep(1000);
			}
		}
		
		
	}
}

public class Thread_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadSynch1 t1 = new ThreadSynch1("Thread1");
		ThreadSynch1 t2 = new ThreadSynch1("Thread2");
		ThreadSynch1 t3 = new ThreadSynch1("Thread3");
		ThreadSynch1 t4 = new ThreadSynch1("Thread4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
