package com.Instagram.service;

import java.util.List;

import com.Instagram.dao.InstaDao;
import com.Instagram.dao.InstaDaoInterface;
import com.Instagram.utility.DaoFactory;
import com.Instagram.utility.InstaException;

import InstaEntity.InstaUser;

public class InstaService implements InstaServiceInterface {
	private InstaDaoInterface d;
	public InstaService() {
		d=DaoFactory.createObject("Adminservice");
	}
	@Override
	public int createProfileService(InstaUser u) throws Exception  {
		// TODO Auto-generated method stub
		int i=d.createProfileDao(u);
		return i;
	}

	@Override
	public boolean checkProfileService(InstaUser u)  {
		// TODO Auto-generated method stub
		return d.checkProfileDao(u);
		
	}

	@Override
	public void editProfileService()  {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<InstaUser> viewProfileService() throws InstaException {
		// TODO Auto-generated method stub
		List<InstaUser> l=null;
		try {
			l=d.viewProfileDao();
		}
		catch(InstaException e){
			//rethrow exception
			throw new InstaException();
			
		}
		return (l);
	}

	@Override
	public boolean deleteProfileService(InstaUser u)  {
		// TODO Auto-generated method stub
		return d.deleteProfileDao(u);
	}
	@Override
	public boolean editNameService(InstaUser u)  {
		// TODO Auto-generated method stub
		return d.editNameDao(u);
		
	}
	@Override
	public boolean editPasswordService(InstaUser u)  {
		// TODO Auto-generated method stub
		return d.editPasswordDao(u);
	}
	@Override
	public boolean editEmailService(InstaUser u)  {
		// TODO Auto-generated method stub
		return d.editEmailDao(u);
	}

	
}
