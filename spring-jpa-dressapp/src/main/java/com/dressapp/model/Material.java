package com.dressapp.model;

public enum Material {
	COTTON("Cotton"),
	DENIM("Denim"),
	LINEN("Linen");
	
	public String material;

	private Material(String material) {
		this.material=material;
	}
}
