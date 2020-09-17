package com.instagram.dao;

import com.instagram.entity.InstagramUser;

public class InstagramDAO implements InstagramDAOInterface {

	public int createProfileDAO(InstagramUser iu) {
		
		int i=0;
		
		System.out.println("in dao "+iu.getName());
		
		if(iu.getName().equals("Ashutosh")) {
			i=1;
		}
		
		return i;

	}

	public void editProfileDAO() {
		// TODO Auto-generated method stub

	}

	public void deleteProfileDAO() {
		// TODO Auto-generated method stub

	}

	public void searchProfileDAO() {
		// TODO Auto-generated method stub

	}

	public void viewallProfileDAO() {
		// TODO Auto-generated method stub

	}

	public void viewProfileDAO() {
		// TODO Auto-generated method stub

	}

}
