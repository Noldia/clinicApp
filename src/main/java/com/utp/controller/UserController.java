package com.utp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.utp.model.Doctor;
import com.utp.model.User;
import com.utp.service.DoctorService;
import com.utp.service.UserService;

@Controller
@CrossOrigin("*")
@RequestMapping("/admin")
public class UserController {

	private final UserService userService;
	private final DoctorService doctorService;

	@Autowired
	public UserController(UserService userService, DoctorService doctorService) {
		this.userService = userService;
		this.doctorService = doctorService;
	}

	@GetMapping("/")
	public String adminView() {
		return "admin-view";
	}

	@PostMapping("/SaveUser")
	public String saveUser(@RequestBody User user) {
		userService.saveUser(user);
		return "admin-view";
	}

	@GetMapping("/getDoctors")
	@ResponseBody
	public List<Doctor> getDoctors() {
		List<Doctor> doctors = new ArrayList<Doctor>();
		
		try {			
			doctors = doctorService.getDoctors();
		} catch (Exception e) {
			System.err.println("Error al listar doctores... " + e);
		}
		return doctors;
	}
}
