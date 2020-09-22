package com.Instagram.utility;

import com.Instagram.service.InstaService;
import com.Instagram.service.InstaServiceInterface;

public class ServiceFactory {
	//no one will be able to create obj of this servicefactory because private
	private ServiceFactory() {
		
		
	}
	//if obj is to be created call createObject
	public static InstaServiceInterface createObject(String nn) {
		InstaServiceInterface is =null;
		if(nn.equals("adminservice")) {
			is=new InstaService();
		}
		return is;
	}
}
