package rkdgr8;

public class Q3 {

	public static void main(String[] args) {
		int marks = Integer.parseInt(args[0]);
		String ans;
		if(marks<=100 && marks>90)
			ans= "AA";
		else if(marks<=90 && marks>80)
			ans="AB";
		else if(marks<=80 && marks>70)
			ans="BB";
		else ans="FF";
		System.out.println(ans);
	}

}
