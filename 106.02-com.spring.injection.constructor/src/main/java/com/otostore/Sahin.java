package com.otostore;

public class Sahin {
	private String marka;
	private String model;
	private int year;
	
	public Sahin(String marka, String model, int year) {
		super();
		this.marka = marka;
		this.model = model;
		this.year = year;
	}

	public String getMarka() {
		return marka;
	}
	
	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Sahin [marka=" + marka + ", model=" + model + ", year=" + year + "]";
	}

	
	

}
