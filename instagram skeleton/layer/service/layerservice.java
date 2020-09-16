package com.layer.service;


import com.layer.dao.layerdao;
import com.layer.dao.layerdaointerface;

public class layerservice implements layerserviceinterface{
	
	private layerdaointerface ld;
	public layerservice() {
		ld=new layerdao();
	}

	public void viewstoryservice() {
		// TODO Auto-generated method stub
		
	}

	public void likeapostservice() {
		// TODO Auto-generated method stub
		
	}

	public void deleteacommentservice() {
		// TODO Auto-generated method stub
		
	}

}

//private Facebookdaointerface fd;
//public Facebookservice() {
//	fd=new Facebookdao();
//}