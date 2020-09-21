package whatsapp_view;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import whatsapp_controller.WhatsappController;
import whatsapp_controller.WhatsappControllerInterface;

public class WhatsappView {
	public static void main(String[] args)throws Exception {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String repeat = "y";
		
		while(repeat.equals("y")) {
			
		System.out.println("*********************************MAIN MENU************************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to edit profile");
		System.out.println("press 3 to delete profile");
		System.out.println("press 4 to view profile");
		System.out.println("press 5 to search profile");
		System.out.println("press 6 to viewAll profile");
		
		System.out.println("enter your choice ");
		int i=Integer.parseInt(br.readLine());
		
		
		WhatsappControllerInterface ws= new WhatsappController();
		
		
		switch(i) {
		
		case 1: ws.createProfileController();
			break;
		case 2: ws.editProfileController();
			break;
		case 3:ws.deleteProfileController();
			break;
		case 4:ws.viewProfileController();
			break;
		case 5: ws.searchProfileController();
			break;
		case 6: ws.viewAllProfileController();
			break;
		default:System.out.println("wrong choice");
		
		}
		
		System.out.println("Do you want to continue press y/n");
		repeat = br.readLine();
		}
	}

}
