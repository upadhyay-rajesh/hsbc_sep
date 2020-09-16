package com.linkedin.controller;
import com.linkedin.controller.LinkedinControllerInterface;
import com.linkedin.service.*;

public class LinkedinController implements LinkedinControllerInterface {

	private LinkedinServiceInterface li;
	
	public LinkedinController() {
		li = new LinkedinService();
	}
	@Override
	public void register() {
		// TODO Auto-generated method stub
		li.register();
	}

	@Override
	public void signin() {
		// TODO Auto-generated method stub
		li.signin();
	}

	@Override
	public void signout() {
		// TODO Auto-generated method stub
		li.signout();
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		li.connect();
	}

	@Override
	public void createPost() {
		// TODO Auto-generated method stub
		li.createPost();
	}

	
}
