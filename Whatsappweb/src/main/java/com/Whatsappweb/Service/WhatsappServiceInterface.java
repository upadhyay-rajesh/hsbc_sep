package com.Whatsappweb.Service;

import java.util.List;

import com.Whatsappweb.Entity.WhatsappUser;


public interface WhatsappServiceInterface {
	public int createProfileService(WhatsappUser u) throws Exception;

	public boolean loginProfile(WhatsappUser f);

	public List<WhatsappUser> friendProfile(WhatsappUser f);
}
