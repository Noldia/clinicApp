package com.utp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.utp.model.Medicine;
import com.utp.repository.MedicineRepository;

@Service
public class MedicineService {

	private final MedicineRepository medicineRepository;

	@Autowired
	public MedicineService(MedicineRepository medicineRepository) {
		this.medicineRepository = medicineRepository;
	}
	
	@Transactional
	public Medicine saveMedicine(Medicine medicine) {
		return medicineRepository.save(medicine);
	}
	
}
