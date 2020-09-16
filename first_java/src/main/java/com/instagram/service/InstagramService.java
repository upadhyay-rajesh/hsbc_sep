package com.instagram.service;

import com.first_java.service.FacebookService;
import com.first_java.service.FacebookServiceInterface;
import com.instagram.dao.Instagramdao;
import com.instagram.dao.InstagramdaoInterface;

public class InstagramService implements InstagramServiceInterface{


	private InstagramdaoInterface fd;
	
	public InstagramService(){
		fd=new Instagramdao();
	}
	@Override
	public void createProfileService() {
		fd.addprofiledetails();
		
		System.out.println("Profile details added");
		
	}

	@Override
	public void editProfileService() {
fd.updateprofiledetails();

System.out.println("Profile details updated");
		
	}

	@Override
	public void uploadimageService() {
	fd.imageupload();
	System.out.println("Image Uploaded");
	}

	@Override
	public void viewProfile() {
		fd.viewprofiledetails();
		System.out.println("Profile is viewed");
		
	}

	@Override
	public void searchProfile() {
		fd.searchprofiledetails();
		System.out.println("Search profile details completed");
		
	}

	@Override
	public void commentService() {
		fd.commented();
		System.out.println("Comment details completed");
		
	}

	@Override
	public void likeService() {
		fd.liked();
		System.out.println("Like details completed");
		
	}

}
