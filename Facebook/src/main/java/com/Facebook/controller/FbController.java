package com.Facebook.controller;

import com.Facebook.service.FbService;
import com.Facebook.service.FbServiceInterface;

public class FbController implements FbControllerInterface {
	//service object in controller
	private FbServiceInterface fc;
	public FbController() {
		fc=new FbService();
	}
	@Override
	public void createProfile() {
		// TODO Auto-generated method stub
		System.out.println("Profile Created!");
	}

	@Override
	public void editProfile() {
		// TODO Auto-generated method stub1
		System.out.println("Profile Edited!");
		
	}

	@Override
	public void deleteProfile() {
		// TODO Auto-generated method stub
		System.out.println("Profile Deleted!");
		
	}

	@Override
	public void viewProfile() {
		// TODO Auto-generated method stub
		System.out.println("Profile details!");
		
		
	}

	@Override
	public void searchProfile() {
		// TODO Auto-generated method stub
		
		
	}

}
