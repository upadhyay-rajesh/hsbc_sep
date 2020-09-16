package com.first_java.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.first_java.controller.FaceBookController;
import com.first_java.controller.FacebookControllerInterface;

public class FacebookView {

	public static void main(String[] args)throws Exception {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("*********************************MAIN MENU************************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to edit profile");
		System.out.println("press 3 to delete profile");
		System.out.println("press 4 to view profile");
		System.out.println("press 5 to search profile");
		System.out.println("press 6 to viewAll profile");
		
		
		
		System.out.println("enter your choice ");
		int i=Integer.parseInt(br.readLine());
		
		
		FacebookControllerInterface fi=new FaceBookController();
		
		
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

	}

}
