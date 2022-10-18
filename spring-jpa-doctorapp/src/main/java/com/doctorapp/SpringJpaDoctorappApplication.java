package com.doctorapp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doctorapp.model.Doctor;
import com.doctorapp.model.Specialisation;
import com.doctorapp.service.IDoctorService;

@SpringBootApplication
public class SpringJpaDoctorappApplication {//implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaDoctorappApplication.class, args);
	}
	
//	@Autowired
//	IDoctorService doctorService;
//	@Override
//	public void run(String... args) throws Exception {
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//
//		LocalDateTime startTime =LocalDateTime.parse("2022-10-18 10:30",formatter);
//		LocalDateTime endTime =LocalDateTime.parse("2022-10-18 19:30",formatter);
//
////		doctorService.addDoctor(new Doctor("Mahi", Specialisation.PEADO , 2, 500, startTime,endTime ));
////		doctorService.addDoctor(new Doctor("Harini",Specialisation.PHYSICIAN,3,1000,LocalDateTime.parse("2022-10-19 09:30", formatter),LocalDateTime.parse("2022-10-19 18:00", formatter)));
////		doctorService.addDoctor(new Doctor("Goki",Specialisation.CARDIO,2,400,LocalDateTime.parse("2022-10-18 09:30", formatter),LocalDateTime.parse("2022-10-28 18:00", formatter)));
////		doctorService.addDoctor(new Doctor("Sharmi",Specialisation.PEADO,2,500,LocalDateTime.parse("2022-10-18 10:30", formatter),LocalDateTime.parse("2022-10-18 18:00", formatter)));
//		
////		doctorService.deleteDoctor(105);
//		System.out.println("\nGetting By Id....");
//		System.out.println(doctorService.getById(103));
//		
//		System.out.println("\nGetting All Doctors....");
//		doctorService.getAllDoctors().forEach(System.out::println);
//		
//		System.out.println("\nGetting By Availability....");		
//		doctorService.getByAvailability(endTime).forEach(System.out::println);
//		
//		System.out.println("\nGetting By Experience....");		
//		doctorService.getByExperience(1).forEach(System.out::println);
//		
//		System.out.println("\nGetting By Speciality....");		
//		doctorService.getBySpeciality(Specialisation.CARDIO).forEach(System.out::println);
//		
//		System.out.println("\nGetting By Speciality and fees....");		
//		doctorService.getBySecialityAndFees(Specialisation.PEADO,1000).forEach(System.out::println);
//		
//		System.out.println("\nGetting By Speciality and Experience....");		
//		doctorService.getBySecialityAndExperience(Specialisation.CARDIO,1).forEach(System.out::println);
//		
//	}
//
}
