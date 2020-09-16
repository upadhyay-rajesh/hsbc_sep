package com.instagram.controller;

import com.instagram.service.InstagramService;

import com.instagram.service.InstagramServiceInterface;
public class InstaController implements InstagramControllerInterface{

	private InstagramServiceInterface fs;
	
	public InstaController()
	{
		fs=new InstagramService();
	}


	@Override
	public void createProfile() {
		fs.createProfileService();
		System.out.println("Profile created");
		
	}

	@Override
	public void editProfile() {
		fs.editProfileService();
		System.out.println("Profile edited");
		
	}

	@Override
	public void uploadimage() {
		fs.uploadimageService();
		System.out.println("Image uploaded");
		
	}

	@Override
	public void viewProfile() {
	fs.viewProfile();
	System.out.println("View Profile");
		
	}

	@Override
	public void searchProfile() {
		fs.searchProfile();
		System.out.println("Search Profile");
		
	}

	@Override
	public void comment() {
		fs.commentService();
		System.out.println("Search Profile");
		
	}

	@Override
	public void like() {
		fs.likeService();
		System.out.println("Search Profile");
		
	}

}
