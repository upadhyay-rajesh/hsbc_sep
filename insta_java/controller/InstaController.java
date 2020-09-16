package com.insta_java.controller;
import com.insta_java.service.InstaService;
import com.insta_java.service.InstaServiceInterface;

public class InstaController implements InstaControllerInterface {

		private InstaServiceInterface is;
		
		public InstaController() {
			 is = new InstaService();
		}
		
		

	@Override
	public void createProfile() {
		// TODO Auto-generated method stub
		is.createProfileService();
		System.out.println("created profile");
		
		
	}

	@Override
	public void post() {
		// TODO Auto-generated method stub
		is.postService();
		System.out.println("posted");
		
		
	}


	@Override
	public void editProfile() {
		// TODO Auto-generated method stub
		is.editProfileService();
		System.out.println("profile edited");
		
	}

	@Override
	public void deleteProfile() {
		// TODO Auto-generated method stub
		is.deleteProfileService();
		System.out.println("profile deleted");
		
	}

	@Override
	public void searchProfile() {
		// TODO Auto-generated method stub
		is.searchProfileService();
		System.out.println("profile searched");
		
	}

	@Override
	public void comment() {
		// TODO Auto-generated method stub
		is.commentService();
		System.out.println("commented");
	}

}
