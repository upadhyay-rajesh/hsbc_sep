package whatsapp_service;
import whatsapp_service.WhatsappServiceInterface;
import whatsapp_dao.WhatsappDaoInterface;
import whatsapp_dao.WhatsappDao;

public class WhatsappService implements WhatsappServiceInterface{

	private WhatsappDaoInterface ws;
	
	public WhatsappService() {
		ws = new WhatsappDao();
	}
	@Override
	public void createProfileService() {
		// TODO Auto-generated method stub
		ws.createProfileDao();
	}

	@Override
	public void editProfileService() {
		// TODO Auto-generated method stub
		ws.editProfileDao();
	}

	@Override
	public void joinGroupService() {
		// TODO Auto-generated method stub
		ws.joinGroupDao();
	}

	@Override
	public void messageContactService() {
		// TODO Auto-generated method stub
		ws.messageContactDao();
		
	}

}
