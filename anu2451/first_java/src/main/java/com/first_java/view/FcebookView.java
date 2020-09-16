package com.first_java.view;

import com.first_java.controller.FacebookControllerInterface;
import com.first_java.controller.FcaebookController;


import java.io.*;
public class FcebookView {

	public static void main(String[] args) throws IOException {
		
		System.out.println("1.Create Profile");
		System.out.println("2.View Profile");
		System.out.println("3.Search Profile");
		System.out.println("4.Delete Profile");
		System.out.println("5.ViewAll Profile");
		
		FacebookControllerInterface fc = new FcaebookController();
		
		System.out.println("Enter your Choice");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		switch(n)
		{
		case 1:fc.createProfile();
		break;
		case 2:fc.viewProfile();
		break;
		case 3 :fc.searchProfile();
		break;
		case 4:fc.deleteProfile();
		break;
		case 5:fc.viewAllProfile();
		break;
		default:System.out.println("Wrong Choice");
		}

	}

}
