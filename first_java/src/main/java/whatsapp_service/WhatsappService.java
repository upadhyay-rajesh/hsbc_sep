package whatsapp_service;
import whatsapp_service.WhatsappServiceInterface;
import whatsapp_dao.WhatsappDaoInterface;
import whatsapp_entity.WhatsappUser;

import java.util.List;

import whatsapp_dao.WhatsappDao;

public class WhatsappService implements WhatsappServiceInterface{

	private WhatsappDaoInterface ws;
	
	public WhatsappService() {
		ws = new WhatsappDao();
	}
	@Override
	public int createProfileService(WhatsappUser wu) throws Exception {
		// TODO Auto-generated method stub
		return ws.createProfileDao(wu);
	}

	@Override
	public void editProfileService()  throws Exception {
		// TODO Auto-generated method stub
		ws.editProfileDao();
	}
	@Override
	public void deleteProfileService() throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public WhatsappUser viewProfileService(WhatsappUser wu) throws Exception {
		// TODO Auto-generated method stub
		return ws.viewProfileDao(wu);
		
	}
	@Override
	public List<WhatsappUser> searchProfileService(WhatsappUser wu) throws Exception {
		// TODO Auto-generated method stub
		return ws.searchProfileDao(wu);
	}
	@Override
	public List<WhatsappUser> viewAllProfileService() throws Exception {
		// TODO Auto-generated method stub
		return ws.viewAllProfileDao();
		
	}


}
