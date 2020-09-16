package com.Facebook.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.Facebook.controller.FbController;
import com.Facebook.controller.FbControllerInterface;

public class FbView {

	public static void main(String[] args)throws IOException {
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("*********************************MAIN MENU************************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to edit profile");
		System.out.println("press 3 to delete profile");
		System.out.println("press 4 to view profile");
		System.out.println("press 5 to search profile");
		
		
		
		System.out.println("enter your choice ");
		int i=Integer.parseInt(b.readLine());
		
		FbControllerInterface fi=new FbController();
		
		
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
	
		default:
			System.out.println("choice not available");
		
		}

	}

}
