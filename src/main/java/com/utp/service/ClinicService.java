package com.utp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.utp.model.Clinic;
import com.utp.repository.ClinicRepository;

@Service
public class ClinicService {

	private final ClinicRepository clinicRepository;

	@Autowired
	public ClinicService(ClinicRepository clinicRepository) {
		this.clinicRepository = clinicRepository;
	}
	
	@Transactional
	public Clinic saveClinic(Clinic clinic) {
		return clinicRepository.save(clinic);
	}
}
