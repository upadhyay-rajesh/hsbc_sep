package com.Whatsappweb.Utility;

import com.Whatsappweb.Service.WhatsappService;
import com.Whatsappweb.Service.WhatsappServiceInterface;

public class ServiceFactory {
	
	public ServiceFactory() {
		
	}
	
	public static WhatsappServiceInterface createObject(String t) {
		WhatsappServiceInterface s=null;
		if(t.equals("admin"))
			s=new WhatsappService();
		return s;
	}

}
