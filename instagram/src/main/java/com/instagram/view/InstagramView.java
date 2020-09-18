package com.instagram.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.instagram.controller.InstagramController;
import com.instagram.controller.InstagramControllerInterface;

public class InstagramView {

	public static void main(String[] args)throws Exception {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String cc="y";
	
	while(cc.equals("y")) {
	
	System.out.println("*********************************MAIN MENU************************");
	System.out.println("press 1 to create profile");
	System.out.println("press 2 to edit profile");
	System.out.println("press 3 to delete profile");
	System.out.println("press 4 to view profile");
	System.out.println("press 5 to search profile");
	System.out.println("press 6 to viewAll profile");
	
	
	
	System.out.println("enter your choice ");
	int i=Integer.parseInt(br.readLine());
	
	
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
	case 5:fi.searchProfile();
		break;
	case 6:fi.viewAllProfile();
		break;
	default:System.out.println("wrong choice");
	
	}
	System.out.println("do you want to continue press y/n");
	cc=br.readLine();
	}

	}

}
