package com.otostore;

public class Civic {
	private String model;
	private int year;
	
	public Civic(String model) {
		super();
		this.model = model;
	}

	public Civic(String model, int year) {
		super();
		this.model = model;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Civic [model=" + model + ", year=" + year + "]";
	}


	
}
