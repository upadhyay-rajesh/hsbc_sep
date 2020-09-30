package com.facebookweb.utility;

import com.facebookweb.Service.FacebookService;
import com.facebookweb.Service.FacebookServiceInterface;

public class FacebookServiceFactory {

	private FacebookServiceFactory() {
	}
	
	public static FacebookServiceInterface createObject() {
		FacebookServiceInterface s = new FacebookService();
		return s;
	}
}
