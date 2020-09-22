package whatsapp_utility;
import whatsapp_dao.WhatsappDao;
import whatsapp_dao.WhatsappDaoInterface;

public class DaoFactory {

	private DaoFactory() {
	}
	
	public static WhatsappDaoInterface createObj(String nn) {
		WhatsappDaoInterface wp=null;
		if(nn.equals("admin")) {
			wp = new WhatsappDao();
		}
		return wp;
	}
}
