package com.doctorapp.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctorapp.model.Doctor;
import com.doctorapp.model.Specialisation;
import com.doctorapp.repository.IDoctorRepository;

@Service
public class DoctorServiceImpl implements IDoctorService{
	@Autowired
	IDoctorRepository doctorRepository;

	@Override
	public void addDoctor(Doctor doctor) {
		doctorRepository.save(doctor);
	}

	@Override
	public void updateDoctor(Doctor doctor){
		doctorRepository.save(doctor);
	}

	@Override
	public void deleteDoctor(int doctorId){
		doctorRepository.deleteById(doctorId);
	}

	@Override
	public Doctor getById(int doctorId){
		return doctorRepository.findById(doctorId).get();
	}

	@Override
	public List<Doctor> getAllDoctors() {
		return doctorRepository.findAll();
	}

	@Override
	public List<Doctor> getByAvailability(LocalDateTime time) {
		return doctorRepository.findByAvailability(time);
	}

	@Override
	public List<Doctor> getByExperience(int experience) {
		return doctorRepository.findByExperienceGreaterThanEqual(experience);
	}

	@Override
	public List<Doctor> getBySpeciality(Specialisation speciality) {
		return doctorRepository.findBySpeciality(speciality);
	}

	@Override
	public List<Doctor> getBySecialityAndFees(Specialisation speciality,int fees) {
		return doctorRepository.findBySpecialityAndFeesLessThan(speciality, fees);
	}

	@Override
	public List<Doctor> getBySecialityAndExperience(Specialisation speciality,int experience) {
		return doctorRepository.findBySpecialityAndExperienceGreaterThanEqual(speciality, experience);
	}

}
