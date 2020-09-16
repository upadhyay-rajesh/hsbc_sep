package com.first_javas.view;
import java.io.*;
import com.first_javas.controller.FacebookControllerinterface;

import com.first_javas.controller.Facebokcontroller;

public class Facebookviews {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("-------------------MAINMENU----------------");
		System.out.println("press 1 for deleteprofile");
		
		System.out.println("press 2 for createprofile");
	
		System.out.println("press 3 for viewprofile");
		
		System.out.println("press 4 for updateprofile");
		
		System.out.println("press 5 for findprofile");
		
		System.out.println("press 6 for activeprofile");
		
		System.out.println("Enter choice");
		int t = Integer.parseInt(br.readLine());
		
		

		
		
		FacebookControllerinterface fi= new Facebokcontroller();
		
		switch(t)
		{
		case 1:fi.deleteprofile();
				break;
		case 2:fi.createprofile();
				break;
		case 3:fi.viewprofile();
				break;
		case 4:fi.updateprofile();
				break;
		case 5:fi.findprofile();
				break;
		case 6:fi.activeprofile();
		break;
		default:System.out.println("Wrong choice");
		}

	}

}
