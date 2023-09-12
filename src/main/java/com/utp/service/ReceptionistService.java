package com.utp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.utp.model.Receptionist;
import com.utp.repository.ReceptionistRepository;

@Service
public class ReceptionistService {

	private final ReceptionistRepository receptionistRepository;

	@Autowired
	public ReceptionistService(ReceptionistRepository receptionistRepository) {
		this.receptionistRepository = receptionistRepository;
	}
	
	@Transactional
	public Receptionist saveReceptionist(Receptionist receptionist) {
		return receptionistRepository.save(receptionist);
	}
	
}
