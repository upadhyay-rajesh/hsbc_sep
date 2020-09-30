package day2;

class ThreadSynch extends Thread{
	
	String a[] = {"hello", "how",  "are", "you"};
	
	ThreadSynch(String name){
		super(name);
	}
	
	public void run() {
		Synch.execute(getName(), a);
	}
}

class Synch{
	public static synchronized void execute(String name, String[] a) {
		for(int i=0;i<a.length;i++) {
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
				e.printStackTrace();
				
			}
			System.out.println(name+ " " + a[i]);
		}
	}
}

public class ThreadSynchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadSynch t1 = new ThreadSynch("Thread 1:");
		ThreadSynch t2 = new ThreadSynch("Thread 2:");
		
		t1.start();
		t2.start();
	}

}
