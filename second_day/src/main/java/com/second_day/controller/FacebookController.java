package com.second_day.controller;
import com.second_day.service.FacebookService;
import com.second_day.service.FacebookServiceInterface;


public class FacebookController implements FacebookControllerInterface {


	private FacebookServiceInterface fs;
	
	public FacebookController(){
		fs=new FacebookService();
	}
	
	@Override
	public void createProfile() {
		fs.createProfileService();
		System.out.println("profile created");
		
	}

	@Override
	public void editProfile() {
		fs.editProfileService();
		System.out.println("profile edited");
		
	}

	@Override
	public void deleteProfile() {
		fs.deleteProfileService();
		System.out.println("profile deleted");
		
	}

	@Override
	public void viewProfile() {
		fs.viewProfileService();
		System.out.println("profile detail");
		
	}

	@Override
	public void searchProfile() {
		fs.searchProfileService();
		System.out.println("profile searched");
		
	}

	@Override
	public void viewAllProfile() {
		fs.viewAllProfileService();
		System.out.println("All Profile Viewed");
		
	}

}
