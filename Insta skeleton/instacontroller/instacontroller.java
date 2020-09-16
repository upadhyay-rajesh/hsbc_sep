package com.first_java.instacontroller;

import com.first_java.instaservice.instaservice;
import com.first_java.instaservice.instaserviceinterface;

public class instacontroller implements instacontrollerinterface {
	
	private instaserviceinterface is;

	public instacontroller()
	{
		is=new instaservice();
	}
	@Override
	public void sendrequest() {
		
		System.out.println("enter name of person you want to req");
		is.servicesendreq();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchphoto() {
		is.servicesearchphoto();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comments() {
		is.servicecomment();
		// TODO Auto-generated method stub
		
	}

}
