package com.instagram.service;

import java.util.List;

import com.instagram.dao.InstagramDAO;
import com.instagram.dao.InstagramDAOInterface;
import com.instagram.entity.InstagramUser;

public class InstagramService implements InstagramServiceInterface {
	
	private InstagramDAOInterface id;
	
	public InstagramService() {
		id=new InstagramDAO();
	}

	public int createprofileService(InstagramUser iu)throws Exception {
		int i=id.createProfileDAO(iu);
		
		return i;

	}

	public void editprofileService()throws Exception {
		id.editProfileDAO();

	}

	public void deleteprofileService()throws Exception {
		id.deleteProfileDAO();

	}

	public List<InstagramUser> viewallprofileService() throws Exception{
		return id.viewallProfileDAO();

	}

	public List<InstagramUser> searchprofileService(InstagramUser iu) throws Exception{
		return id.searchProfileDAO(iu);

	}

	public InstagramUser viewprofileService(InstagramUser iu)throws Exception {
		InstagramUser uu=id.viewProfileDAO(iu);
		
		return uu;

	}

	public int editprofilebyname(InstagramUser iu) throws Exception {
		return id.editprofilebynamedao(iu);
	}

}









