package com.linkedin.controller;

public interface LinkedinControllerInterface {
	void register();
	void signin() throws Exception;
	void signout();
	void connect();
	void createPost();

}
