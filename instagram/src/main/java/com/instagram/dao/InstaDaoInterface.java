package com.Instagram.dao;

import java.util.List;

import com.Instagram.utility.InstaException;

import InstaEntity.InstaUser;

public interface InstaDaoInterface {
	boolean checkProfileDao(InstaUser u)  ;
	void editProfileDao(InstaUser u) ;
	List<InstaUser> viewProfileDao() throws InstaException;
	boolean deleteProfileDao(InstaUser u)   ;
	
	int createProfileDao(InstaUser u) throws Exception   ;
	
	boolean editNameDao(InstaUser u)   ;
	boolean editPasswordDao(InstaUser u)   ;
	boolean editEmailDao(InstaUser u)   ;
}
