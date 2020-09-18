package com.instagram.dao;

import java.util.List;

import com.instagram.entity.InstagramUser;

public interface InstagramDAOInterface {

	int createProfileDAO(InstagramUser iu)throws Exception;

	void editProfileDAO()throws Exception;

	void deleteProfileDAO()throws Exception;

	List<InstagramUser> searchProfileDAO(InstagramUser iu)throws Exception;

	List<InstagramUser> viewallProfileDAO()throws Exception;

	InstagramUser viewProfileDAO(InstagramUser iu)throws Exception;

}
