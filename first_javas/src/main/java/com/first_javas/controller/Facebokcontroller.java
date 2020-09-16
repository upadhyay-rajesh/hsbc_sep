package com.first_javas.controller;

import com.first_javas.service.FacebookServiceInterface;
import com.first_javas.service.Facebookservice;

public class Facebokcontroller implements FacebookControllerinterface {
	
	private FacebookServiceInterface fs;
	
	public Facebokcontroller(){
		fs=new Facebookservice();
	}
	
	@Override
	public void deleteprofile() 
	{
		fs.deleteprofileservice();
		System.out.println("profile deleted");
		//System.out.println();
	}
	@Override
	public void createprofile() 
	{
		fs.createprofileservice();
		System.out.println("profile created");
	}
	@Override
	public void viewprofile()
	{
		fs.viewprofileservice();
		System.out.println("profile detail");
	}
	@Override
	public void updateprofile() 
	{
		fs.updateprofileservice();
	}
	@Override
	public void findprofile()
	{
		fs.findprofileservice();
	}
	
	public void activeprofile() 
	{
		fs.activeprofileservice();
	}	

}
