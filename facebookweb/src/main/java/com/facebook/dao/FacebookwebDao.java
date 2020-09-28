package com.facebook.dao;

import java.util.List;

import com.facebook.entity.FacebookUser;

public interface FacebookwebDao {

	//boolean checkProfileDao()  ;

	int createProfileDao(FacebookUser u) throws Exception;

	boolean loginProfileDao(FacebookUser u);

	List<FacebookUser> friendlistDao(FacebookUser f);
}
