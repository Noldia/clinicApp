package com.utp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utp.model.Diagnosis;

public interface DiagnosisRepository extends JpaRepository<Diagnosis, Long>{

}
