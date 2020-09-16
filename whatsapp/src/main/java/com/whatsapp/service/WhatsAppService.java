package com.whatsapp.service;
import com.whatsapp.dao.WhatsAppDAO;
import com.whatsapp.dao.WhatsAppDAOInterface;



public class WhatsAppService implements WhatsAppServiceInterface{

		
		private WhatsAppDAOInterface fd;
		
		public WhatsAppService() {
			fd=new WhatsAppDAO();
		}

		@Override
		public void createProfileService() {
			
			fd.createProfileDAO();
			// TODO Auto-generated method stub
			
		}

		@Override
		public void viewChatsService() {
			fd.viewChatsDAO();
			
		}

		@Override
		public void viewStatusService() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void viewCallsService() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void searchChatsService() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void viewAllContactsService() {
			// TODO Auto-generated method stub
			
		}

}

