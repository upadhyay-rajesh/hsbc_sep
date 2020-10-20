package com.instaBackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.instaBackend.DAO.InstaDAOInterface;
import com.instaBackend.entity.User;


@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class InstaController {

	@Autowired
	private InstaDAOInterface iDAO;
	
	@GetMapping("/users")
    public List<User> getAllUsers(){
		
    	return iDAO.getAllUsers();
    }
    
	@PostMapping("/users")
    public User createUser(@RequestBody User user) {
    	int val = iDAO.createUser(user);
    	return user;
    }
	
	@DeleteMapping(value="/users/{id}")
	public void deleteUser(@PathVariable("id") String id) {
		iDAO.deleteUser(id);
	}
    
}
