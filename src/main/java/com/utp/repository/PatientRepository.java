package com.utp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utp.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
