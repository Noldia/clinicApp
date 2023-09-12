package com.utp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.utp.model.Appointment;
import com.utp.repository.AppointmentRepository;

@Service
public class AppointmentService {

	private final AppointmentRepository appointmentRepository;

	@Autowired
	public AppointmentService(AppointmentRepository appointmentRepository) {
		this.appointmentRepository = appointmentRepository;
	}

	@Transactional
	public Appointment saveAppointment( Appointment appointment) {
		return appointmentRepository.save(appointment);
	}

	@Transactional(readOnly = true)
	public List<Appointment> getAppointments() {
		return appointmentRepository.findAll();
	}

	@Transactional(readOnly = true) // Solo lectura
    public Optional<Appointment> getAppointmentById(Long appointmentId) {
        return appointmentRepository.findById(appointmentId);
    }

	@Transactional
    public void deleteAppointment(Long appointmentId) {
		appointmentRepository.deleteById(appointmentId);
    }

}
