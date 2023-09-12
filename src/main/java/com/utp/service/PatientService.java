package com.utp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.utp.model.Patient;
import com.utp.repository.PatientRepository;

@Service
public class PatientService {

	private final PatientRepository patientRepository;

	@Autowired
	public PatientService(PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}
	
	@Transactional
	public Patient savePatient(Patient patient) {
		return patientRepository.save(patient);
	}
	
	
}
