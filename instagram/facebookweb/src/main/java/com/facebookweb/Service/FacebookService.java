package com.facebookweb.Service;

import java.sql.SQLException;
import java.util.List;

import com.facebookweb.DAO.FacebookDAOInterface;
import com.facebookweb.entity.FacebookUser;
import com.facebookweb.utility.FacebookDAOFactory;

public class FacebookService implements FacebookServiceInterface {

	private FacebookDAOInterface d;
	
	public FacebookService() {
		d = FacebookDAOFactory.createObject();
	}
	
	@Override
	public int createProfile(FacebookUser f) {
		// TODO Auto-generated method stub
		return d.createProfile(f);
		
	}

	@Override
	public boolean loginProfile(FacebookUser fUser) {
		// TODO Auto-generated method stub
		return d.loginProfile(fUser);
	}

	@Override
	public boolean doesUserExist(FacebookUser fUser) {
		// TODO Auto-generated method stub
		return d.doesUserExist(fUser);
	}

	@Override
	public List<String> getSuggestions(String s) {
		// TODO Auto-generated method stub
		return d.getSuggestions(s);
	}

}
