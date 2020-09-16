package com.Facebook.service;

import com.Facebook.dao.FbDao;
import com.Facebook.dao.FbDaoInterface;

public class FbService implements FbServiceInterface {

	private FbDaoInterface fd;
	public FbService() {
		fd = new FbDao();
	}
	//object of controller in service
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
