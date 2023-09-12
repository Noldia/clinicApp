package com.utp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utp.model.MedicalRecord;

public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {

}
