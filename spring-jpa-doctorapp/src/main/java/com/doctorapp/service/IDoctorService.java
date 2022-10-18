package com.doctorapp.service;

import java.time.LocalDateTime;
import java.util.List;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.exceptions.IdNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.model.Specialisation;

public interface IDoctorService {

	void addDoctor(Doctor doctor);
	void updateDoctor(Doctor doctor);
	void deleteDoctor(int id);
	Doctor getById(int id);
	
	List<Doctor> getAllDoctors();
	List<Doctor> getByAvailability(LocalDateTime time);	
	List<Doctor> getByExperience(int experience);	
	List<Doctor> getBySpeciality(Specialisation specialaity);		
	List<Doctor> getBySecialityAndFees(Specialisation specialaity,int feeRange);
	List<Doctor> getBySecialityAndExperience(Specialisation speciality,int experience);
}
