package com.Whatsapp.service;

import com.Whatsapp.dao.WhatsappDao;
import com.Whatsapp.dao.WhatsappDaoInterface;

public class WhatsappService implements WhatsappServiceInterface {
	
	private WhatsappDaoInterface wd;
	
	public void WhatsappService() {
		wd= new WhatsappDao();
		}
	
	public void viewMessageService()
	{
		wd.viewMessageDao();
	}
	
	public void sendMessageService()
	{
		wd.sendMessageDao();
	
	}
	
	public void deleteMessageService()
	{
		wd.deleteMessageDao();
	}
	
	public void searchMessageService()
	{
		wd.searchMessageDao();
	}
	public void viewProfileService()
	{
		wd.viewProfileDao();
	}
	public void blockProfileService()
	{
		wd.blockProfileDao();
	}

}
