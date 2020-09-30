package com.facebookweb.Service;

import java.sql.SQLException;
import java.util.List;

import com.facebookweb.entity.FacebookUser;

public interface FacebookServiceInterface {
	int createProfile(FacebookUser f);

	boolean loginProfile(FacebookUser fUser);
	boolean doesUserExist(FacebookUser fUser);
	
	List<String> getSuggestions(String s);
} 
