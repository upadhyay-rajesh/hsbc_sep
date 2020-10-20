//<applet code=face width=400 height=400></applet>
import java.awt.*;
import java.applet.*;
public class face1 extends Applet implements Runnable
{
	int lpupil = 68;
	int rpupil=121;
	int lpupilo =lpupil; 
	int rpupilo = rpupil;
	int mth=180;
	int mtho=mth;
	int lear=30;
	int rear=30;
	int c=100;
	
	public void init()
	{
		Thread t = new Thread(this);
		Thread t1= new Thread(this);
		Thread t2= new Thread(this);
		t.start();
	}
	
	public void run()
	{
		try
		{
			outer:for(;;)
			{			
				lpupil++;
				rpupil--;
				mth-=5;
				lear+=3;
				rear-=3;
				repaint();
				c+=25;
				Thread.sleep(200);
				if(lpupil==(lpupilo+5))
				{
					for(;;)
					{
						lpupil--;
						rpupil++;
						mth+=5;
						lear-=3;
						rear+=3;
						c-=25;
						repaint();
						Thread.sleep(200);
						if(lpupil==(lpupilo-5)) break;
					}
				}
			}
		}catch(Exception e){}
	}
	
	public void paint(Graphics g)
	{
		g.drawOval(40,40,120,150);
		g.drawOval(57,75,30,20);
		g.drawOval(110,75,30,20);
		g.fillOval(lpupil,81,10,10);
		g.fillOval(rpupil,81,10,10);
		g.drawOval(85,100,30,30);
		Color clr = new Color(c);
		g.setColor(clr);
		g.fillOval(85,100,30,30);
		g.setColor(Color.black);
		g.fillArc(60,125,80,40,mth,mth);
		g.drawOval(25,92,15,lear);
		g.drawOval(160,92,15,rear);
	}
}