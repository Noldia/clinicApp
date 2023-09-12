package com.utp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.utp.model.Clinic;
import com.utp.model.Doctor;
import com.utp.model.MedicalSpeciality;
import com.utp.model.Shedule;
import com.utp.model.User;
import com.utp.service.DoctorService;

@Controller
@RequestMapping("/doctor")
public class DoctorController {
	
	private final DoctorService doctorService;

	@Autowired
	public DoctorController(DoctorService doctorService) {
		this.doctorService = doctorService;
	}
	
	@PostMapping("/save")
	public Doctor saveDoctor(@RequestBody Doctor doctor) {
		Clinic clinic = new Clinic();
		clinic.setClinicID(1L);
		Shedule shedule = new Shedule();
		shedule.setSheduleId(1L);
		User user = new User();
		user.setUserId(1L);
		
		doctor.setClinic(clinic);
		doctor.setUser(user);
		doctor.setShedule(shedule);
		doctor.setMedicalSpeciality(MedicalSpeciality.CARDIOLOGIA);
		return doctorService.saveDoctor(doctor);
	}
	
	@GetMapping("/listAll")
	@ResponseBody
	public List<Doctor> getDoctors() {
		List<Doctor> doctors = new ArrayList<Doctor>();
		
		try {			
			doctors = doctorService.getDoctors();
		} catch (Exception e) {
			System.err.println("Error al listar doctores... " + e);
		}
		return doctors;
	}
	
	
	
}
