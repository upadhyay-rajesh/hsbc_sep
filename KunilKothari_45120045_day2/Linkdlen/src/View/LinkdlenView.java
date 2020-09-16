package View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import Controller.LinkdlenController;
import Controller.LinkdlenControllerInterface;

public class LinkdlenView {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Enter 1 to create profile");
		System.out.println("Enter 2 to delete profile");
		System.out.println("Enter 3 to update profile");
		System.out.println("Enter 4 to search profile");
		System.out.println("Enter 5 to view profile");
		
		System.out.println("Enter you choice");
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		LinkdlenControllerInterface lin = new LinkdlenController();
		int choice = Integer.parseInt(br.readLine());
		
		switch(choice) {
		case 1:
			lin.createProfileController();
			break;
		case 2:
			lin.deleteProfileController();
			break;
		case 3:
			lin.updateProfileController();
			break;
		case 4:
			lin.searchProfileController();
			break;
		case 5:
			lin.viewProfileController();
			break;
		}

	}

}
