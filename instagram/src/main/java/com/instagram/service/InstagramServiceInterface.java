package com.instagram.service;

import java.util.List;
import java.util.Map;

import com.instagram.entity.InstagramUser;
import com.instagram.utility.InstagramException;

public interface InstagramServiceInterface {

	int createprofileService(InstagramUser iu)throws Exception;

	void editprofileService()throws Exception;

	void deleteprofileService()throws Exception;

	List<InstagramUser> viewallprofileService();

	List<InstagramUser> searchprofileService(InstagramUser iu)throws InstagramException;

	InstagramUser viewprofileService(InstagramUser iu)throws Exception;

	int editprofilebyname(InstagramUser iu)throws Exception;

	Map<String, List<InstagramUser>> userdetailwithhistoryservice();

}
