package com.first_java.service;

import com.first_java.dao.FacebookDAO;

public class FacebookService implements FacebookServiceInterface {
	
	FacebookDAO fd;
	
	public FacebookService () {
		
		fd = new FacebookDAO();
	}
	
	@Override
	public void createProfileService() {
		// TODO Auto-generated method stub
		fd.createProfileDAO();
	}

	@Override
	public void deleteProfileService() {
		// TODO Auto-generated method stub
		fd.deleteProfileDAO();
	}

	@Override
	public void editProfileService() {
		// TODO Auto-generated method stub
		fd.editProfileDAO();
	}

	@Override
	public void viewProfileService() {
		// TODO Auto-generated method stub
		fd.viewProfileDAO();
	}

	@Override
	public void searchProfileService() {
		// TODO Auto-generated method stub
		fd.searchProfileDAO();
	}

}
