package com.SpringExample.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.SpringExample.Entity.User;
import com.SpringExample.Service.ExampleServiceInterface;

@Controller
public class ExampleController {
	
	@Autowired
	private ExampleServiceInterface s;
	
	@RequestMapping("cprofile.htm")
	public ModelAndView createProfile(@RequestParam("name") String name,@RequestParam("password") String password,@RequestParam("email") String email,@RequestParam("address") String address) 
	{
		User u =new User();
		u.setAddress(address);
		u.setEmail(email);
		u.setName(name);
		u.setPassword(password);
		
		int i=s.createProfileService(u);
		String t="Registration Fail";
		if(i>0) {
			t="Registration Success";
		}
	
		ModelAndView mv=new ModelAndView();
		mv.addObject("p1", t);
				
		mv.setViewName("result.jsp");
		
		return mv;
	}
			
		
		
		
	
}
	
