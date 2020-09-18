package com.instagram.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.instagram.entity.InstagramUser;
import com.instagram.service.InstagramService;
import com.instagram.service.InstagramServiceInterface;

public class InstagramController implements InstagramControllerInterface {
	
	private InstagramServiceInterface is;
	
	public InstagramController() {
		is=new InstagramService();
	}

	public void createProfile() throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Name : ");
		String name=br.readLine();
		
		System.out.println("Enter your Password : ");
		String password=br.readLine();
		
		System.out.println("Enter your Email : ");
		String email=br.readLine();
		
		System.out.println("Enter your Address : ");
		String address=br.readLine();
		
		InstagramUser iu=new InstagramUser();
		iu.setName(name);
		iu.setPassword(password);
		iu.setEmail(email);
		iu.setAddress(address);
		
		
		int i=is.createprofileService(iu);//we should not transfer concrete data
		
		if(i>0) {
			System.out.println("profile created");
		}
		else {
			System.out.println("could not create profile");
		}

	}

	public void editProfile()throws Exception {
		is.editprofileService();

	}

	public void deleteProfile() throws Exception{
		is.deleteprofileService();

	}

	public void searchProfile()throws Exception {
		is.searchprofileService();

	}

	public void viewAllProfile() throws Exception{
		is.viewallprofileService();

	}

	public void viewProfile()throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name to view profile : ");
		String name=br.readLine();
		
		InstagramUser iu=new InstagramUser(); //this object is used for transfering data from controller to service
		iu.setName(name);
		
		
		InstagramUser uu=is.viewprofileService(iu);//this object is used for taking data from service to controller
		if(uu!=null) {
			System.out.println("User Information is below");
			System.out.println("Name is : "+uu.getName());
			System.out.println("Password is : "+uu.getPassword());
			System.out.println("Email is : "+uu.getEmail());
			System.out.println("Address is : "+uu.getAddress());
		}
		else {
			System.out.println("User with Name : "+name+" not exist");
		}

	}

}


















