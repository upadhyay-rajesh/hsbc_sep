package com.Instagram.service;

import java.util.List;

import com.Instagram.utility.InstaException;

import InstaEntity.InstaUser;

public interface InstaServiceInterface {
	
	int createProfileService(InstaUser u) throws Exception;
	boolean checkProfileService(InstaUser u);
	void editProfileService() ;
	List<InstaUser> viewProfileService() throws InstaException ;
	boolean deleteProfileService(InstaUser u) ;
	boolean editNameService(InstaUser u) ;
	boolean editPasswordService(InstaUser u);
	boolean editEmailService(InstaUser u);
	
	

}
