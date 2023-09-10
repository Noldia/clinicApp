package com.utp.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Receptionist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "receptionist_id")
	private Long			receptionistId;
	
	@ManyToOne
    @JoinColumn(name = "user_id")
	private User			user;
	
	@ManyToOne
    @JoinColumn(name = "shedule_id")
    private Shedule shedule;
	
	@Column(name = "receptionist_name")
	private String		receptionistName;
	
	@Column(name = "receptionist_dni")
	private String		receptionistDNI;
	
	@Column(name = "receptionist_address")
	private String		receptionistAddress;
	
	@Column(name = "receptionist_phone")
	private String		receptionistPhone;

}
