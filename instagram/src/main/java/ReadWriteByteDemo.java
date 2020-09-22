import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class ReadWriteByteDemo {

	public static void main(String[] args)throws Exception {
		/*File f=new File("d:/hsbc_file/one.txt");
		File f1=new File("d:/hsbc_file/two.txt");
		
		FileInputStream in=new FileInputStream(f);
		FileOutputStream out=new FileOutputStream(f1);
		
		int c=0;
		
		while(!((c=in.read())==-1)){
			out.write(c);
		}
		out.close();
		in.close();
		System.out.println("writing complete");
		*/
		
		
		File f1=new File("d:/hsbc_file/two.txt");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		FileOutputStream out=new FileOutputStream(f1,true);
		System.out.println("enter your data");
		
		String st=br.readLine();
		for(int i=0;i<st.length();i++) {
			out.write(st.charAt(i));
		}
		
		out.close();
		
		System.out.println("writing complete");

	}

}
