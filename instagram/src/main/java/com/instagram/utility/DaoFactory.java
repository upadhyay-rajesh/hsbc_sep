package com.Instagram.utility;

import com.Instagram.dao.InstaDao;
import com.Instagram.dao.InstaDaoInterface;

public class DaoFactory {
	private DaoFactory() {
		
	}
	
	public static InstaDaoInterface createObject(String n) {
		InstaDaoInterface d=null;
		if(n.equals("Adminservice"))
			d=new InstaDao();
		
		return d;
	}
}
