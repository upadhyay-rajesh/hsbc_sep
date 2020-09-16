package com.Facebook.service;

import com.Facebook.dao.FacebookDao;
import com.Facebook.dao.FacebookDaoInterface;

public class FacebookService implements FacebookServiceInterface {
	
	private FacebookDaoInterface fd;
	
	public FacebookService(){
		fd=new FacebookDao();
	}

		@Override
		public void createProfileService() {
			
		}

		@Override
		public void editProfileService() {
			
		}

		@Override
		public void deleteProfileService() {
			
		}

		@Override
		public void viewProfileService() {
			
		}

	}


