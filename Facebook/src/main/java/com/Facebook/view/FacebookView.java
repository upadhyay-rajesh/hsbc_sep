package com.Facebook.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.Facebook.controller.FacebookController;
import com.Facebook.controller.FacebookControllerInterface;

public class FacebookView {

	public static void main(String[] args) throws Exception {
		
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
		
		
		FacebookControllerInterface fi= new FacebookController(); 
		//FacebookControllerInterface is acting as a base(parent class)
		//FacebookController is our child class where we are implementing and able to do multiple inheritance
		//Here we are making object of child class giving reference to the parent class...UPCASTING
		//Now we can access the functionality of child as well as parent class
		
		
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
