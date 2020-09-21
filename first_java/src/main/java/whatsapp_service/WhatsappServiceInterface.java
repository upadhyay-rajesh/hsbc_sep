package whatsapp_service;

import java.util.List;

import whatsapp_entity.WhatsappUser;

public interface WhatsappServiceInterface {
	int createProfileService(WhatsappUser wu) throws Exception;
	void editProfileService() throws Exception;
	void deleteProfileService() throws Exception;
	WhatsappUser viewProfileService(WhatsappUser wu) throws Exception;
	List<WhatsappUser> searchProfileService(WhatsappUser wu) throws Exception;
	List<WhatsappUser> viewAllProfileService() throws Exception;

}
