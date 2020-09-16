package com.whatsapp.view;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.whatsapp.controller.WhatsAppController;
import com.whatsapp.controller.WhatsAppControllerInterface;

public class WhatsAppView {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("*********************************MAIN MENU************************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view chats");
		System.out.println("press 3 to view status");
		System.out.println("press 4 to view calls");
		System.out.println("press 5 to search chats");
		System.out.println("press 6 to viewAll contacts");
		
		
		
		System.out.println("enter your choice ");
		int i=Integer.parseInt(br.readLine());
		
		
		WhatsAppControllerInterface fi=new WhatsAppController();
		
		
		switch(i) {
		
		case 1: fi.createProfile();
			break;
		case 2: fi.viewChats();
			break;
		case 3:fi.viewStatus();
			break;
		case 4:fi.viewCalls();
			break;
		case 5:fi.searchChats();
			break;
		case 6:fi.viewAllContacts();
			break;
		default:System.out.println("wrong choice");
		
		}

	}

}
