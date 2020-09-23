/*<applet code=blink.class height=200 width=200></applet>*/
import java.util.*;
import java.io.*;
import java.applet.*;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.*;
import java.lang.String;

public class blink extends Applet implements Runnable{
	int i=0,j=0;
	int k=200,l=200;
	int m=200,n=0;
	int o=0,p=200;
	int flag=1;
	Thread t;
	public void start(){
		if(t==null){
			t=new Thread(this);
			t.start();
		}
	}
	public void run(){
		while(t!=null){
			if(i!=100 && flag==1)
			{
				i+=2;j+=2;
				m-=2;n+=2;
				o+=2;p-=2;
				k-=2;l-=2;
				repaint();
			}
			else if(i==100 && flag==1) {flag=2;repaint();}
			
			else if(flag==2)
			{
				flag=3;
				repaint();
			}
			
			else if(flag==3)
			{
				flag=2;
				repaint();
			}
			
			try
			{
				Thread.sleep(500);
			}
			catch(Throwable e)
			{
				System.out.println("Exception buddy..............");
			}		
		}
	}
	public void paint(Graphics g){
		String str1="L";
		String str2="A";
		String str3="ND";
		String str4="T";
		Font f;
		if(flag==1)
		{
			g.drawString(str1,i,j);
			g.drawString(str2,m,n);
			g.drawString(str3,o,p);
			g.drawString(str4,k,l);
		}
		if(flag==2)
		{
			g.setColor(Color.red);
			System.out.println("flag2");
			g.drawString("L AND T",100,100);
		}
		if(flag==3)
		{
			g.setColor(Color.blue);
			f=new Font("Dialog",Font.PLAIN,40);
			g.setFont(f);
			System.out.println("flag3");
			g.drawString("L AND T",100,100);
		}
	}
}