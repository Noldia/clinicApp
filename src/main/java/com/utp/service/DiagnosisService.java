package com.utp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.utp.model.Diagnosis;
import com.utp.repository.DiagnosisRepository;

@Service
public class DiagnosisService {

	private final DiagnosisRepository diagnosisRepository;
	
	@Autowired
	public DiagnosisService(DiagnosisRepository diagnosisRepository) {
		this.diagnosisRepository = diagnosisRepository;
	}
	
	@Transactional
	public Diagnosis saveDiagnosis(Diagnosis diagnosis) {
		return diagnosisRepository.save(diagnosis);
	}
	
}
