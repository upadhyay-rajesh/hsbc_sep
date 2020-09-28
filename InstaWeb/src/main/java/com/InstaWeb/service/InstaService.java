package com.InstaWeb.service;

import java.util.List;

import com.InstaWeb.dao.InstaDaoInterface;
import com.InstaWeb.utility.DaoFactory;
import com.InstaWeb.utility.InstaUser;

public class InstaService implements InstaServiceInterface{
	private InstaDaoInterface d;
	
	public InstaService(){
		d= DaoFactory.createObject("user");
	}
	@Override
	public int createProfileService(InstaUser u) throws Exception {
		// TODO Auto-generated method stub
		return d.createProfileDao(u);
	}

	@Override
	public boolean loginProfile(InstaUser f) {
		// TODO Auto-generated method stub
		return d.loginProfileDao(f);
	}

	@Override
	public List<InstaUser> friendProfile(InstaUser f) {
		// TODO Auto-generated method stub
		return d.friendlistDao(f);
	}

}
