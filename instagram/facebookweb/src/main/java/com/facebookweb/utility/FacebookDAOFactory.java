package com.facebookweb.utility;

import com.facebookweb.DAO.FacebookDAO;
import com.facebookweb.DAO.FacebookDAOInterface;

public class FacebookDAOFactory {

	private FacebookDAOFactory() {
		
	}
	
	public static FacebookDAOInterface createObject() {
		FacebookDAOInterface d = new FacebookDAO();
		return d;
	}
}
