package com.utp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.utp.model.MedicalRecord;
import com.utp.repository.MedicalRecordRepository;

@Service
public class MedicalRecordService {

	private final MedicalRecordRepository medicalRecordRepository;

	@Autowired
	public MedicalRecordService(MedicalRecordRepository medicalRecordRepository) {
		this.medicalRecordRepository = medicalRecordRepository;
	}
	
	@Transactional
	public MedicalRecord saveMedicalRecord(MedicalRecord medicalRecord) {
		return medicalRecordRepository.save(medicalRecord);
	}
	
}
