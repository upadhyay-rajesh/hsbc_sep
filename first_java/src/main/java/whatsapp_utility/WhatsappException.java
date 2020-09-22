package whatsapp_utility;

public class WhatsappException extends Exception{
	
	private String name;
	
	public String toString() {
		return "User not exist";
	}
	
	public WhatsappException(String name) {
		this.name  = name;
	}
	
	public String uu() {
		return "username should be more than 3 characters";
	
	}
	
	public String uu1() {
		String nn=null;
		if(name.length()>8) {
			nn = "username should not be more than 8 characters"; 
		}
		return nn;
	}
	
}
