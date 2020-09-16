package com.wa_java.controller;

import com.wa_java.service.WaService;
import com.wa_java.service.WaServiceInterface;

public class WaController implements WaControllerInterface {
	private WaServiceInterface ws;
	public WaController() {
		ws=new WaService();
	}
	@Override
	public void createProfile() {
		// TODO Auto-generated method stub
		ws.createProfileService();
		System.out.println("profile created");
	}
	@Override
	public void message() {
		// TODO Auto-generated method stub
		ws.messageService();
		System.out.println("message sent");
		
	}
	@Override
	public void search() {
		// TODO Auto-generated method stub
		ws.searchService();
		System.out.println("search done");
		
	}
	@Override
	public void call() {
		// TODO Auto-generated method stub
		ws.callService();
		System.out.println("call connected");
		
	}
	
}
