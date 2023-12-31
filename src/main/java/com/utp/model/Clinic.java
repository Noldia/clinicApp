package com.utp.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
public class Clinic {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "clinic_id")
	private Long			clinicID;

	@OneToMany(mappedBy = "clinic", cascade = CascadeType.ALL)
	@JsonIgnore
    private List<Doctor>	doctors;

	@Column(name = "clinic_name")
	private String			clinicName;

	@Column(name = "clinic_address")
	private String			clinicAddress;

	@Column(name = "clinic_phone")
	private String			clinicPhone;

	public Long getClinicID() {
		return clinicID;
	}

	public void setClinicID(Long clinicID) {
		this.clinicID = clinicID;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	public String getClinicName() {
		return clinicName;
	}

	public void setClinicName(String clinicName) {
		this.clinicName = clinicName;
	}

	public String getClinicAddress() {
		return clinicAddress;
	}

	public void setClinicAddress(String clinicAddress) {
		this.clinicAddress = clinicAddress;
	}

	public String getClinicPhone() {
		return clinicPhone;
	}

	public void setClinicPhone(String clinicPhone) {
		this.clinicPhone = clinicPhone;
	}
}
