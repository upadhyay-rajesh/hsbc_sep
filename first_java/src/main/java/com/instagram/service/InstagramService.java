package com.instagram.service;

import com.instagram.dao.InstagramDao;
import com.instagram.dao.InstagramDaoInterface;

public class InstagramService implements InstagramServiceInterface {

	private InstagramDaoInterface idi;
	public InstagramService()
	{
		idi=new InstagramDao();
	}
	@Override
	public void createImageService() {
		idi.createImageDao();	
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteImageService() {
		idi.deleteImageDao();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createProfileService() {
		idi.createProfileDao();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewProfileService() {
		idi.viewProfileSDao();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProfileService() {
		idi.deleteProfileDao();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void homepageRedirectService() {
		idi.homepageRedirectDao();
		// TODO Auto-generated method stub
		
	}

	

}
