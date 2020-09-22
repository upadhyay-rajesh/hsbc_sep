package whatsapp_utility;

import whatsapp_service.WhatsappService;
import whatsapp_service.WhatsappServiceInterface;

public class ServiceFactory {
	private ServiceFactory() {
		
	}
	public static WhatsappServiceInterface createObject(String nn) {
		WhatsappServiceInterface wp = null;
		if(nn.equals("admin")) {
			wp = new WhatsappService();
		}
		return wp;
	}
}
