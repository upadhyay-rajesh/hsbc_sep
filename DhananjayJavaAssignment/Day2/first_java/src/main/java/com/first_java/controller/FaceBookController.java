package com.first_java.controller;

import com.first_java.service.FacebookService;
import com.first_java.service.FacebookServiceInterface;

public class FaceBookController implements FacebookControllerInterface{
	
	private FacebookServiceInterface fs;
	
	public FaceBookController(){
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewAllProfile() {
		fs.viewAllProfileService();
		// TODO Auto-generated method stub
		
	}

}
