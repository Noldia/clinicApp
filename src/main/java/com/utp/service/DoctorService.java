package com.utp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.utp.model.Doctor;
import com.utp.repository.DoctorRepository;

@Service
public class DoctorService {

	private final DoctorRepository doctorRepository;

	@Autowired
	public DoctorService(DoctorRepository doctorRepository) {
		this.doctorRepository = doctorRepository;
	}

	@Transactional
	public Doctor saveDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
	}
	
	@Transactional
	public List<Doctor> getDoctors() {
		return doctorRepository.findAll();
	}

}
