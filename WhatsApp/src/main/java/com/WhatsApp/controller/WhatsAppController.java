package com.WhatsApp.controller;

import com.WhatsApp.service.WhatsAppService;
import com.WhatsApp.service.WhatsAppServiceInterface;

public class WhatsAppController implements WhatsAppControllerInterface{
	private WhatsAppServiceInterface ws;
	public WhatsAppController() {
		ws= new WhatsAppService();
	}

	@Override
	public void createProfile() {
		// TODO Auto-generated method stub
		System.out.println("Profile Created!");
	}

	@Override
	public void editProfile() {
		// TODO Auto-generated method stub1
		System.out.println("Profile Edited!");
		
	}

	@Override
	public void deleteProfile() {
		// TODO Auto-generated method stub
		System.out.println("Profile Deleted!");
		
	}

	@Override
	public void viewProfile() {
		// TODO Auto-generated method stub
		System.out.println("Profile details!");
		
		
	}

	@Override
	public void searchProfile() {
		// TODO Auto-generated method stub
		
		
	}

}
