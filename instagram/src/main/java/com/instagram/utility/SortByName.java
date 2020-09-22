package com.Instagram.utility;

import java.util.Comparator;

import InstaEntity.InstaUser;

public class SortByName implements Comparator<InstaUser>{

	@Override
	public int compare(InstaUser o1, InstaUser o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
