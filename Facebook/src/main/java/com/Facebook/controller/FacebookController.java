package com.Facebook.controller;

import com.Facebook.service.FacebookService;
import com.Facebook.service.FacebookServiceInterface;

public class FacebookController implements FacebookControllerInterface{

	private FacebookServiceInterface fs;
	
	public FacebookController()
	{
		fs=new FacebookService();
	}
	
	@Override
	public void createProfile() {
		fs.createProfileService();
		System.out.println("createprofile...");
		
	}

	@Override
	public void editProfile() {
		fs.deleteProfileService();
		System.out.println("createprofile...");		
	}

	@Override
	public void deleteProfile() {
		fs.editProfileService();
		System.out.println("createprofile...");		
	}

	@Override
	public void viewProfile() {
		fs.viewProfileService();
		// TODO Auto-generated method stub
		
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
