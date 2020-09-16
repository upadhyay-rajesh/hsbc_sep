package com.linkedin.dao;
import com.linkedin.dao.LinkedinDaoInterface;

public class LinkedinDao implements LinkedinDaoInterface {

	@Override
	public void register() {
		// TODO Auto-generated method stub
		System.out.println("Thanks for registering your profile on Linkedin");
	}

	@Override
	public void signin() {
		// TODO Auto-generated method stub
		System.out.println("You've been logged in to linkedin");
		
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
