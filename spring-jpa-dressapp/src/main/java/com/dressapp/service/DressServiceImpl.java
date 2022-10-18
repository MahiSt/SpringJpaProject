package com.dressapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dressapp.exceptions.*;
import com.dressapp.model.Dress;
import com.dressapp.repository.IDressRepository;

@Service
public class DressServiceImpl implements IDressService {
	@Autowired
	IDressRepository dressRepository;

	/**
	 * @param dressRepository
	 */
	public void setDressRepository(IDressRepository dressRepository) {
		this.dressRepository = dressRepository;
	}


	/**
	 *@param dress
	 */
	@Override
	public void addDress(Dress dress){
		dressRepository.save(dress);
	}

	@Override
	public void updateDress(Dress dress) throws IdNotFoundException{
		dressRepository.save(dress);
	}

	@Override
	public void deleteDress(int productId) throws IdNotFoundException{
		dressRepository.deleteById(productId);
	}

	@Override
	public Dress getById(int productId) throws IdNotFoundException{
		Dress dress=dressRepository.findById(productId).get();
		if(dress==null) {
			throw new IdNotFoundException();			
		}
		return dress;
	}

	@Override
	public List<Dress> getByGender(String gender) throws ProductNotFoundException{
		List<Dress> dresses= dressRepository.findByGender(gender)
				.stream()
				.sorted((d1,d2)->{
					return d1.getProductName().compareTo(d1.getProductName());
				})
				.collect(Collectors.toList());

		if(dresses.isEmpty()) {
			throw new ProductNotFoundException("Oops!..Currently its out of stock...");
		}
		return dresses;
	}

	@Override
	public List<Dress> getByGenderAndCategory(String gender, String category) throws ProductNotFoundException{
		List<Dress> dresses= dressRepository.findByGenderAndCategory(gender,category)
				.stream()
				.sorted((d1,d2)->{
					return d1.getProductName().compareTo(d1.getProductName());
				})
				.collect(Collectors.toList());
		if(dresses.isEmpty()) {
			throw new ProductNotFoundException("Oops!..Currently its out of stock...");
		}
		return dresses;	
	}

	@Override
	public List<Dress> getByGenderAndSize(String gender,String size) throws ProductNotFoundException {
		List<Dress> dresses=dressRepository.findByGenderAndSize(gender,size)
				.stream()
				.sorted((d1,d2)->{
					return d1.getProductName().compareTo(d1.getProductName());
				})
				.collect(Collectors.toList());
		if(dresses.isEmpty()) {
			throw new ProductNotFoundException("Oops!..Currently its out of stock...");
		}
		return dresses;
	}

	@Override
	public List<Dress> getByColorAndCategory(String color, String category) throws ProductNotFoundException {
		List<Dress> dresses=dressRepository.findByColorAndCategory(color,category)
				.stream()
				.sorted((d1,d2)->{
					return d1.getProductName().compareTo(d1.getProductName());
				})
				.collect(Collectors.toList());
		if(dresses.isEmpty()) {
			throw new ProductNotFoundException("Oops!..Currently its out of stock...");
		}
		return dresses;
}

	@Override
	public List<Dress> getByMaterialAndCategory(String material, String category) throws ProductNotFoundException {
		List<Dress> dresses= dressRepository.findByMaterialAndCategory(material,category)
				.stream()
				.sorted((d1,d2)->{
					return d1.getProductName().compareTo(d1.getProductName());
				})
				.collect(Collectors.toList());
		if(dresses.isEmpty()) {
			throw new ProductNotFoundException("Oops!..Currently its out of stock...");
		}
		return dresses;
	}

	@Override
	public List<Dress> getByBrandAndRating(String brand, double rating) throws ProductNotFoundException {
		List<Dress> dresses= dressRepository.findByBrandAndRatingGreaterThan(brand,rating)
				.stream()
				.sorted((d1,d2)->{
					return d1.getProductName().compareTo(d1.getProductName());
				})
				.collect(Collectors.toList());
		if(dresses.isEmpty()) {
			throw new ProductNotFoundException("Oops!..Currently its out of stock...");
		}
		return dresses;
	}

	@Override
	public List<Dress> getByBrandAndSize(String brand, String size) throws ProductNotFoundException {
		List<Dress> dresses= dressRepository.findByBrandAndSize(brand,size)
				.stream()
				.sorted((d1,d2)->{
					return d1.getProductName().compareTo(d1.getProductName());
				})
				.collect(Collectors.toList());
		if(dresses.isEmpty()) {
			throw new ProductNotFoundException("Oops!..Currently its out of stock...");
		}
		return dresses;
	}

	@Override
	public List<Dress> getByCategoryAndRating(String category, double rating) throws ProductNotFoundException {
		List<Dress> dresses= dressRepository.findByCategoryAndRatingGreaterThan(category,rating)
				.stream()
				.sorted((d1,d2)->{
					return d1.getProductName().compareTo(d1.getProductName());
				})
				.collect(Collectors.toList());
		if(dresses.isEmpty()) {
			throw new ProductNotFoundException("Oops!..Currently its out of stock...");
		}
		return dresses;
	}

	@Override
	public List<Dress> getByCategoryAndPrice(String category, double price) throws ProductNotFoundException {
		List<Dress> dresses= dressRepository.findByCategoryAndPriceLessThan(category,price)
				.stream()
				.sorted((d1,d2)->{
					return d1.getProductName().compareTo(d1.getProductName());
				})
				.collect(Collectors.toList());
		if(dresses.isEmpty()) {
			throw new ProductNotFoundException("Oops!..Currently its out of stock...");
		}
		return dresses;
	}


}
