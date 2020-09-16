package com.wa_java.service;

import com.wa_java.dao.WaDao;
import com.wa_java.dao.WaDaoInterface;

public class WaService implements WaServiceInterface {

	private WaDaoInterface wd;
	public WaService() {
		wd= new WaDao();
	}
	@Override
	public void createProfileService() {
		// TODO Auto-generated method stub
		wd.createProfileDao();
		System.out.println("profile created");
		
	}
	@Override
	public void messageService() {
		// TODO Auto-generated method stub
		wd.messageDao();
		System.out.println("message sent");
		
	}
	@Override
	public void searchService() {
		// TODO Auto-generated method stub
		wd.searchDao();
		System.out.println("profile created");
		
	}
	@Override
	public void callService() {
		// TODO Auto-generated method stub
		wd.callDao();
		System.out.println("call connected");
		
	}
	
}
