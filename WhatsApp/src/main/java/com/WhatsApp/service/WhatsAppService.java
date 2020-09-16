package com.WhatsApp.service;

import com.WhatsApp.dao.WhatsAppDao;
import com.WhatsApp.dao.WhatsAppDaoInterface;

public class WhatsAppService implements WhatsAppServiceInterface {
	private WhatsAppDaoInterface wd;
	public WhatsAppService() {
		wd=new WhatsAppDao();
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
