package com.first_java.instaview;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.first_java.instacontroller.instacontroller;
import com.first_java.instacontroller.instacontrollerinterface;

public class instadisplay {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		instacontrollerinterface ii=new instacontroller();
		System.out.println("welcome to the system");
		System.out.println("enter what you want to perform");
		System.out.println("1.Send request"
				+ "2.search photo"
				+ "3.comment photo");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int i=Integer.parseInt(br.readLine());
		
		
		switch(i)
		{
		case 1:ii.sendrequest();
			break;
		
		case 2:ii.searchphoto();
			break;
		
		case 3:ii.sendrequest();
			break;
			
		default:System.out.println("wrong choice");
		
		}

	}

}
