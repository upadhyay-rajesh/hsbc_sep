package com.first_java.view;
import com.first_java.controller.*;
import java.io.*;

public class FacebookView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("****************** Menu *****************");
		System.out.println("1. Create Profile\n2. Delete Profile\n3. Edit Profile\n4. View PRofile\n5. Search Profile\n");
		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			int choice = Integer.parseInt(in.readLine());
			
			FacebookController f = new FacebookController();
			
			switch (choice) {
			
				case 1:
					f.createProfile();
					break;
				
				case 2:
					f.deleteProfile();
					break;
				
				case 3:
					f.editProfile();
					break;
					
				case 4:
					f.viewProfile();
					break;
					
				case 5:
					f.searchProfile();
					break;
					
				default:
					System.out.println("Invalid Choice");
			}
		}
		catch (IOException e) {
			System.out.println(e.toString());
		}
	}

}
