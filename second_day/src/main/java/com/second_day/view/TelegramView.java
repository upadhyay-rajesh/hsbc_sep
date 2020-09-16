package com.second_day.view;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.second_day.controller.TelegramController;
import com.second_day.controller.TelegramControllerInterface;

public class TelegramView {
	public static void main(String[] args)throws Exception {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Telegram MENU");
		System.out.println("1 Create profile");
		System.out.println("2 Edit profile");
		System.out.println("3 Delete profile");
		System.out.println("4 View profile");
		
		
		System.out.println("Enter your choice ");
		int i=Integer.parseInt(br.readLine());
		
		
		TelegramControllerInterface ti=new TelegramController();
		
		
		switch(i) {
		
		case 1:ti.createProfile();
			break;
		case 2:ti.editProfile();
			break;
		case 3:ti.deleteProfile();
			break;
		case 4:ti.viewProfile();
			break;
		
		default:System.out.println("Wrong choice");
		
		}

	}
}
