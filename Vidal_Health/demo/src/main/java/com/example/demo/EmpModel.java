package com.example.demo;

import jakarta.persistence.*;

@Table(name = "empModel")
public class EmpModel {

	@Column(name = "name")
	String name;

	@Column(name = "regNo")
	int regNo;

	@Column(name = "email")
	String email;
}
