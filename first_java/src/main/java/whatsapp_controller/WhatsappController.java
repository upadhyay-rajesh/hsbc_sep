package whatsapp_controller;
import whatsapp_controller.WhatsappControllerInterface;
import whatsapp_service.WhatsappServiceInterface;
import whatsapp_service.WhatsappService;

public class WhatsappController implements WhatsappControllerInterface{

	private WhatsappServiceInterface ws;
	public WhatsappController() {
		ws=new WhatsappService();
	}
	
	@Override
	public void createProfileController() {
		// TODO Auto-generated method stub
		ws.createProfileService();
	}

	@Override
	public void editProfileController() {
		// TODO Auto-generated method stub
		ws.editProfileService();
	}

	@Override
	public void joinGroupController() {
		// TODO Auto-generated method stub
		ws.joinGroupService();
	}

	@Override
	public void messageContactController() {
		// TODO Auto-generated method stub
		ws.messageContactService();
	}

}
