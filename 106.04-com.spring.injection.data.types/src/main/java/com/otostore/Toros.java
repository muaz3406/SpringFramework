package com.otostore;

public class Toros {

	private String marka;
	private String model;
	private int year;
	
	public Toros(String marka) {
		super();
		this.marka = marka;
	}

	public Toros(String marka, int year) {
		super();
		this.marka = marka;
		this.year = year;
	}



	public Toros(String marka, String model) {
		super();
		this.marka = marka;
		this.model = model;
	}

	public Toros(String marka, String model, int year) {
		super();
		this.marka = marka;
		this.model = model;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Toros [marka=" + marka + ", model=" + model + ", year=" + year + "]";
	}
	
	
	
}
