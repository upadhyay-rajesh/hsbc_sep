package com.instaBackend.DAO;

import java.util.List;

import com.instaBackend.entity.User;

public interface InstaDAOInterface {
	int createUser(User u);
	List<User> getAllUsers();
	void deleteUser(String id);
}
