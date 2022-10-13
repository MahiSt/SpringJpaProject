package com.dressapp.service;

import java.util.List;

import com.dressapp.exceptions.IdNotFoundException;
import com.dressapp.exceptions.ProductNotFoundException;
import com.dressapp.model.Dress;

public interface IDressService {

	void addDress(Dress dress);
	void updateDress(Dress dress) throws IdNotFoundException;
	void deleteDress(int productId) throws IdNotFoundException;
	Dress getById(int productId) throws IdNotFoundException;
	
	List<Dress> getByGender(String gender) throws ProductNotFoundException;
	List<Dress> getByGenderAndCategory(String gender,String category) throws ProductNotFoundException;	
	List<Dress> getByGenderAndSize(String size, String gender) throws ProductNotFoundException;
	List<Dress> getByColorAndCategory(String color,String category) throws ProductNotFoundException;	
	List<Dress> getByMaterialAndCategory(String material,String category) throws ProductNotFoundException;
	List<Dress> getByBrandAndRating(String brand,double rating)throws ProductNotFoundException;
	List<Dress> getByBrandAndSize(String brand,String size)throws ProductNotFoundException;
	List<Dress> getByCategoryAndRating(String category,double rating) throws ProductNotFoundException;
	List<Dress> getByCategoryAndPrice(String category,double price) throws ProductNotFoundException;

}
