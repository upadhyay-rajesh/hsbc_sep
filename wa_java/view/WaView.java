package com.wa_java.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.wa_java.controller.WaController;
import com.wa_java.controller.WaControllerInterface;

public class WaView {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("*********************************MAIN MENU************************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to message");
		System.out.println("press 3 to search");
		System.out.println("press 4 to call");
		
		WaControllerInterface wc= new WaController();
		System.out.println("enter your choice ");
		int i=Integer.parseInt(br.readLine());
		switch(i)
		{
			case 1: wc.createProfile();
			break;
			case 2:wc.message();
			break;
			case 3:
				wc.search();
				break;
			case 4:
				wc.call();
				break;
		}
	}


}
