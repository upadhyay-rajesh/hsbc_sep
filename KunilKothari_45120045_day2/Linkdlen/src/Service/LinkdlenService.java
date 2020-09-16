package Service;

import Dao.LinkdlenDao;
import Dao.LinkdlenDaoInterface;

public class LinkdlenService implements LinkdlenServiceInterface {
	
	private LinkdlenDaoInterface lin;
	
	 public LinkdlenService(){
		 lin= new LinkdlenDao();
		 
	 }

	@Override
	public void createProfileService() {
		System.out.println("Profile Created Service");
		lin.createProfileDao();
		
	}

	@Override
	public void updateProfileService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProfileService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchProfileService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewProfileService() {
		// TODO Auto-generated method stub
		
	}

}
