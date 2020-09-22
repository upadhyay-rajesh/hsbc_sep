package com.Instagram.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.Instagram.controller.InstaController;
import com.Instagram.controller.InstaControllerInterface;
import com.Instagram.utility.ControllerFactory;

public class InstaView {
		
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String a="y";
		InstaControllerInterface c = null;
		while(a.equals("y")) {
			
		if(c==null) {
			System.out.println("######################################");
			System.out.println("press 1 for signing in");
			System.out.println("press 2 for signing up");
			int i=Integer.parseInt(r.readLine());
			
			c = ControllerFactory.createObject("adminservice");
			switch(i) {
			
			case 1: 
				if(!c.checkProfile()) {
					c=null;
				}
				break;
			case 2:
				c.createProfile();
				break;
			default: 
				System.out.println("invalid option");
				c=null;
				break;
		
			}
		}
		else {
			c.getProfile();
		}
		
		
		
		
		System.out.println("do you want to continue? enter y/n");
		a=r.readLine();
		
		}
	}

}
