package com.second_java.controller;

import com.second_java.service.WhatsAppService;
import com.second_java.service.WhatsAppServiceInterface;

public class WhatsAppController implements WhatsAppControllerInterface {

	WhatsAppServiceInterface wi;
	
	public WhatsAppController(){
		wi = new WhatsAppService();
	}
		


	@Override
	public void newMessage() {
		// TODO Auto-generated method stub
		wi.newMessageService();
		System.out.println("Sending new message");
	}

	@Override
	public void editAccount() {
		// TODO Auto-generated method stub
		wi.editAccountService();
		System.out.println("profile edited");
	}

	@Override
	public void deleteAccount() {
		// TODO Auto-generated method stub
		System.out.println("profile deleted");
	}

	@Override
	public void viewProfilePicture() {
		// TODO Auto-generated method stub
		wi.viewProfilePictureService();
		System.out.println("profile picture displayed");
	}

	@Override
	public void addNewContact() {
		// TODO Auto-generated method stub
		wi.addNewContactService();
		System.out.println("new contact added");
	}

	@Override
	public void searchChats() {
		// TODO Auto-generated method stub
		wi.searchChatsService();
		System.out.println("Searching...");
	}

}
