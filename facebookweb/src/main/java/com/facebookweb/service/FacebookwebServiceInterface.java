package com.facebookweb.service;

import java.util.List;

import com.facebook.entity.FacebookUser;


public interface FacebookwebServiceInterface {
	public int createProfileService(FacebookUser u) throws Exception;

	public boolean loginProfile(FacebookUser f);

	public List<FacebookUser> friendProfile(FacebookUser f);
}
