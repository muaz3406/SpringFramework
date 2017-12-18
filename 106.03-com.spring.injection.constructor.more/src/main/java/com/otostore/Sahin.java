package com.otostore;

public class Sahin {
	private String marka;
	private String model;
	private int year;
	public Sahin(String marka) {
		super();
		this.marka = marka;
	}
	public Sahin(String marka, int year) {
		super();
		this.marka = marka;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Sahin [marka=" + marka + ", model=" + model + ", year=" + year + "]";
	}

	
	

}
