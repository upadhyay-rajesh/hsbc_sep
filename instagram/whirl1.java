import java.awt.*;
import java.applet.Applet;

/*
<APPLET
    CODE = whirl1.class
    WIDTH = 300
    HEIGHT = 300>
</APPLET>
*/

public class whirl1 extends Applet implements Runnable
{
    Image whirlImages[] = new Image[4];
    Image nowImage; 
    int whirlIndex = 0;
    Thread whirlThread;
    boolean animateFlag = true;

    public void init() 
    {
        whirlImages[0] = getImage(getCodeBase(), "whirl1.gif");
        whirlImages[1] = getImage(getCodeBase(), "whirl2.gif");
        whirlImages[2] = getImage(getCodeBase(), "whirl3.gif");
        whirlImages[3] = getImage(getCodeBase(), "whirl4.gif");
    }

    public void start() 
    {
        whirlThread = new Thread(this);
        whirlThread.start();
    }

    public void stop() 
    {
        animateFlag = false;        
    }

    public void run() 
    {
        while(animateFlag){
        nowImage = whirlImages[whirlIndex++];
        if(whirlIndex > 3)whirlIndex = 0;
        repaint();
        try {Thread.sleep(200);}
        catch(InterruptedException e) { }
        }
    }

    public void paint (Graphics g) 
    {
        if(nowImage != null) g.drawImage(nowImage, 10, 10, this);
    }
}
