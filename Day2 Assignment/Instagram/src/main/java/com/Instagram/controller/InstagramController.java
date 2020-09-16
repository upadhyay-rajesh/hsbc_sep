package com.Instagram.controller;

import com.Instagram.service.InstagramService;
import com.Instagram.service.InstagramServiceInterface;

public class InstagramController implements InstagramControllerInterface {
		
		private InstagramServiceInterface is;
		
		public InstagramController(){
			is=new InstagramService();
		}

		@Override
		public void createProfile() {
			System.out.println("profile created");
			
		}
		

		@Override
		public void editProfile() {
			System.out.println("profile edited");
			
		}

		@Override
		public void deleteProfile() {
			System.out.println("profile deleted");
			
		}

		@Override
		public void viewProfile() {
			System.out.println("profile detail");
			
		}

	}


