import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int a[]= {1,2,4,6,3,2,5,4,2,1,43,53,76};
		int b[]=new int[a.length];
		
		for(int i=0; i<a.length; i++)
		b[i]=a[i];
		
		System.out.println("Copied array is " + Arrays.toString(b));

	}

}
