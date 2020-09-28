package com.facebookweb.service;

import java.util.List;

import com.facebook.dao.FacebookwebDao;
import com.facebook.entity.FacebookUser;
import com.facebookweb.utility.DaoFactory;

public class FacebookwebService implements FacebookwebServiceInterface {
	FacebookwebDao d=null;
	public FacebookwebService() {
		d= DaoFactory.createObject("adminpath");
	}
	
	@Override
	public int createProfileService(FacebookUser u) throws Exception  {
		// TODO Auto-generated method stub
		int i=d.createProfileDao(u);
		return i;
	}

	@Override
	public boolean loginProfile(FacebookUser u) {
		// TODO Auto-generated method stub
		return  d.loginProfileDao(u);
	}

	@Override
	public List<FacebookUser> friendProfile(FacebookUser f) {
		// TODO Auto-generated method stub
		return d.friendlistDao(f);
	}

}
