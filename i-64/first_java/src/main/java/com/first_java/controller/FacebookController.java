package com.first_java.controller;

import com.first_java.service.FacebookService;


public class FacebookController implements FacebookControllerInterface {
	
	// We've to interact with the service layer now, so create an object to call methods on it
	FacebookService fs;
	
	public FacebookController () {
		
		fs = new FacebookService();
	}

	@Override
	public void createProfile() {
		// TODO Auto-generated method stub
		fs.createProfileService();
	}

	@Override
	public void deleteProfile() {
		// TODO Auto-generated method stub
		fs.deleteProfileService();
	}

	@Override
	public void editProfile() {
		// TODO Auto-generated method stub
		fs.editProfileService();
	}

	@Override
	public void viewProfile() {
		// TODO Auto-generated method stub
		fs.viewProfileService();
	}

	@Override
	public void searchProfile() {
		// TODO Auto-generated method stub
		fs.searchProfileService();
	}

}
