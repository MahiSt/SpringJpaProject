package com.doctorapp.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.doctorapp.model.Doctor;
import com.doctorapp.model.Specialisation;

@Repository
public interface IDoctorRepository extends JpaRepository<Doctor, Integer>{
	
	List<Doctor> findBySpeciality(Specialisation speciality);	
	@Query("from Doctor where startTime<=?1 and endTime>=?1")
	List<Doctor> findByAvailability(LocalDateTime time);	
	List<Doctor> findByExperienceGreaterThanEqual(int experience);	
	List<Doctor> findBySpecialityAndFeesLessThan(Specialisation speciality,int fees);
	List<Doctor> findBySpecialityAndExperienceGreaterThanEqual(Specialisation speciality,int experience);

}
