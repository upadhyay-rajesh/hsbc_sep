

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.util.*;

public class Lamda extends Frame{
	public Lamda(){
		Frame f1  = new Frame("my frame");
		f1.setSize(300,400);
		f1.setBackground(Color.red);
		f1.setVisible(true);

		Panel p1= new Panel();
		f1.add(p1);

		Button b1 = new Button("button 1");
		p1.add(b1);
		
		b1.addActionListener(event->System.out.println("Do Something"));
	}

	public static void main(String[] args) {
		new Lamda();
		/*Arrays.asList( "a", "b", "d" ).forEach( e -> {
			
			    System.out.print( e );
			
			    System.out.print( e );
			
			} );*/

		//Button button = new Button();
		/*button.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent arg0) {
		        System.out.println("Do Something");            
		    }
		});*/
		//button.addActionListener(event->System.out.println("Do Something"));
	}

}















