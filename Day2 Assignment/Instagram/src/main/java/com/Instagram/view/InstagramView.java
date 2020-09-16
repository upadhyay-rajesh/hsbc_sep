package com.Instagram.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.Instagram.controller.InstagramController;
import com.Instagram.controller.InstagramControllerInterface;

public class InstagramView {

	public static void main(String[] args)throws Exception {
BufferedReader a =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("*********************************MAIN MENU************************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to edit profile");
		System.out.println("press 3 to delete profile");
		System.out.println("press 4 to view profile");
		
		
		
		
		System.out.println("enter your choice ");
		int i=Integer.parseInt(a.readLine());
		
		
		InstagramControllerInterface fi=new InstagramController();
		
		
		switch(i) {
		
		case 1: fi.createProfile();
			break;
		case 2: fi.editProfile();
			break;
		case 3:fi.deleteProfile();
			break;
		case 4:fi.viewProfile();
			break;
		default:System.out.println("wrong choice");
		
		}

	}

}
