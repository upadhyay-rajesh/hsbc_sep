
public class Average {

	public static void main(String[] args) {
		int a[]= {1,2,4,23,13,24,23,1,2,4,5,3,8,98,56,94};
		int s=0;
		for(int i=0; i<a.length; i++)
			s=+a[i];
		
		System.out.println("Average is "+ ((float)s/a.length));

	}

}
