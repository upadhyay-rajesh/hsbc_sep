package com.Facebook.service;

import com.Facebook.dao.FacebookDao;
import com.Facebook.dao.FacebookDaoInterface;

public class FacebookService implements FacebookServiceInterface{
private FacebookDaoInterface fd;
public FacebookService()
{
	fd=new FacebookDao();
}
	public void createProfileService() {
		// TODO Auto-generated method stub
		fd.createProfileDao();
		System.out.println("profile created");
	}

	public void editProfileService() {
		// TODO Auto-generated method stub
		fd.editProfileDao();
		System.out.println("profile edited");
	}

	public void deleteProfileService() {
		// TODO Auto-generated method stub
		fd.deleteProfileDao();
		System.out.println("profile deleted");
	}

	public void viewProfileService() {
		// TODO Auto-generated method stub
		fd.viewProfileDao();
		System.out.println("profile detail");
	}

	public void searchProfileService() {
		// TODO Auto-generated method stub
		fd.searchProfileDao();
		System.out.println("search profile");
	}

	public void viewAllProfileService() {
		// TODO Auto-generated method stub
		fd.viewAllProfileDao();
		System.out.println("profile detail");
	}

}
