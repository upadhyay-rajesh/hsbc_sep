package com.second_day.controller;

import com.second_day.service.TelegramService;
import com.second_day.service.TelegramServiceInterface;

public class TelegramController implements TelegramControllerInterface {
private TelegramServiceInterface ts;
	
	public TelegramController(){
		ts=new TelegramService();
	}
	
	@Override
	public void createProfile() {
		ts.createProfileService();
		System.out.println("profile created");
		
	}

	@Override
	public void editProfile() {
		ts.editProfileService();
		System.out.println("profile edited");
		
	}

	@Override
	public void deleteProfile() {
		ts.deleteProfileService();
		System.out.println("profile deleted");
		
	}

	@Override
	public void viewProfile() {
		ts.viewProfileService();
		System.out.println("profile detail");
		
	}


}
