package com.LinkedIn.controller;

import com.LinkedIn.service.LinkedInService;
import com.LinkedIn.service.LinkedInServiceInterface;

public class LinkedInController implements LinkedInControllerInterface{
	private LinkedInServiceInterface ls;
	public LinkedInController() {
		ls=new LinkedInService();
	}
	
	@Override
	public void createProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchProfile() {
		// TODO Auto-generated method stub
		
	}

}
