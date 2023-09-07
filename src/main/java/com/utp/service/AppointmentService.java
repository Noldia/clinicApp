package com.utp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.utp.model.Appointment;

@Service
public class AppointmentService implements IAppointmentService {

	
	public AppointmentService() {
		System.out.println("create instace for appointment service");
	}

	@Override
	public List<Appointment> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
