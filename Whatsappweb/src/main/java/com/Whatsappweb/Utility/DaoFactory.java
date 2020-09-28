package com.Whatsappweb.Utility;

import com.Whatsappweb.Dao.WhatsappDao;
import com.Whatsappweb.Dao.WhatsappDaoInterface;

public class DaoFactory {
	DaoFactory(){
		
	}
	
	public static WhatsappDaoInterface createObject(String s)
	{
		WhatsappDaoInterface d=null;
		
		if(s.equals("admin"))
			d= new WhatsappDao();
		
		return d;
	}
	
}
