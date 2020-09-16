package com.Whatsapp.controller;


import com.Whatsapp.service.WhatsappServiceInterface;
import com.Whatsapp.service.WhatsappService;
public class Whatsappcontroller implements Whatsappcontrollerinterface {
	
	private WhatsappServiceInterface ws;
	
	public Whatsappcontroller(){
		ws=new WhatsappService();
	}
	@Override
	public void deleteprofile() 
	{
		ws.deleteprofileservice();
		System.out.println("profile deleted");
		//System.out.println();
	}
	@Override
	public void createprofile() 
	{
		ws.createprofileservice();
		System.out.println("profile created");
	}
	@Override
	public void viewprofile()
	{
		ws.viewprofileservice();
		System.out.println("profile detail");
	}
	@Override
	public void updateprofile() 
	{
		ws.updateprofileservice();
	}
	@Override
	public void findprofile()
	{
		ws.findprofileservice();
	}
	
	public void activeprofile() 
	{
		ws.activeprofileservice();
	}	
}
