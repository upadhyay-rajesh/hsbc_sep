package com.Facebook.controller;

import com.Facebook.service.FacebookService;
import com.Facebook.service.FacebookServiceInterface;

public class FacebookController implements FacebookControllerInterface {

private FacebookServiceInterface fs;
	
	public FacebookController(){
		fs=new FacebookService();
	}

	
	public void createProfile() {
		fs.createProfileService();
		System.out.println("profile created");
		
	}

	
	public void editProfile() {
		fs.editProfileService();
		System.out.println("profile edited");
		
	}

	
	public void deleteProfile() {
		fs.deleteProfileService();
		System.out.println("profile deleted");
		
	}


	public void viewProfile() {
		fs.viewProfileService();
		System.out.println("profile detail");
		
	}

	
	public void searchProfile() {
		fs.searchProfileService();
		System.out.println("search profile");
		
		
	}

	
	public void viewAllProfile() {
		fs.viewAllProfileService();
		System.out.println("profile detail");
		
		
	}
}
