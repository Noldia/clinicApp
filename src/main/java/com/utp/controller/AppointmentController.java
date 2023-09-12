package com.utp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	@ResponseBody
	public List<Appointment> getAppointments() {
		return appointmentService.getAppointments();
	}


}
