package com.first_javas.service;

import com.first_javas.dao.FacebookDAO;
import com.first_javas.dao.FacebookDAOInterface;

public class Facebookservice implements FacebookServiceInterface {


	private FacebookDAOInterface fd;
	
	public Facebookservice(){
		fd=new FacebookDAO();
	}
	
		public void deleteprofileservice()
		{
			fd.deleteprofileDAO();
		}
		public void createprofileservice()
		{
			fd.createprofileDAO();
		}
		public void viewprofileservice()
		{
			fd.viewprofileDAO();
		}
		
		public void updateprofileservice() {
			fd.updateprofileDAO();
		}
		public void findprofileservice() {
			fd.findprofileDAO();
		}
		public void activeprofileservice() {
	}
	

}
