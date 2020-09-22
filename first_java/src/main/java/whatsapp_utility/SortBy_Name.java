package whatsapp_utility;
import java.util.Comparator;

import whatsapp_entity.WhatsappUser;

public class SortBy_Name implements Comparator<WhatsappUser> {

	@Override
	public int compare(WhatsappUser w1, WhatsappUser w2) {
		// TODO Auto-generated method stub
		return w1.getName().compareTo(w2.getName());
	}

}
