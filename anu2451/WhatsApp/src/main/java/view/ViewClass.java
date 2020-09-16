package view;

import java.io.*;
import java.io.InputStreamReader;

import controller.WhatsAppControllerClass;
import controller.WhatsappController;



public class ViewClass {

	public static void main(String[] args) throws IOException{
		System.out.println("1.Create Account");
		System.out.println("2.View Account");
		System.out.println("3.View Messages");
		System.out.println("4.Delete Account");
		
		WhatsappController wc = new WhatsAppControllerClass();
		
		System.out.println("Enter your Choice");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		switch(n)
		{
		case 1:wc.createAccount();
		break;
		case 2:wc.viewAccount();
		break;
		case 3 :wc.viewMsgs();
		break;
		case 4:wc.deleteAccount();
		break;
		default:System.out.println("Wrong Choice");
		}


	}

}
