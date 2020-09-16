package com.second_day.service;

import com.second_day.dao.LinkedinDao;
import com.second_day.dao.LinkedinDaoInterface;

public class LinkedinService implements LinkedinServiceInterface {
private LinkedinDaoInterface ldao;
	
	public LinkedinService(){
		ldao=new LinkedinDao();
	}

	@Override
	public void createProfileService() {
		ldao.addData();
		System.out.println("Create Profile Service");
		
	}

	@Override
	public void editProfileService() {
		ldao.deleteData();
		System.out.println("Edit Profile Service");
	}

	@Override
	public void deleteProfileService() {
		
	}

	@Override
	public void viewProfileService() {
	
		
	}

	

}
