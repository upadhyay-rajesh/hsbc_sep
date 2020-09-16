package com.Whatsapp.view;
import java.io.*;

import com.Whatsapp.controller.Whatsappcontroller;
import com.Whatsapp.controller.Whatsappcontrollerinterface;

public class Whatsappview {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("-------------------MAINMENU----------------");
		System.out.println("press 1 for deleteprofile");
		
		System.out.println("press 2 for createprofile");
	
		System.out.println("press 3 for viewprofile");
		
		System.out.println("press 4 for updateprofile");
		
		System.out.println("press 5 for changestatus");
		
		System.out.println("press 6 for deactivateprofile");
		
		System.out.println("Enter choice");
		int t = Integer.parseInt(br.readLine());
		
		

		
		
		Whatsappcontrollerinterface pi= new Whatsappcontroller();
		
		switch(t)
		{
		case 1:pi.deleteprofile();
				break;
		case 2:pi.createprofile();
				break;
		case 3:pi.viewprofile();
				break;
		case 4:pi.updateprofile();
				break;
		case 5:pi.findprofile();
				break;
		case 6:pi.activeprofile();
		break;
		default:System.out.println("Wrong choice");
		}


	}

}
