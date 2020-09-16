package com.second_day.service;

import com.second_day.dao.TelegramDao;
import com.second_day.dao.TelegramDaoInterface;

public class TelegramService implements TelegramServiceInterface{
	
 private TelegramDaoInterface td;
	
	public TelegramService(){
		td=new TelegramDao();
	}

	@Override
	public void createProfileService() {
		td.addData();
		System.out.println("Create Profile Service");
		
	}

	@Override
	public void editProfileService() {
		td.deleteData();
		System.out.println("Edit Profile Service");
	}

	@Override
	public void deleteProfileService() {
		
	}

	@Override
	public void viewProfileService() {
	
		
	}

	
	

}
