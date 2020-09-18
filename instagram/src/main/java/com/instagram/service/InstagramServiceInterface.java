package com.instagram.service;

import com.instagram.entity.InstagramUser;

public interface InstagramServiceInterface {

	int createprofileService(InstagramUser iu)throws Exception;

	void editprofileService()throws Exception;

	void deleteprofileService()throws Exception;

	void viewallprofileService()throws Exception;

	void searchprofileService()throws Exception;

	InstagramUser viewprofileService(InstagramUser iu)throws Exception;

}
