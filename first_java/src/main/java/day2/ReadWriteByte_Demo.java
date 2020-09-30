package day2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import whatsapp_entity.WhatsappUser;

public class ReadWriteByte_Demo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
//		File f = new File("/home/rkdgr8/newdir/mytextfile.txt");
//		File f1 = new File("/home/rkdgr8/newdir/two.txt");
//		
//		FileInputStream in = new FileInputStream(f);
//		FileOutputStream out = new FileOutputStream(f1);
//		
//		int c=0;
//		
//		while(!( (c=in.read())==-1)) {
//			out.write(c);
//		}
//		out.close();
//		in.close();
		
		
		
		
		
		
		
		
		
		
//		File f1 = new File("/home/rkdgr8/newdir/two.txt");
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		System.out.println("Enter your data");
//		
//		FileOutputStream out = new FileOutputStream(f1,true);
//		// to append data, pass true as second argument;
//		
//		String st =  br.readLine();
//		for(int i=0;i<st.length();i++) {
//			out.write(st.charAt(i));
//		}
//		out.close();
//		
		
		
//*******************Writing object into a file*****************************		
		
//		File f1 = new File("/home/rkdgr8/newdir/two.txt");
//		
//		FileOutputStream out = new FileOutputStream(f1); 
//		ObjectOutputStream oo = new ObjectOutputStream(out); 
//		
//		WhatsappUser wu =  new WhatsappUser();
//		wu.setName("rkdgr8");
//		wu.setNumber("9723497234");
//		
//		oo.writeObject(oo); 
//		
//		
//		
//		oo.close();
//		out.close();
//		System.out.println("writing complete");
//	
//	
	
		
		
		
		
		
		
//****************Reading objects from a file***************
	
	File f1 = new File("/home/rkdgr8/newdir/two.txt");
	
	FileInputStream out = new FileInputStream(f1); 
	ObjectInputStream oo = new ObjectInputStream(out);

	WhatsappUser ee = (WhatsappUser) oo.readObject(); //because return type of readObject method is Object class.
	System.out.println(ee.getName());
	System.out.println(ee.getNumber());
	out.close();
	oo.close();
}
}
