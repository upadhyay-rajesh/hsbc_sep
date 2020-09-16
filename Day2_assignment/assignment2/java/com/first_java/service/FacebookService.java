package com.first_java.service;

import com.first_java.dao.FacebookDao;
import com.first_java.dao.FacebookDaoInterface;

public class FacebookService implements FacebookServiceInterface{

	private FacebookDaoInterface fd;
	
	public FacebookService(){
		fd = new FacebookDao();
	}
	@Override
	public void createProfileService() {
		// TODO Auto-generated method stub
		fd.createProfileDao();
	}

	@Override
	public void editProfileService() {
		// TODO Auto-generated method stub
		fd.editProfileDao();
	}

	@Override
	public void deleteProfileService() {
		// TODO Auto-generated method stub
		fd.deleteProfileDao();
	}

	@Override
	public void viewProfileService() {
		// TODO Auto-generated method stub
		fd.viewProfileDao();
	}

	@Override
	public void searchProfileService() {
		// TODO Auto-generated method stub
		fd.searchProfileDao();	
	}

	@Override
	public void viewAllProfileService() {
		// TODO Auto-generated method stub
		
		fd.viewAllProfileDao();
	}

}
