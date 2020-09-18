package com.instagram.dao;

import com.instagram.entity.InstagramUser;

public interface InstagramDAOInterface {

	int createProfileDAO(InstagramUser iu)throws Exception;

	void editProfileDAO()throws Exception;

	void deleteProfileDAO()throws Exception;

	void searchProfileDAO()throws Exception;

	void viewallProfileDAO()throws Exception;

	InstagramUser viewProfileDAO(InstagramUser iu)throws Exception;

}
