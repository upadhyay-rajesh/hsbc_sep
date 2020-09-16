package com.first_java.service;
import com.first_java.dao.FacebookDAO;
import com.first_java.dao.FacebookDAOInterface;
public class FacebookService implements FacebookServiceInterface{
	private FacebookDAOInterface fd;
	public FacebookService(){
		fd=new FacebookDAO();
	}
	@Override
	public void createProfileService() {
		// TODO Auto-generated method stub
		fd.createProfileDAO();
		
	}

	@Override
	public void editProfileService() {
		fd.editProfileDAO();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProfileService() {
		// TODO Auto-generated method stub
		fd.deleteProfileDAO();
		
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

	@Override
	public void viewAllProfileService() {
		// TODO Auto-generated method stub
		fd.viewAllProfileDAO();
		
	}

}
