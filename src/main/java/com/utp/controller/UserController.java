package com.utp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.utp.model.Role;
import com.utp.model.User;
import com.utp.service.RoleService;
import com.utp.service.UserService;

@Controller
@RequestMapping("/manage")
public class UserController {

	private final UserService userService;
	private final RoleService roleService;
	
	@Autowired
	public UserController(UserService userService, RoleService roleService) {
		this.userService = userService;
		this.roleService = roleService;
	}
	
	
	
	@PostMapping("/SaveUser")
	public String saveUser(@RequestBody User user) {
		User account = new User();
		Role role = new Role();
		
		account = userService.saveUser(user);
		return "admin-view";
	}
	
}
