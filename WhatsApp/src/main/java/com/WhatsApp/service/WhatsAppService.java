package com.WhatsApp.service;

import com.WhatsApp.dao.WhatsAppDao;
import com.WhatsApp.dao.WhatsAppDaoInterface;

public class WhatsAppService implements WhatsAppServiceInterface{
private WhatsAppDaoInterface wd;
public WhatsAppService()
{
	wd=new WhatsAppDao();
}
	public void createProfileService() {
		// TODO Auto-generated method stub
		
		wd.createProfileDao();
		System.out.println("Profile created");
		
	}

	public void editProfileService() {
		// TODO Auto-generated method stub
		
		wd.editProfileDao();
		System.out.println("Profile Edited");
	}

	public void deleteProfileService() {
		// TODO Auto-generated method stub
		wd.deleteProfileDao();
		System.out.println("Profile deleted");
	}

	public void viewProfileService() {
		// TODO Auto-generated method stub
		
		wd.viewProfileDao();
		System.out.println("View profile");
	}

	public void searchProfileService() {
		// TODO Auto-generated method stub
		wd.searchProfileDao();
		System.out.println("Search profile");
	}

}
