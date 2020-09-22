package day2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

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
		File f1 = new File("/home/rkdgr8/newdir/two.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your data");
		
		FileOutputStream out = new FileOutputStream(f1,true);
		// to append data, pass true as second argument;
		
		String st =  br.readLine();
		for(int i=0;i<st.length();i++) {
			out.write(st.charAt(i));
		}
		out.close();
		
		
		System.out.println("writing complete");
	}

}
