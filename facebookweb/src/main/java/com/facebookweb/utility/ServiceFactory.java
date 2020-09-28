package com.facebookweb.utility;

import com.facebookweb.service.FacebookwebService;
import com.facebookweb.service.FacebookwebServiceInterface;

public class ServiceFactory {
	ServiceFactory(){
		
	}
	
	public static FacebookwebServiceInterface createObject(String st) {
		FacebookwebServiceInterface s=null;
		if(st.equals("adminpath"))
			s=new FacebookwebService();
		return s;
	}
}
