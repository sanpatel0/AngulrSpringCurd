package com.curd.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue
	private Long id;
	private String fname;
	private String lname;
}
