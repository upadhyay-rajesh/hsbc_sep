package com.linkedin.dao;
import com.linkedin.dao.LinkedinDaoInterface;
import com.linkedin.entity.LinkedinUser;

public class LinkedinDao implements LinkedinDaoInterface {

	@Override
	public void register() {
		// TODO Auto-generated method stub
		System.out.println("Thanks for registering your profile on Linkedin");
	}

	@Override
	public boolean signin(LinkedinUser lu) {
		// TODO Auto-generated method stub
		return Math.random() > 0.5 ? true : false;
		
	}

	@Override
	public void signout() {
		// TODO Auto-generated method stub
		System.out.println("you've been signed out of linkedin");
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connection request sent");
	}

	@Override
	public void createPost() {
		// TODO Auto-generated method stub
		System.out.println("Created post");
	}

}
