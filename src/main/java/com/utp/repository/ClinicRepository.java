package com.utp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utp.model.Clinic;

public interface ClinicRepository extends JpaRepository<Clinic, Long>{

}
