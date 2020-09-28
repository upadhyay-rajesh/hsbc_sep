package com.InstaWeb.service;

import java.util.List;

import com.InstaWeb.utility.InstaUser;



public interface InstaServiceInterface {
	public int createProfileService(InstaUser u) throws Exception;

	public boolean loginProfile(InstaUser f);

	public List<InstaUser> friendProfile(InstaUser f);
}
