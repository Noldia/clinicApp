package com.utp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utp.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
