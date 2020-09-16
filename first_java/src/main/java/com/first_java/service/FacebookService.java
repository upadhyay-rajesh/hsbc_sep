package com.first_java.service;

import com.first_java.dao.FacebookDAO;
import com.first_java.dao.FacebookDAOInterface;

public class FacebookService implements FacebookServiceInterface{
	
	private FacebookDAOInterface fd;
	
	public FacebookService() {
		fd=new FacebookDAO();
	}

	@Override
	public void createProfileService() {
		
		fd.createProfileDAO();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editProfileService() {
		fd.editProfileDAO();
		
	}

	@Override
	public void deleteProfileService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewProfileService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchProfileService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewAllProfileService() {
		// TODO Auto-generated method stub
		
	}

}
