package day2;

import java.io.File;
import java.io.IOException;

public class File_Demo {
	public static void main(String[] args )throws IOException {
		File f = new File("/home/rkdgr8/newdir/mytextfile.txt");
		
		//File f = new File("/home/rkdgr8/newdir");
//		if(f.mkdir()) {
//			System.out.println("directory created");
//		}
//		else {
//			System.out.println("could not create directory");
//		}
		
		if(f.createNewFile()) {
			System.out.println("new file created");
		}
		else {
			System.out.println("Could not create file");
		}
	}
}
