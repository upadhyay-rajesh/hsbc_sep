package Controller;

import Service.LinkdlenService;
import Service.LinkdlenServiceInterface;

public class LinkdlenController implements LinkdlenControllerInterface {

	private LinkdlenServiceInterface lin;
	public LinkdlenController(){
		lin= new LinkdlenService();
	}
	
	@Override
	public void createProfileController() {
		System.out.println("Profile Created Controller");
		lin.createProfileService();
	}

	@Override
	public void updateProfileController() {
		System.out.println("Profile Updated");
	}
		
	

	@Override
	public void deleteProfileController() {
		System.out.println("Profile deleted");
	}
		
	

	@Override
	public void searchProfileController() {
		System.out.println("Profile Searching");
	
		
	}

	@Override
	public void viewProfileController() {
		System.out.println("Viewing Profile");
	
		
	}

}
