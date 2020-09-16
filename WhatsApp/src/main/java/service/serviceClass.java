package service;

import dao.daoClass;
import dao.daoInterface;

public class serviceClass implements serviceInterface {
	
	private daoInterface d;
	
	public serviceClass()
	{
		d = new daoClass();
	}

	@Override
	public void createAccountservice() {
		d.createAccountdao();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewAccountservice() {
		d.viewAccountdao();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccountservice() {
		d.deleteAccountdao();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewMsgsservice() {
		d.viewMsgsdao();
		// TODO Auto-generated method stub
		
	}

}
