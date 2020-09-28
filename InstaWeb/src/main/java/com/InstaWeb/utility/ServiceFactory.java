package com.InstaWeb.utility;

import com.InstaWeb.service.InstaService;
import com.InstaWeb.service.InstaServiceInterface;

public class ServiceFactory {
	public ServiceFactory(){
		
	}
	public static InstaServiceInterface createObject(String t)
	{
		InstaServiceInterface s=null;
		if(t.equals("user"))
			s=new InstaService();		
		return s;
	}
}
