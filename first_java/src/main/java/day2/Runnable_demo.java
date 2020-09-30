package day2;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Date;

public class Runnable_demo extends Applet implements Runnable {
	
	private Thread t= null;
	private String str=null;
	
	//kind of like constructor
	public void init() {
		t = new Thread(this);
		str="";
		t.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			str = new Date().toString();
			try {
				t.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			repaint();
		}
	}
	
	//kind of like main()
	public void paint(Graphics g) {
		g.drawString("hello", 100, 100);
	}


}
