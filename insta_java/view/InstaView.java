package com.insta_java.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.insta_java.controller.InstaController;
import com.insta_java.controller.InstaControllerInterface;

public class InstaView {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("*********************************MAIN MENU************************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to post");
		System.out.println("press 3 to edit profile");
		System.out.println("press 4 to delete profile");
		System.out.println("press 5 to search profile");
		System.out.println("press 6 to comment");
		
		InstaControllerInterface ic = new InstaController();
		
		System.out.println("enter your choice ");
		int i=Integer.parseInt(br.readLine());
		switch(i)
		{
			case 1: ic.createProfile();
			break;
			case 2:ic.post();
			break;
			case 3:
				ic.editProfile();
				break;
			case 4:
				ic.deleteProfile();
				break;
			case 5:
				ic.searchProfile();
				break;
			case 6:
				ic.comment();
				break;
		}
	}

}
