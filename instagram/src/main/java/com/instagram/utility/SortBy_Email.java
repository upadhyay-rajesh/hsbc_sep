package com.instagram.utility;

import java.util.Comparator;

import com.instagram.entity.InstagramUser;

public class SortBy_Email implements Comparator<InstagramUser>{

	@Override
	public int compare(InstagramUser f1, InstagramUser f2) {
		
		return f1.getEmail().compareTo(f2.getEmail());
	}


}
