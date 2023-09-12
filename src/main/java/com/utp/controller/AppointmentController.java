package com.utp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.utp.model.Appointment;
import com.utp.service.AppointmentService;

@Controller
@RequestMapping("/appointment")
public class AppointmentController {
	
	private final AppointmentService appointmentService;
	
	@Autowired
	public AppointmentController(AppointmentService appointmentService) {
		this.appointmentService = appointmentService;
	}

	@GetMapping("/")
	public String appointmentView() {
		return "appointment-view";
	}
	
	@GetMapping("/listAll")
	public String getAppointments(Model model) {
		List<Appointment> appointments= appointmentService.getAppointments();
		model.addAttribute("datos", appointments);
		return "admin-view";
	}


}
