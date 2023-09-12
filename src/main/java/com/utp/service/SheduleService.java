package com.utp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.utp.model.Shedule;
import com.utp.repository.SheduleRepository;

@Service
public class SheduleService {

	private final SheduleRepository sheduleRepository;

	@Autowired
	public SheduleService(SheduleRepository sheduleRepository) {
		this.sheduleRepository = sheduleRepository;
	}
	
	@Transactional
	public Shedule saveShedule(Shedule shedule) {
		return sheduleRepository.save(shedule);
	}
	
	
	
}
