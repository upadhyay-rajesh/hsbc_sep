package com.first_java.service;

import com.first_java.dao.FacebookDao;
import com.first_java.dao.FacebookDaoInterface;

public class FacebookService implements FacebookServiceInterface{

	private FacebookDaoInterface fi1;
	
	public FacebookService(){
		fi1=new FacebookDao();
	}
	@Override
	public void createProfileService() {
		// TODO Auto-generated method stub
		fi1.createProfileDao();
		System.out.println("profile created");
	}

	@Override
	public void editProfileService() {
		// TODO Auto-generated method stub
		fi1.editProfileDao();
		System.out.println("profile edited");
		
	}

	@Override
	public void deleteProfileService() {
		// TODO Auto-generated method stub
		fs.deleteProfileDao();
		System.out.println("profile deleted");
		
	}

	@Override
	public void viewProfileService() {
		// TODO Auto-generated method stub
		fi1.viewProfileDao();
		System.out.println("profile viewed");
		
	}

	@Override
	public void searchProfileService() {
		// TODO Auto-generated method stub
		fi1.searchProfileDao();
		System.out.println("profile searched");
		
	}

	@Override
	public void viewAllProfileService() {
		// TODO Auto-generated method stub
		fi1.viewAllProfileDao();
		System.out.println("profile viewed");
		
	}
}
