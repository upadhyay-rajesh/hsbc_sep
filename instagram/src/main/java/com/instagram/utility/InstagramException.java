package com.instagram.utility;

public class InstagramException extends Exception{
	
	private String name;
	
	@Override
	public String toString() {
		return "User not exist";
	}
	
	public InstagramException(String name) {
		this.name=name;
	}
	
	public String uu() {
		String nn=null;
		//if(name.length()<3) {
			nn="username should be more than 3 character";
		//}
		return nn;
	}
	
	public String uu1() {
		String nn=null;
		if(name.length()>8) {
			nn="username should not be more than 8 character";
		}
		return nn;
	}


}
