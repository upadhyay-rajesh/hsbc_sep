package com.second_day.view;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.second_day.controller.LinkedinController;
import com.second_day.controller.LinkedinControllerInterface;

public class LinkedinView {
	public static void main(String[] args)throws Exception {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Linkedin MENU");
		System.out.println("1 Create profile");
		System.out.println("2 Edit profile");
		System.out.println("3 Delete profile");
		System.out.println("4 View profile");
		
		
		
		
		System.out.println("Enter your choice ");
		int i=Integer.parseInt(br.readLine());
		
		
		LinkedinControllerInterface li=new LinkedinController();
		
		
		switch(i) {
		
		case 1:li.createProfile();
			break;
		case 2:li.editProfile();
			break;
		case 3:li.deleteProfile();
			break;
		case 4:li.viewProfile();
			break;
		
		default:System.out.println("Wrong choice");
		
		}

	}

}

