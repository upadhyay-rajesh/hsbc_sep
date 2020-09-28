package com.facebookweb.utility;

import com.facebook.dao.FacebookDao;
import com.facebook.dao.FacebookwebDao;

public class DaoFactory {
	public DaoFactory() {}
	
	public static FacebookwebDao createObject(String s) {
		FacebookwebDao d=null;
		
		if(s.equals("adminpath")) {
			d=new FacebookDao();
		}
		return d;
	}
}
