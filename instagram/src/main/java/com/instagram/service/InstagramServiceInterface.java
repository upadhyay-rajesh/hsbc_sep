package com.instagram.service;

import java.util.List;

import com.instagram.entity.InstagramUser;

public interface InstagramServiceInterface {

	int createprofileService(InstagramUser iu)throws Exception;

	void editprofileService()throws Exception;

	void deleteprofileService()throws Exception;

	List<InstagramUser> viewallprofileService()throws Exception;

	List<InstagramUser> searchprofileService(InstagramUser iu)throws Exception;

	InstagramUser viewprofileService(InstagramUser iu)throws Exception;

}
