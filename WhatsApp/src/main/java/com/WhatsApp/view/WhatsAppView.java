package com.WhatsApp.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.WhatsApp.controller.WhatsAppController;
import com.WhatsApp.controller.WhatsAppControllerInterface;


public class WhatsAppView {

	public static void main(String[] args) throws IOException {
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("*********************************MAIN MENU************************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to edit profile");
		System.out.println("press 3 to delete profile");
		System.out.println("press 4 to view profile");
		System.out.println("press 5 to search profile");
		
		
		
		System.out.println("enter your choice ");
		int i=Integer.parseInt(b.readLine());
		
		WhatsAppControllerInterface wi=new WhatsAppController();
		
		
		switch(i) {
		
		case 1: wi.createProfile();
			break;
		case 2: wi.editProfile();
			break;
		case 3:wi.deleteProfile();
			break;
		case 4:wi.viewProfile();
			break;
		case 5:wi.searchProfile();
			break;
	
		default:
			System.out.println("choice not available");
		
		}
	}

}
