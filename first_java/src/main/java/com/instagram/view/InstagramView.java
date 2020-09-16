package com.instagram.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.instagram.controller.InstagramController;
import com.instagram.controller.InstagramControllerInterface;

public class InstagramView  {

	public static void main(String[] args)throws 	IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("---MAIN MENU---");
		System.out.println("press 1 to click image");
		System.out.println("press 2 to delete image");
		System.out.println("press 3 to create profile");
		System.out.println("press 4 to view profile");
		System.out.println("press 5 to delete profile");
		System.out.println("press 6 to go to homepage");
		
		
		
		System.out.println("enter your choice ");
		int i=Integer.parseInt(br.readLine());
		
		
		InstagramControllerInterface ii=new InstagramController();
		
		
		switch(i) {
		
		case 1: ii.createImage();
			break;
		case 2: ii.deleteImage();
			break;
		case 3: ii.createProfile();
			break;
		case 4: ii.viewProfile();
			break;
		case 5: ii.deleteProfile();
			break;
		case 6: ii.homepageRedirect();
			break;
		default:System.out.println("Please retry");
		}
	}
}
