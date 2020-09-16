package com.instagram.controller;

import com.instagram.service.InstagramService;
import com.instagram.service.InstagramServiceInterface;

public class InstagramController  implements InstagramControllerInterface
{
	
private InstagramServiceInterface isi;
	public InstagramController()
	{
	 isi= new InstagramService();	
	} 
	@Override
	public void createImage() {
		isi.createImageService();
		System.out.println(" Clicked Image ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteImage() {
		isi.deleteImageService();
		System.out.println(" Deleted ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createProfile() {
		isi.createProfileService();
		System.out.println(" Created ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewProfile() {
		isi.viewProfileService();
		System.out.println(" Viewed ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProfile() {
		// TODO Auto-generated method stub
		isi.deleteProfileService();
		System.out.println(" Deleted ");
	}

	@Override
	public void homepageRedirect() {
		// TODO Auto-generated method stub
		isi.homepageRedirectService();
		System.out.println(" Redirected to Home ");
	}

}
