package com.example.logindemo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping("/")
	public String checkMVC() {
		
		return "login";
	}
	
	@RequestMapping("/login")
	public String loginHome(@RequestParam("userName") String userName, 
			      @RequestParam("password") String password, Model model) {
		Optional<UserDTO> u=null;
		try {
			u=userDAO.findByName(userName);
		
		}catch(Exception e) {
			return "login";
		}
		if(u.isPresent()) {
			model.addAttribute("UserName", userName);
			return "home";
		}
		
		model.addAttribute("error","User not found");
		return "login";
		
	}

	
	}


