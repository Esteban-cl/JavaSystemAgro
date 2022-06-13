package com.example.systemagro.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="species", catalog = "systemagrojava", schema = "")
public class Specie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer id;
	@Column
	private String nameSpecie;
	@Column
	private String description;

	@CreationTimestamp
	@Column(nullable = false, updatable = false)
	private LocalDateTime created_at;

	@UpdateTimestamp
	private LocalDateTime  updated_at;


	public Integer getId() {return id;}

	public String getNameSpecie() {
		return nameSpecie;
	}
	public void setNameSpecie(String nameSpecie) {
		this.nameSpecie = nameSpecie;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
