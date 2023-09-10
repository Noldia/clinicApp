package com.utp.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Recipe {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "recipe_id")
    private Long recipeId;

	@OneToOne
	@JoinColumn(name = "appointment_id")
	private Appointment appointment;

	@OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private List<Medicine> medicines;

	public Long getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(Long recipeId) {
		this.recipeId = recipeId;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	public List<Medicine> getMedicines() {
		return medicines;
	}

	public void setMedicines(List<Medicine> medicines) {
		this.medicines = medicines;
	}
}
