package service;

import dao.InstagramDAO;

public class InstagramService implements InstagramServiceInterface {
	
	private InstagramDAO d;
	
	public InstagramService () {
		
		d = new InstagramDAO();
	}

	@Override
	public void createAccountService() {
		// TODO Auto-generated method stub
		d.createAccountDAO();
	}

	@Override
	public void updateAccountService() {
		// TODO Auto-generated method stub
		d.updateAccountDAO();
	}

	@Override
	public void postService() {
		// TODO Auto-generated method stub
		d.postDAO();
	}

	@Override
	public void disableAccountService() {
		// TODO Auto-generated method stub
		d.disableAccountDAO();
	}

	@Override
	public void deleteAccountService() {
		// TODO Auto-generated method stub
		d.deleteAccountDAO();
	}

}
