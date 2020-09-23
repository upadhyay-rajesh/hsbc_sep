import java.awt.*;
import java.applet.Applet;

/*
  <APPLET
      CODE=dbuffer.class
      WIDTH=200
      HEIGHT=200>
  </APPLET>
*/

public class dbuffer extends Applet implements Runnable
{
    Image image1; 
    Thread thread1;
    Graphics graphics;
    int loop_index = 0;
    boolean goFlag = true;

    public void init() 
    {
        image1 = createImage(100, 100);
        graphics = image1.getGraphics();
    }

    public void start() 
    {
        thread1 = new Thread(this);
        thread1.start();
    }

    public void stop() 
    {
        goFlag = false;
    }

    public void run() 
    {
        while(goFlag){
            repaint();
            try {Thread.sleep(100);}
            catch(InterruptedException e) {}
        }
    }

    public void paint (Graphics g) 
    {
        loop_index += 5;
        if(loop_index >= 100) loop_index = 5;

        graphics.setColor(new Color(255, 255, 255)); 
        graphics.fillRect(0, 0, 100, 100);
        graphics.setColor(new Color(0, 0, 0)); 
        graphics.drawRect(0, 0, loop_index, loop_index);

        g.drawImage(image1, 10, 10, this);
    }
}
