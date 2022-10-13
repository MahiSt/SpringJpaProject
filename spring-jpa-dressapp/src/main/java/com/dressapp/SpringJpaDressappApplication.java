package com.dressapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dressapp.model.Brand;
import com.dressapp.model.Category;
import com.dressapp.model.Dress;
import com.dressapp.model.Material;
import com.dressapp.model.Size;
import com.dressapp.service.IDressService;

@SpringBootApplication
public class SpringJpaDressappApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaDressappApplication.class, args);
	}

	IDressService dressService;
	
	@Autowired
	public void setDressService(IDressService dressService) {
		this.dressService = dressService;
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Insert");
		Dress dress=new Dress(1,"Red Legin","Female",Category.LEGIN.category,Material.LINEN.material,Brand.JDY.brand,
				Size.L.size,"Red",349,4.6);
		Dress dress1=new Dress(2,"White shirt","Male",Category.SHIRT.category,Material.COTTON.material,Brand.COSCO.brand,
				Size.XL.size,"White",700,4.8);
		Dress dress2=new Dress(3,"Red Legin","Female",Category.LEGIN.category,Material.LINEN.material,Brand.JDY.brand,
				Size.L.size,"Red",349,4.6);
		
		dressService.addDress(dress);
		dressService.addDress(dress1);
		dressService.addDress(dress2);
		
		dressService.deleteDress(3);
		System.out.println("By id:");
		System.out.println(dressService.getById(1));
		
		System.out.println("\nBy Gender");
		dressService.getByGender("Male").forEach(System.out::println);
		
		System.out.println("\nBy Gender and Category");
		dressService.getByGenderAndCategory("Female", Category.LEGIN.category).forEach(System.out::println);
		
		System.out.println("\nBy Gender and Size");
		dressService.getByGenderAndSize("Male", Size.XL.size).forEach(System.out::println);
		
		System.out.println("\nBy Color and Category");
		dressService.getByColorAndCategory("White", Category.SHIRT.category).forEach(System.out::println);
		
		System.out.println("\nBy Material and category");
		dressService.getByMaterialAndCategory(Material.COTTON.material, Category.SHIRT.category).forEach(System.out::println);
		
		System.out.println("\nBy Brand and Rating");
		dressService.getByBrandAndRating(Brand.COSCO.brand, 4).forEach(System.out::println);
		
		System.out.println("\nBy Brand and Size");
		dressService.getByBrandAndSize(Brand.JDY.brand, Size.L.size).forEach(System.out::println);
		
		System.out.println("\nBy Category and Rating");
		dressService.getByCategoryAndRating(Category.SHIRT.category, 4).forEach(System.out::println);
		
		System.out.println("\nBy category and Price");
		dressService.getByCategoryAndPrice(Category.LEGIN.category, 500).forEach(System.out::println);
	}

}
