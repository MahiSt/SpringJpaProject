package com.doctorapp.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Doctor {
	@Id
	@GeneratedValue(generator = "doctor_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "doctor_gen",sequenceName = "doctor_seq",initialValue = 100,allocationSize = 1)
	private int doctorId;

	@Column(length = 20)
	private String name;
	@Column(length = 20)
	@Enumerated(EnumType.STRING)
	private Specialisation speciality;
	@Column(length = 20)
	private int experience;

	private int fees;
	private LocalDateTime startTime;
	private LocalDateTime endTime;

	public Doctor() {
		super();
	}

	public Doctor(String name, Specialisation speciality, int experience, int fees, LocalDateTime startTime,
			LocalDateTime endTime) {
		super();
		this.name = name;
		this.speciality = speciality;
		this.experience = experience;
		this.fees = fees;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Specialisation getSpeciality() {
		return speciality;
	}

	public void setSpecialty(Specialisation speciality) {
		this.speciality = speciality;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "Doctor [DoctorId="+ doctorId+", name=" + name + ", speciality=" + speciality + ", experience="
				+ experience + ", fees=" + fees + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
	
	
}
