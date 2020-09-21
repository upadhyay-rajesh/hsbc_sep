package whatsapp_controller;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import whatsapp_controller.WhatsappControllerInterface;
import whatsapp_entity.WhatsappUser;
import whatsapp_service.WhatsappServiceInterface;
import whatsapp_service.WhatsappService;

public class WhatsappController implements WhatsappControllerInterface{

	private WhatsappServiceInterface ws;
	public WhatsappController() {
		ws=new WhatsappService();
	}
	
	@Override
	public void createProfileController() throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name");
		String name = br.readLine();
		
		System.out.println("Enter your number");
		String number = br.readLine();
		
		WhatsappUser wu = new WhatsappUser();
		wu.setName(name);
		wu.setNumber(number);
		
		// TODO Auto-generated method stub
		int res = ws.createProfileService(wu);
		if(res == 1 ) System.out.println("Hurray, youre done!");
		else System.out.println("Youre not fit for whatsapp");
	}

	@Override
	public void editProfileController()  throws Exception {
		// TODO Auto-generated method stub
		ws.editProfileService();
	}

	@Override
	public void deleteProfileController() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewProfileController() throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String name = br.readLine();
		
		WhatsappUser  wu = new WhatsappUser();
		wu.setName(name);
		
		WhatsappUser woutput = ws.viewProfileService(wu);
		
		System.out.println("User details are below");
		System.out.println("Name is " + woutput.getName());
		System.out.println("Number is " + woutput.getNumber());
		
	}

	@Override
	public void searchProfileController() throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String name = br.readLine();
		
		WhatsappUser  wu = new WhatsappUser();
		wu.setName(name);
		List<WhatsappUser> wlist = ws.searchProfileService(wu);
		
		for(WhatsappUser user: wlist) {
			System.out.println(user.getName() + "  " + user.getNumber());
			System.out.println("*********************");
		}
	}

	@Override
	public void viewAllProfileController() throws Exception {
		// TODO Auto-generated method stub
		
		List<WhatsappUser> wlist = ws.viewAllProfileService();
		for(WhatsappUser user: wlist) {
			System.out.println(user.getName() + "  " + user.getNumber());
			System.out.println("*********************");
		}
	}


}
