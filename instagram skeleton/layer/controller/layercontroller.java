package com.layer.controller;

import com.layer.service.layerservice;
import com.layer.service.layerserviceinterface;

public class layercontroller implements layercontrollerinterface{
	private layerserviceinterface ls;
	public layercontroller() {
		ls=new layerservice();
	}

	public void viewstory() {
		// TODO Auto-generated method stub
		ls.viewstoryservice();
		System.out.println("view story");
	}

	public void likeapost() {
		// TODO Auto-generated method stub
		
	}

	public void deleteacomment() {
		// TODO Auto-generated method stub
		
	}

}
