package controller;

import service.serviceInterface;
import service.serviceClass;

public class WhatsAppControllerClass implements WhatsappController {
	
	private serviceInterface s;
	
	public WhatsAppControllerClass()
	{
		s = new serviceClass();
	}

	@Override
	public void createAccount() {
		s.createAccountservice();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewAccount() {
		s.viewAccountservice();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccount() {
		s.deleteAccountservice();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewMsgs() {
		s.viewMsgsservice();
		// TODO Auto-generated method stub
		
	}

	
	
	

}
