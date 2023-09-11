package com.utp.model;

import java.sql.Time;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Shedule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "shedule_id")
	private Long	sheduleId;
	
	@OneToMany(mappedBy = "shedule", cascade = CascadeType.ALL)
	private List<Doctor> doctors;
	
	@OneToMany(mappedBy = "shedule", cascade = CascadeType.ALL)
	private List<Receptionist> receptionist;
	
	@Column(name = "start_time")
	private Time	startTime;
	
	@Column(name = "end_time")
	private Time	endTime;
}
