import java.io.File;

public class File_Demo {

	public static void main(String[] args) {
		File f=new File("d:/hsbc_file");
		
		if(f.mkdir()) {
			System.out.println("directory created");
		}
		else {
			System.out.println("could not create directory");
		}

	}

}
