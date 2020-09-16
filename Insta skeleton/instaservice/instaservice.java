package com.first_java.instaservice;

import com.first_java.instadao.instadao;
import com.first_java.instadao.instadaointerface;

public class instaservice implements instaserviceinterface{
	
	private instadaointerface id;
	
	public instaservice()
	{
		id=new instadao();
	}

	@Override
	public void servicesendreq() {
		System.out.println("finding person u eneter");
		id.daorequest();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void servicesearchphoto() {
		id.daosearch();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void servicecomment() {
		id.daocomment();
		// TODO Auto-generated method stub
		
	}

}
