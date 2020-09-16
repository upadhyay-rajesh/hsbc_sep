package com.layer.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.layer.controller.layercontroller;
import com.layer.controller.layercontrollerinterface;



public class layerview {
	public static void main(String[] args)throws Exception {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("*********************************MAIN MENU************************");
		System.out.println("press 1 to view story");
		System.out.println("press 2 to like a post");
		System.out.println("press 3 to delete a comment");
		
		
		
		
		System.out.println("enter your choice ");
		int i=Integer.parseInt(br.readLine());
		
		layercontrollerinterface li=new layercontroller();
		
		
		switch(i) {
		
		case 1: li.viewstory();
			break;
		case 2: li.likeapost();
			break;
		case 3:li.deleteacomment();
			break;
		
		default:System.out.println("wrong choice");
		
		}

	}	

}
