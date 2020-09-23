import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

/*
<APPLET
    CODE = whirl3.class
    WIDTH = 300
    HEIGHT = 300 >
</APPLET>
*/

public class whirl3 extends Applet implements ActionListener, Runnable 
{
    Image whirlImages[] = new Image[4];
    Image nowImage; 
    int whirlIndex = 0;
    Thread whirlThread;
    Button suspendButton, resumeButton;
    boolean animateFlag = true;
    boolean goFlag = true;

    public void init() 
    {
        whirlImages[0] = getImage(getCodeBase(), "whirl1.gif");
        whirlImages[1] = getImage(getCodeBase(), "whirl2.gif");
        whirlImages[2] = getImage(getCodeBase(), "whirl3.gif");
        whirlImages[3] = getImage(getCodeBase(), "whirl4.gif");
        suspendButton = new Button("Suspend");
        add(suspendButton); 
        suspendButton.addActionListener(this);
        resumeButton = new Button("Resume");
        add(resumeButton); 
        resumeButton.addActionListener(this);
    }

    public synchronized void actionPerformed(ActionEvent e){
         if(e.getSource() == suspendButton){
         goFlag = false; 
         }
         if(e.getSource() == resumeButton){
         goFlag = true; 
         notify();
         }
    }

    public void start() {
        whirlThread = new Thread(this);
        whirlThread.start();
    }

    public void stop() {
        animateFlag = false;
    }

    public void run() {
        while(animateFlag){
            nowImage = whirlImages[whirlIndex++];
            if(whirlIndex > 3)whirlIndex = 0;
            repaint();
            try {
                Thread.sleep(200);
                synchronized(this){
                while(!goFlag)
                    wait();
                }
            }
            catch(InterruptedException e) { }
        }
    }

    public void paint (Graphics g) 
    {
        if(nowImage != null) g.drawImage(nowImage, 10, 10, this);
    }

    public void update(Graphics g) 
    {
        g.clipRect(10, 10, 280, 280);
        paint(g);
    }
}
