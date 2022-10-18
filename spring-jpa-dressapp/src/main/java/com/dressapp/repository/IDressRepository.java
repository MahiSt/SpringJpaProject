package com.dressapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dressapp.model.Dress;

@Repository
public interface IDressRepository extends JpaRepository<Dress, Integer>{
	
	List<Dress> findByGender(String gender);
	List<Dress> findByGenderAndCategory(String gender,String category);	
	List<Dress> findByGenderAndSize(String gender, String size);
	List<Dress> findByColorAndCategory(String color,String category);	
	List<Dress> findByMaterialAndCategory(String material,String category);
	List<Dress> findByBrandAndRatingGreaterThan(String brand,double rating);
	List<Dress> findByBrandAndSize(String brand,String size);
	List<Dress> findByCategoryAndRatingGreaterThan(String category,double rating);
	List<Dress> findByCategoryAndPriceLessThan(String category,double price);	
}
