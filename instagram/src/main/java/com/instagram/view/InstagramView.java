package com.instagram.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.instagram.controller.InstagramController;
import com.instagram.controller.InstagramControllerInterface;

public class InstagramView {

	public static void main(String[] args)throws Exception {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String cc="y";
	
	while(cc.equals("y")) {
	
	System.out.println("*********************************MAIN MENU************************");
	System.out.println("press 1 to create profile");
	System.out.println("press 2 to edit profile");
	System.out.println("press 3 to delete profile");
	System.out.println("press 4 to view profile");
	System.out.println("press 5 to search profile");
	System.out.println("press 6 to viewAll profile");
	System.out.println("press 7 to create table");
	System.out.println("press 8 to view userdetail with history");
	
	
	
	System.out.println("enter your choice ");
	int i=Integer.parseInt(br.readLine());
	
	
	//InstagramControllerInterface fi=new InstagramController();
	InstagramController c=InstagramControllerInterface.createObject("adminservice");
	
	switch(i) {
	
	case 1: 
		InstagramControllerInterface fi=c::createProfile;
		fi.abc();
		break;
	case 2: 
		InstagramControllerInterface fi1=c::editProfile;
		fi1.abc();
		
		break;
	case 3:InstagramControllerInterface fi2=c::deleteProfile;
	fi2.abc();
	
		break;
	case 4:
		InstagramControllerInterface fi3=c::viewProfile;
		fi3.abc();
		
		break;
	case 5:InstagramControllerInterface fi4=c::searchProfile;
	fi4.abc();
	
		break;
	case 6:InstagramControllerInterface fi5=c::viewAllProfile;
	fi5.abc();
	
		break;
	case 7:InstagramControllerInterface fi6=c::createcustomtable;
	fi6.abc();
	
	break;
	case 8:InstagramControllerInterface fi7=c::userdetailwithhistory;
	fi7.abc();
	
	break;
	default:System.out.println("wrong choice");
	
	}
	System.out.println("do you want to continue press y/n");
	cc=br.readLine();
	}

	}

}
