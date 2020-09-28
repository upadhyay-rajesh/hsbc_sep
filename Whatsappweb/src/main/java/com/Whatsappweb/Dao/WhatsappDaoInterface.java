package com.Whatsappweb.Dao;

import java.util.List;

import com.Whatsappweb.Entity.WhatsappUser;

public interface WhatsappDaoInterface {
	int createProfileDao(WhatsappUser u) throws Exception;

	boolean loginProfileDao(WhatsappUser u);

	List<WhatsappUser> friendlistDao(WhatsappUser f);
}
