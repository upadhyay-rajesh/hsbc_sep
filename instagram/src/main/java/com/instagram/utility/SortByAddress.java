package com.Instagram.utility;

import java.util.Comparator;

import InstaEntity.InstaUser;

public class SortByAddress implements Comparator<InstaUser>{
	
	@Override
	public int compare(InstaUser i1, InstaUser i2) {
		// TODO Auto-generated method stub
		return i1.getEmail().compareTo(i2.getEmail());
	}

}
