package com.instagram.dao;

import com.instagram.entity.InstagramUser;

public interface InstagramDAOInterface {

	int createProfileDAO(InstagramUser iu);

	void editProfileDAO();

	void deleteProfileDAO();

	void searchProfileDAO();

	void viewallProfileDAO();

	void viewProfileDAO();

}
