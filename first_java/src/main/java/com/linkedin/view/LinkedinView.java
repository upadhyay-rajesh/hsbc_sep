package com.linkedin.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.linkedin.controller.*;

public class LinkedinView {
	
	public static void main(String[] args)throws Exception {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("*********************************MAIN MENU************************");
		System.out.println("press 1 to register your profile");
		System.out.println("press 2 to sign in");
		System.out.println("press 3 to sign out");
		System.out.println("press 4 to connect to someone");
		System.out.println("press 5 to create post");
		
		System.out.println("enter your choice ");
		int i=Integer.parseInt(br.readLine());
		
		
		LinkedinControllerInterface li= new LinkedinController();
		
		
		switch(i) {
		
		case 1: li.register();
			break;
		case 2: li.signin();
			break;
		case 3: li.signout();
			break;
		case 4: li.connect();
			break;
		case 5: li.createPost();
			break;
		default:System.out.println("wrong choice");
		
		}

	}
}
