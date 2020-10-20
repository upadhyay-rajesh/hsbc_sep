package com.instagram.utility;

import com.instagram.service.InstagramService;
import com.instagram.service.InstagramServiceInterface;

public class ServiceFactory {
	private ServiceFactory() {
		
	}
	
	public static InstagramServiceInterface createObject(String nn) {
		InstagramServiceInterface is=null;
		if(nn.equals("adminservice")) {
			is=new InstagramService();
		}
		return is;
	}
}
