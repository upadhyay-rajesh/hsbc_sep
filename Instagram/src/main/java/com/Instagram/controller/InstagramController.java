package com.Instagram.controller;
import com.Instagram.controller.*;
import com.Instagram.service.InstagramService;
import com.Instagram.service.InstagramServiceInterface;
public class InstagramController implements InstagramControllerInterface{
	
private InstagramServiceInterface ws;

public InstagramController()
{
	ws=new InstagramService();
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
