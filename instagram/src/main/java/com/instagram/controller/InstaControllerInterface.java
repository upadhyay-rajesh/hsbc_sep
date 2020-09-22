package com.Instagram.controller;

import com.Instagram.utility.InstaException;

public interface InstaControllerInterface {
	void createProfile() throws Exception ;
	boolean checkProfile() throws Exception ;
	void editProfile() ;
	void editName();
	void editPassword();
	void editEmail() ;
	void viewProfile() ;
	void deleteProfile() ;
	void getProfile() throws InstaException ;
}
