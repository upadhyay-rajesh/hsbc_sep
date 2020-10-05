package com.instagram.controller;

import com.instagram.service.InstagramService;
import com.instagram.service.InstagramServiceInterface;

public interface InstagramControllerInterface {

	void abc() throws Exception;
	
	public static InstagramController createObject(String nn) {
		InstagramController is=null;
		if(nn.equals("adminservice")) {
			is=new InstagramController();
		}
		return is;
	}

	//void editProfile()throws Exception;

	//void deleteProfile()throws Exception;

	//void searchProfile()throws Exception;

	//void viewAllProfile();

	//void viewProfile()throws Exception;

	//void createcustomtable()throws Exception;

	//void userdetailwithhistory();

}
