import java.util.Arrays;

public class ArrangeNum {

	public static void main(String[] args) {
		int l=args.length;
		int arr[]=new int[l];
		for(int i=0; i<l; i++)
			arr[i]=Integer.parseInt(args[i]);
		Arrays.sort(arr);
		System.out.println( "Sorted array is " + Arrays.toString(arr));

	}

}
