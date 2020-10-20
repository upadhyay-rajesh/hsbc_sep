package com.instagram.service;

import java.util.List;
import java.util.Map;

import com.instagram.dao.InstagramDAO;
import com.instagram.dao.InstagramDAOInterface;
import com.instagram.entity.InstagramUser;
import com.instagram.utility.InstagramException;

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

	public List<InstagramUser> viewallprofileService() {
		return id.viewallProfileDAO();

	}

	public List<InstagramUser> searchprofileService(InstagramUser iu)throws InstagramException {
		List<InstagramUser> ll=null;
		try {
			ll=id.searchProfileDAO(iu);
		}
		catch(InstagramException e) {
			throw new InstagramException("");
		}
		return ll;

	}

	public InstagramUser viewprofileService(InstagramUser iu)throws Exception {
		InstagramUser uu=id.viewProfileDAO(iu);
		
		return uu;

	}

	public int editprofilebyname(InstagramUser iu) throws Exception {
		return id.editprofilebynamedao(iu);
	}

	@Override
	public Map<String, List<InstagramUser>> userdetailwithhistoryservice() {
		// TODO Auto-generated method stub
		return id.userdetailwithhistorydao();
	}

}









