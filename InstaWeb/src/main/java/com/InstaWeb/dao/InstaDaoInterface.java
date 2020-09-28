package com.InstaWeb.dao;

import java.util.List;

import com.InstaWeb.utility.InstaUser;


public interface InstaDaoInterface {
	int createProfileDao(InstaUser u) throws Exception;

	boolean loginProfileDao(InstaUser u);

	List<InstaUser> friendlistDao(InstaUser f);
}
