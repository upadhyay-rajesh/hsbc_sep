
public class Fourth {

	public static void main(String[] args) {

		        int t1 = 1, t2=2;
		          int sum=0;
		          System.out.print(t1+" "+t2+" ");
                    while(sum<=20) {
                    	sum=t1+t2;
                    	if(sum<=20) {
                    	System.out.print(sum+" ");}
		                t1=t2;
		                t2=sum;
		        }
		   

	}

}
