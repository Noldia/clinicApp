package com.utp.model;

import jakarta.persistence.*;

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
