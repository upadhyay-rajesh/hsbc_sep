package com.second_java.service;

import com.second_java.dao.WhatsAppDao;
import com.second_java.dao.WhatsAppDaoInterface;

public class WhatsAppService implements WhatsAppServiceInterface {

	WhatsAppDaoInterface wd;
	
	public WhatsAppService()
	{
		wd= new WhatsAppDao();
	}
	

	@Override
	public void newMessageService() {
		// TODO Auto-generated method stub
		wd.newMessageDao();
	}

	@Override
	public void editAccountService() {
		// TODO Auto-generated method stub
	wd.editAccountDao();	
	}

	@Override
	public void deleteAccountService() {
		// TODO Auto-generated method stub
		wd.deleteAccountDao();
	}

	@Override
	public void viewProfilePictureService() {
		// TODO Auto-generated method stub
		wd.viewProfilePictureDao();
	}

	@Override
	public void addNewContactService() {
		// TODO Auto-generated method stub
		wd.addNewContactDao();
	}

	@Override
	public void searchChatsService() {
		// TODO Auto-generated method stub
		wd.searchChatsDao();
	}

}
