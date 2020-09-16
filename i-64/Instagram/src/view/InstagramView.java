package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import controller.IntsagramController;

public class InstagramView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("************* Menu **************");
		System.out.println("1. Create Account\n2. Update Account\n3. Post\n4. Disable Account\n5. Delete Account\n");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int choice = 0;
		
		try {
			choice = Integer.parseInt(in.readLine());
		}
		catch (IOException e) {
			
			System.out.println("Exception occurred: \n" + e.toString());
		}
		
		IntsagramController ic = new IntsagramController();
		
		switch (choice) {
		
		case 1:
			ic.createAccount();
			break;
		case 2:
			ic.updateAccount();
			break;
		case 3:
			ic.post();
			break;
		case 4:
			ic.disableAccount();
			break;
		case 5:
			ic.deleteAccount();
			break;
		default:
				System.out.println("Invalid Choice");
		}
	}

}
