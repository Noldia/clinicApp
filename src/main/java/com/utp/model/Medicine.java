package com.utp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Medicine {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "medicine_id")
    private Long medicineId;
	
	@Column(name = "medicine_name")
    private String medicineName;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

}
