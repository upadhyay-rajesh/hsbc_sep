package com.InstaWeb.utility;

import com.InstaWeb.dao.InstaDao;
import com.InstaWeb.dao.InstaDaoInterface;

public class DaoFactory {
	public DaoFactory() {
		
	}
	
	public static InstaDaoInterface createObject(String t)
	{
		InstaDaoInterface d=null;
		if(t.equals("user"))
			d=new InstaDao();		
		return d;
	}
}
