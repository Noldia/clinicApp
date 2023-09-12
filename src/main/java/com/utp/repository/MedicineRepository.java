package com.utp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utp.model.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, Long> {

}
