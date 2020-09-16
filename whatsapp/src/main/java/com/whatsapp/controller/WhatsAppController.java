package com.whatsapp.controller;

import com.whatsapp.service.WhatsAppService;
import com.whatsapp.service.WhatsAppServiceInterface;

public class WhatsAppController implements WhatsAppControllerInterface{

	private WhatsAppServiceInterface fs;
	
	public WhatsAppController(){
		fs=new WhatsAppService();
	}

	@Override
	public void createProfile() {
		fs.createProfileService();
		System.out.println("profile created");
		
	}

	@Override
	public void viewChats() {
		fs.viewChatsService();
		System.out.println("chats viewed");
		
	}

	@Override
	public void viewStatus() {
		fs.viewStatusService();
		System.out.println("status viewed");
		
	}

	@Override
	public void viewCalls() {
		fs.viewCallsService();
		System.out.println("calls viewed");
		
	}

	@Override
	public void searchChats() {
		fs.searchChatsService();
		System.out.println("chats searched");
		
	}
	
	@Override
	public void viewAllContacts() {
		fs.viewAllContactsService();
		System.out.println("All contacts viewed");
		
	}

	

}
