package Assignments;

public class Assign18 {

	public static void main(String[] args) {
		int n = 10;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n; i++) {
				for(int k = 0; k < n; k++) {
//					System.out.println((Math.pow(i, 3) + Math.pow(j,  3) + Math.pow(k,  3)) + " " + (100 * i + 10 * j + k));
					if ((Math.pow(i, 3) + Math.pow(j,  3) + Math.pow(k,  3)) == (100 * i + 10 * j + k)) {
						System.out.print(i);
						System.out.print(j);
						System.out.println(k);
					}
				}
			}
		}

	}

}
