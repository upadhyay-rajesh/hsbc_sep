package com.insta_java.service;

import com.insta_java.dao.InstaDao;
import com.insta_java.dao.InstaDaoInterface;

public class InstaService implements InstaServiceInterface {
		// TODO Auto-generated method stub
		private InstaDaoInterface id;
		public InstaService(){
			id = new InstaDao();
		}

	@Override
	public void createProfileService() {
		// TODO Auto-generated method stub
		id.createProfileDao();
		System.out.println("profile created");
		
	}

	@Override
	public void postService() {
		// TODO Auto-generated method stub
		id.postDao();
		System.out.println("posted");
		
	}

	@Override
	public void editProfileService() {
		// TODO Auto-generated method stub
		id.editProfileDao();
		System.out.println("profile edited");
		
	}

	@Override
	public void deleteProfileService() {
		// TODO Auto-generated method stub
		id.deleteProfileDao();
		System.out.println("profile deleted");
		
	}

	@Override
	public void searchProfileService() {
		// TODO Auto-generated method stub
		id.searchProfileDao();
		System.out.println("profile searched");
		
	}

	@Override
	public void commentService() {
		// TODO Auto-generated method stub
		id.commentDao();
		System.out.println("commented");
		
	}

}
