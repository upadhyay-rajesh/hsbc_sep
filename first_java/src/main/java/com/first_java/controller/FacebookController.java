package com.first_java.controller;

import com.first_java.service.FacebookService;
import com.first_java.service.FacebookServiceInterface;

public class FacebookController implements FacebookControllerInterface{
	
	private FacebookServiceInterface fs;
	
	public FacebookController(){
		fs=new FacebookService();
	}

	@Override
	public void createProfile() {
		fs.createProfileService();
		
	}

	@Override
	public void editProfile() {
		fs.editProfileService();

		
	}

	@Override
	public void deleteProfile() {
		fs.deleteProfileService();
	
		
	}

	@Override
	public void viewProfile() {
		fs.viewProfileService();

		
	}

	@Override
	public void searchProfile() {
		fs.searchProfileService();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewAllProfile() {
		fs.viewAllProfileService();
		// TODO Auto-generated method stub
		
	}

}
