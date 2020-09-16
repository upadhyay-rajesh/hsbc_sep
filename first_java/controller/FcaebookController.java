package com.first_java.controller;

import com.first_java.service.*;
public class FcaebookController implements FacebookControllerInterface {
	
	private FcebookServiceInterface fs;

	public FcaebookController()
	{
		fs = new FcebookService();
		
	}
	@Override
	public void viewProfile() {
		
		fs.viewProfileService();
		
		
		
	}

	@Override
	public void createProfile() {
		fs.createProfileService();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchProfile() {
		fs.searchProfileService();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProfile() {
		fs.deleteProfileService();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewAllProfile() {
		fs.viewAllProfileService();
		// TODO Auto-generated method stub
		
	}

}
