import java.io.File;
import java.io.IOException;

public class FileCreationDemo {

	public static void main(String[] args)throws IOException {
		File f=new File("d:/hsbc_file/one.txt");
		
		if(f.createNewFile()) {
			System.out.println("file created");
		}
		else {
			System.out.println("could not create file");
		}


	}

}
