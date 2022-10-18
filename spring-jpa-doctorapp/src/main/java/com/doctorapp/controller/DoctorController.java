package com.doctorapp.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doctorapp.model.Doctor;
import com.doctorapp.model.Specialisation;
import com.doctorapp.service.IDoctorService;

@RestController
@RequestMapping("doctor-api")
public class DoctorController {
	@Autowired
	private IDoctorService doctorService;
	
	@PostMapping("/doctors")
	void addDoctor(@RequestBody Doctor doctor) {
		doctorService.addDoctor(doctor);
	}
	
	@PutMapping("/doctors")
	void updateDoctor(@RequestBody Doctor doctor) {
		doctorService.updateDoctor(doctor);
	}
	
	@DeleteMapping("/doctors/doctorId/{doctorid}")
	void deleteDoctor(@PathVariable("doctorid") int doctorId) {
		doctorService.deleteDoctor(doctorId);
	}
	
	@GetMapping("/doctors/doctorId/{doctorid}")
	Doctor getById(@PathVariable("doctorid") int doctorId) {
		return doctorService.getById(doctorId);
	}
	
	@GetMapping("/doctors")
	List<Doctor> getAllDoctors(){
		return doctorService.getAllDoctors();
	}
	
	@GetMapping("/doctors/time/{time}")
	List<Doctor> getByAvailability(@PathVariable("time") String time){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

		LocalDateTime ctime =LocalDateTime.parse(time,formatter);
		
		return doctorService.getByAvailability(ctime);
	}
	
	@GetMapping("/doctors/experience/{experience}")
	List<Doctor> getByExperience(@PathVariable("experience") int experience){
		return doctorService.getByExperience(experience);
	}
	
	@GetMapping("/doctors/speciality/{speciality}")
	List<Doctor> getBySpeciality(@PathVariable("speciality") Specialisation speciality){
		return doctorService.getBySpeciality(speciality);
	}
	
	@GetMapping("/doctors/speciality/{speciality}/fees/{fees}")
	List<Doctor> getBySpecialityAndFees(@PathVariable("speciality") Specialisation specialaity,@PathVariable("fees") int fees){
		return doctorService.getBySecialityAndFees(specialaity, fees);
	}
	
	@GetMapping("/doctors/speciality/{speciality}/experience/{experience}")
	List<Doctor> getBySpecialityAndExperience(@PathVariable("speciality") Specialisation speciality,@PathVariable("experience") int experience){
		return doctorService.getBySecialityAndExperience(speciality, experience);
	}

}
