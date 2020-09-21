package com.linkedin.service;

import com.linkedin.entity.LinkedinUser;

public interface LinkedinServiceInterface {
	void register();
	boolean signin(LinkedinUser lu);
	void signout();
	void connect();
	void createPost();
}
