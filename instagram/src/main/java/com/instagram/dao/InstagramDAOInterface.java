package com.instagram.dao;

import java.util.List;
import java.util.Map;

import com.instagram.entity.InstagramUser;
import com.instagram.utility.InstagramException;

public interface InstagramDAOInterface {
	
	String adminpath="c:/";

	int createProfileDAO(InstagramUser iu)throws Exception;

	void editProfileDAO()throws Exception;

	void deleteProfileDAO()throws Exception;

	List<InstagramUser> searchProfileDAO(InstagramUser iu)throws InstagramException;

	List<InstagramUser> viewallProfileDAO();

	InstagramUser viewProfileDAO(InstagramUser iu)throws Exception;

	int editprofilebynamedao(InstagramUser iu)throws Exception;

	Map<String, List<InstagramUser>> userdetailwithhistorydao();

}
