package com.WhatsApp.controller;
import com.WhatsApp.controller.*;
import com.WhatsApp.service.WhatsAppService;
import com.WhatsApp.service.WhatsAppServiceInterface;
public class WhatsAppController implements WhatsAppControllerInterface{
	
private WhatsAppServiceInterface ws;

public WhatsAppController()
{
	ws=new WhatsAppService();
}
	public void createProfile() {
		// TODO Auto-generated method stub
		ws.createProfileService();
		System.out.println("Profile created");
		
	}

	public void editProfile() {
		// TODO Auto-generated method stub
		ws.editProfileService();
		System.out.println("Profile edited");
	}

	public void deleteProfile() {
		// TODO Auto-generated method stub
		ws.deleteProfileService();
		System.out.println("Profile deleted");
	}

	public void viewProfile() {
		// TODO Auto-generated method stub
		ws.viewProfileService();
		System.out.println("View profile");
	}

	public void searchProfile() {
		// TODO Auto-generated method stub
		ws.searchProfileService();
		System.out.println("Search profile");
	}

	

}
