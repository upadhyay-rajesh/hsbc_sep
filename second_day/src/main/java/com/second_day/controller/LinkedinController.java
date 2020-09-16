package com.second_day.controller;

import com.second_day.service.LinkedinService;
import com.second_day.service.LinkedinServiceInterface;

public class LinkedinController implements LinkedinControllerInterface{
	
private LinkedinServiceInterface ls;
	
	public LinkedinController(){
		ls=new LinkedinService();
	}
	
	@Override
	public void createProfile() {
		ls.createProfileService();
		System.out.println("profile created");
		
	}

	@Override
	public void editProfile() {
		ls.editProfileService();
		System.out.println("profile edited");
		
	}

	@Override
	public void deleteProfile() {
		ls.deleteProfileService();
		System.out.println("profile deleted");
		
	}

	@Override
	public void viewProfile() {
		ls.viewProfileService();
		System.out.println("profile detail");
		
	}



}
