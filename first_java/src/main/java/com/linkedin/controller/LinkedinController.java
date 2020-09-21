package com.linkedin.controller;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.linkedin.controller.LinkedinControllerInterface;
import com.linkedin.entity.LinkedinUser;
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
	public void signin() throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to sign-in.");
		
		System.out.println("Enter your username");
		String name = br.readLine();
		
		System.out.println("Enter your password");
		String password = br.readLine();
		
		LinkedinUser lu = new LinkedinUser();
		lu.setUsername(name);
		lu.setPassword(password);
		
		if(li.signin(lu)) System.out.println("Sign in successfull");
		else System.out.println("sign in failed");
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
