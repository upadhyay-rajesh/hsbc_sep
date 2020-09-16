
public class TwentyNine {
	public static void main(String[] args) {
		int k=0;
		for(int i=1;i<=6;i++) {
			if(k<4) {
				k=i;
			}
			else{
				k=8-i;
			}
			for(int j=1;j<=7;j++) {
				if(i<=4) {
				if(j>=5-i&&j<=3+i) {
					System.out.print(k);
					if(j<4) {
						k--;
					}else {
						k++;
					}
				}
				else {
					System.out.print(" ");
				}
				}
				else {
				if(j>=i-3&&j<=11-i) {
					System.out.print(k);
					if(j<4) {
						k--;
					}
					else{
						k++;
					}
				}
				else {
					System.out.print(" ");
				}
				}
			}
			System.out.println();
		}
		

	       System.out.println("   1   ");

	}

}
