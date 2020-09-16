package com.Instagram.service;

import com.Instagram.dao.InstagramDao;
import com.Instagram.dao.InstagramDaoInterface;

public class InstagramService implements InstagramServiceInterface {
	
	private InstagramDaoInterface id;
	
	public InstagramService(){
		id=new InstagramDao();
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


