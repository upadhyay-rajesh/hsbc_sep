package com.first_java.service;
import com.first_java.dao.*;
public class FcebookService implements FcebookServiceInterface{
	
	private FacebookDaoInterface fd;
	public FcebookService ()
	{
		fd = new FacebookDao();
	}

	@Override
	public void viewProfileService() {
		fd.viewProfileDao();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createProfileService() {
		fd.createProfileDao();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchProfileService() {
		fd.searchProfileDao();
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProfileService() {
		fd.deleteProfileDao();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewAllProfileService() {
		fd.viewAllProfileDao();
		// TODO Auto-generated method stub
		
	}

}
