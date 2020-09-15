
public class Grading {

		
	public static void main(String[] args) {
		int m=60;
		
		if(m<30)
		System.out.println("D grade");
		else if(m>=30 && m<50)
			System.out.println("C grade");
		else 
			if(m>=50 && m<80)
				System.out.println("B grade");
			else 
				System.out.println("A grade");
	}

}
