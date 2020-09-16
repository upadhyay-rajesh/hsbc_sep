package whatsapp_dao;
import whatsapp_dao.WhatsappDaoInterface;
public class WhatsappDao implements WhatsappDaoInterface {

	@Override
	public void createProfileDao() {
		// TODO Auto-generated method stub
		System.out.println("whatsapp profile created!");
	}

	@Override
	public void editProfileDao() {
		// TODO Auto-generated method stub
		System.out.println("whatsapp profile edited");
		
	}

	@Override
	public void joinGroupDao() {
		// TODO Auto-generated method stub
		System.out.println("whatsapp group joined");
		
	}

	@Override
	public void messageContactDao() {
		// TODO Auto-generated method stub
		System.out.println("messaged a contact on whatsapp");
	}

}
