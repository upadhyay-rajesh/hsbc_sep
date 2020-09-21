package com.linkedin.dao;

import com.linkedin.entity.LinkedinUser;

public interface LinkedinDaoInterface {
	void register();
	boolean signin(LinkedinUser lu);
	void signout();
	void connect();
	void createPost();
}
