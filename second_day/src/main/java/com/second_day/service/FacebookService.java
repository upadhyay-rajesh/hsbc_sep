package com.second_day.service;

import com.second_day.dao.FacebookDao;
import com.second_day.dao.FacebookDaoInterface;

public class FacebookService implements FacebookServiceInterface {
	
private FacebookDaoInterface fdao;
	
	public FacebookService(){
		fdao=new FacebookDao();
	}

	@Override
	public void createProfileService() {
		fdao.addData();
		System.out.println("Create Profile Service");
		
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

	@Override
	public void viewAllProfileService() {
		// TODO Auto-generated method stub
		
	}

}
