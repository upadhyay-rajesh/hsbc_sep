package controller;

import service.InstagramService;

public class IntsagramController implements InstagramControllerInterface {
	
	private InstagramService is;
	
	public IntsagramController () {
		
		is = new InstagramService();
	}

	@Override
	public void createAccount() {
		// TODO Auto-generated method stub
		is.createAccountService();
	}

	@Override
	public void updateAccount() {
		// TODO Auto-generated method stub
		is.updateAccountService();
	}

	@Override
	public void post() {
		// TODO Auto-generated method stub
		is.postService();
	}

	@Override
	public void disableAccount() {
		// TODO Auto-generated method stub
		is.disableAccountService();
	}

	@Override
	public void deleteAccount() {
		// TODO Auto-generated method stub
		is.disableAccountService();
	}

}
