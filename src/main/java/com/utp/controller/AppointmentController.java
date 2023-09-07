package com.utp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.utp.service.IAppointmentService;

@Controller
@RequestMapping("/appointment")
public class AppointmentController {
	
	@Autowired
	private IAppointmentService appointmentService;
	
	@GetMapping("/")
	public String appointmentView() {
		return "appointment";
	}
	
	@GetMapping("/all")
	public String getAll() {
		appointmentService.getAll();
		return "appointment";
	}

}
