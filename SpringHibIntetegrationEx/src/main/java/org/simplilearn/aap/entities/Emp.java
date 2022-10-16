package org.simplilearn.aap.entities;

import java.time.LocalDate;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ValueGenerationType;

@Entity
public class Emp {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int eno;
	private String name;
	private String address;
	private LocalDate dateOfJoin;
	
	public Emp(int eno, String name, String address, LocalDate dateOfJoin) {
		super();
		this.eno = eno;
		this.name = name;
		this.address = address;
		this.dateOfJoin = dateOfJoin;
	}

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(LocalDate dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

}
