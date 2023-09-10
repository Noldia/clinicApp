package com.utp.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "doctor_id")
	private Long			doctorId;

	@ManyToOne
    @JoinColumn(name = "user_id")
	private User			user;

	@ManyToOne
    @JoinColumn(name = "clinic_id")
    private Clinic clinic;

	@ManyToOne
    @JoinColumn(name = "shedule_id")
    private Shedule shedule;
	
	@OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<Appointment> appointments;

	@Column(name = "doctor_name")
	private String		doctorName;

	@Column(name = "doctor_dni")
	private String		doctorDNI;

	@Column(name = "doctor_address")
	private String		doctorAddress;

	@Column(name = "doctor_phone")
	private String		doctorPhone;

	@Column(name = "medical_speciality")
	private String		medicalSpeciality;

	public Long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Clinic getClinic() {
		return clinic;
	}

	public void setClinic(Clinic clinic) {
		this.clinic = clinic;
	}

	public Shedule getShedule() {
		return shedule;
	}

	public void setShedule(Shedule shedule) {
		this.shedule = shedule;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorDNI() {
		return doctorDNI;
	}

	public void setDoctorDNI(String doctorDNI) {
		this.doctorDNI = doctorDNI;
	}

	public String getDoctorAddress() {
		return doctorAddress;
	}

	public void setDoctorAddress(String doctorAddress) {
		this.doctorAddress = doctorAddress;
	}

	public String getDoctorPhone() {
		return doctorPhone;
	}

	public void setDoctorPhone(String doctorPhone) {
		this.doctorPhone = doctorPhone;
	}

	public String getMedicalSpeciality() {
		return medicalSpeciality;
	}

	public void setMedicalSpeciality(String medicalSpeciality) {
		this.medicalSpeciality = medicalSpeciality;
	}
}
