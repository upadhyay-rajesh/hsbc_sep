package com.linkedin.service;
import com.linkedin.service.LinkedinServiceInterface ;
import com.linkedin.dao.*;
import com.linkedin.entity.LinkedinUser;

public class LinkedinService implements LinkedinServiceInterface {

	private LinkedinDaoInterface li;
	
	public LinkedinService() {
		li = new LinkedinDao();
	}
	@Override
	public void register() {
		// TODO Auto-generated method stub
		li.register();
	}

	@Override
	public boolean signin(LinkedinUser lu) {
		// TODO Auto-generated method stub
		return li.signin(lu);
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
