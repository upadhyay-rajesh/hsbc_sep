package com.Whatsappweb.Service;

import java.util.List;

import com.Whatsappweb.Dao.WhatsappDaoInterface;
import com.Whatsappweb.Entity.WhatsappUser;
import com.Whatsappweb.Utility.DaoFactory;

//import com.Whatsappweb.Utility.WhatsappServiceInterface;

public class WhatsappService implements WhatsappServiceInterface  {
		WhatsappDaoInterface d;
	public WhatsappService() {
		d = DaoFactory.createObject("admin");
	}
	@Override
	public int createProfileService(WhatsappUser u) throws Exception {
		// TODO Auto-generated method stub
		return d.createProfileDao(u);
	}

	@Override
	public boolean loginProfile(WhatsappUser f) {
		// TODO Auto-generated method stub
		return d.loginProfileDao(f);
	}

	@Override
	public List<WhatsappUser> friendProfile(WhatsappUser f) {
		// TODO Auto-generated method stub
		return d.friendlistDao(f);
	}

}
