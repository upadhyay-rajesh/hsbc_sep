package com.Instagram.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;

import com.Instagram.service.InstaService;
import com.Instagram.service.InstaServiceInterface;
import com.Instagram.utility.InstaException;
import com.Instagram.utility.ServiceFactory;
import com.Instagram.utility.SortByAddress;
import com.Instagram.utility.SortByName;

import InstaEntity.InstaUser;

public class InstaController implements InstaControllerInterface{
	private InstaServiceInterface s;
	//private InstaUser ;
	
	public InstaController() {
		s=ServiceFactory.createObject("adminservice");
	}
	
	@Override
	public void createProfile() throws Exception {
		// TODO Auto-generated method stub
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.println("enter username");
		String name=r.readLine();
		
		System.out.println("enter password");
		String password=r.readLine();
		
		//System.out.println("enter address");
		//String address=r.readLine();
		
		System.out.println("enter email");
		String email=r.readLine();
		
		InstaUser u=new InstaUser();
		u.setName(name);
	//	u.setAddress(address);
		u.setEmail(email);
		u.setPassword(password);
		
		//passing onto service layer
		int i=s.createProfileService(u);
		if(i>0)
			System.out.println("Profile created!");
		else
			System.out.println("Profile not created!");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean checkProfile() throws Exception  {
		// TODO Auto-generated method stub
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		InstaUser u=null;
		
		System.out.println("enter username");
		String name=r.readLine();
		
		System.out.println("enter password");
		String password=r.readLine();
		
		u=new InstaUser();
		u.setName(name);
		u.setPassword(password);
		
	
		if(s.checkProfileService(u))
		{
			getProfile();
			return true;
		}
		else
			System.out.println("NO account found!");
			return false;
	}

	public void getProfile() throws InstaException  {
		// TODO Auto-generated method stub
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int ch=0;
		try {
		System.out.println("Profile found!");
		System.out.println("##############################");
		System.out.println("press 1 to edit profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to delete profile");
		ch=Integer.parseInt(r.readLine());}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		switch(ch) {
		
			case 1:	editProfile();
			break;
			case 2: viewProfile();
			break;
			case 3: deleteProfile();
			break;
			default: System.out.println("invalid choice");
			break;
			}
		
		
	}

	@Override
	public void editProfile() {
		// TODO Auto-generated method stub
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int i=0;
		try {
		System.out.println("enter 1 to edit name");
		System.out.println("enter 2 to edit password");
		System.out.println("enter 3 to edit email");
		i=Integer.parseInt(r.readLine());}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		switch(i) {
		case 1: editName();
		break;
		case 2: editPassword();
		break;
		case 3: editEmail();
		break;
		default: System.out.println("invalid choice");
		break;
		}
		
		
	}

	public void editEmail() {
		// TODO Auto-generated method stub
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		InstaUser u=null;
		try{
			System.out.println("enter name");
		String name=r.readLine();
		u=new InstaUser();
		u.setName(name);
		System.out.println("enter new email");
		String email=r.readLine();
		u.setEmail(email);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		if(s.editEmailService(u))
			System.out.println("Email edited");
		else System.out.println("name not found");
	}

	public void editPassword() {
		// TODO Auto-generated method stub
		
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		InstaUser u=null;
		try {
		System.out.println("enter name");
		String name=r.readLine();
		u=new InstaUser();
		u.setName(name);
		System.out.println("enter new password");
		String password=r.readLine();
		u.setPassword(password);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		if(s.editPasswordService(u))
			System.out.println("Password edited");
		else System.out.println("name not found");
	}

	public void editName() {
		// TODO Auto-generated method stub
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		InstaUser u=new InstaUser();
		try{
			System.out.println("enter email");
		
		String email=r.readLine();
		u.setEmail(email);
		System.out.println("enter new name");
		String name=r.readLine();
		u.setName(name);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		/*finally {
			try {
				r.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		if(s.editNameService(u))
			System.out.println("Name edited");
		else System.out.println("name not found");
	}

	@Override
	public void viewProfile() {
		try {
		List<InstaUser> u=s.viewProfileService();
		
		System.out.println(u.size()+"  users found");
		Collections.sort(u, new SortByName());
		
		for(InstaUser uu:u) {
			System.out.println("****************************************");
			System.out.println("Name is : "+uu.getName());
			System.out.println("Password is : "+uu.getPassword());
			System.out.println("Email is : "+uu.getEmail());
			System.out.println("****************************************");
		}
		}
		catch(InstaException e)
		{
			System.out.println("custom exception occured"+ e);
		}
	}

	@Override
	public void deleteProfile() {
		// TODO Auto-generated method stub
		InstaUser u =new InstaUser();
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.println("enter username");
		String name=r.readLine();
		u.setName(name);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		if(s.deleteProfileService(u))
			System.out.println("Profile deleted!");
	}
	
	/*userDetailwithHistory(){}
	 * Map<String, List<InstaUser> u=s.userDetailwithHistoryService();
	 */

	
}
