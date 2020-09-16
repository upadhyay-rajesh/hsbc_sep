package whatsapp_view;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import whatsapp_controller.WhatsappController;
import whatsapp_controller.WhatsappControllerInterface;

public class WhatsappView {
	public static void main(String[] args)throws Exception {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("*********************************MAIN MENU************************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to edit profile");
		System.out.println("press 3 to join group");
		System.out.println("press 4 to message to contact or group");		
		
		System.out.println("enter your choice ");
		int i=Integer.parseInt(br.readLine());
		
		
		WhatsappControllerInterface ws= new WhatsappController();
		
		
		switch(i) {
		
		case 1: ws.createProfileController();
			break;
		case 2: ws.editProfileController();
			break;
		case 3:ws.joinGroupController();
			break;
		case 4:ws.messageContactController();
			break;
		default:System.out.println("wrong choice");
		
		}

	}

}
