package com.LinkedIn.service;

import com.LinkedIn.dao.LinkedInDao;
import com.LinkedIn.dao.LinkedInDaoInterface;

public class LinkedInService implements LinkedInServiceInterface{
	private LinkedInDaoInterface wd;
	public LinkedInService()
	{
		wd= new LinkedInDao();
	}
	@Override
	public void createProfileService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editProfileService() {
		// TODO Auto-generated method stub
		
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

}
