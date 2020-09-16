package com.second_java.view;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.second_java.controller.WhatsAppController;
import com.second_java.controller.WhatsAppControllerInterface;

public class WhatsAppView {
	

	public static void main(String[] args)throws Exception {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("*********************************MAIN MENU************************");
		System.out.println("press 1 to send new message");
		System.out.println("press 2 to edit account");
		System.out.println("press 3 to delete account");
		System.out.println("press 4 to view profilepicture");
		System.out.println("press 5 to add new contact");
		System.out.println("press 6 to search chats");
		
		
		
		System.out.println("enter your choice ");
		int i=Integer.parseInt(br.readLine());
		
		WhatsAppControllerInterface wc= new WhatsAppController();
	
		
		
		switch(i) {
		
		case 1: wc.newMessage();
			break;
		case 2: wc.editAccount();
			break;
		case 3: wc.deleteAccount();
			break;
		case 4: wc.viewProfilePicture();
			break;
		case 5:wc.addNewContact();
			break;
		case 6:wc.searchChats();
			break;
		default:System.out.println("wrong choice");
		
		}

	}

}
