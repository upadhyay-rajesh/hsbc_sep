package whatsapp_dao;

import java.util.List;

import whatsapp_entity.WhatsappUser;

public interface WhatsappDaoInterface {
	int createProfileDao(WhatsappUser wu) throws Exception;
	void editProfileDao() throws Exception;
	WhatsappUser deleteProfileDao(WhatsappUser wu) throws Exception;
	WhatsappUser viewProfileDao(WhatsappUser wu) throws Exception;
	List<WhatsappUser> viewAllProfileDao() throws Exception;
	List<WhatsappUser> searchProfileDao(WhatsappUser wu) throws Exception;
	
}
