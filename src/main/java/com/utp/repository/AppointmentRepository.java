package com.utp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utp.model.Appointment;

public interface AppointmentRepository  extends JpaRepository<Appointment, Long> {

}
