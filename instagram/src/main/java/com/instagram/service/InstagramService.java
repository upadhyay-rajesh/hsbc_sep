package com.instagram.service;

import com.instagram.dao.InstagramDAO;
import com.instagram.dao.InstagramDAOInterface;
import com.instagram.entity.InstagramUser;

public class InstagramService implements InstagramServiceInterface {
	
	private InstagramDAOInterface id;
	
	public InstagramService() {
		id=new InstagramDAO();
	}

	public int createprofileService(InstagramUser iu) {
		int i=id.createProfileDAO(iu);
		
		return i;

	}

	public void editprofileService() {
		id.editProfileDAO();

	}

	public void deleteprofileService() {
		id.deleteProfileDAO();

	}

	public void viewallprofileService() {
		id.viewallProfileDAO();

	}

	public void searchprofileService() {
		id.searchProfileDAO();

	}

	public void viewprofileService() {
		id.viewProfileDAO();

	}

}
