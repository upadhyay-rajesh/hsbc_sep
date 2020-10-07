package com.SpringExample.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringExample.Dao.ExampleDaoInterface;
import com.SpringExample.Entity.User;

@Service
public class ExampleService implements ExampleServiceInterface{
	
	
	@Autowired
	private ExampleDaoInterface d;
	
	public int createProfileService(User u) {
		// TODO Auto-generated method stub
		return d.createProfileDao(u);
	}

}
