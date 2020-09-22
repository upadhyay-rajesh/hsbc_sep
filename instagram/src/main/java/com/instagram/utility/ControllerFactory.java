package com.Instagram.utility;

import com.Instagram.controller.InstaController;
import com.Instagram.controller.InstaControllerInterface;

public class ControllerFactory {
	private ControllerFactory() {
	
	}
	
	public static InstaControllerInterface createObject(String n) {
		InstaControllerInterface c=null;
		if(n.equals("adminservice"))
			c= new InstaController();
		return c;
	}

}
