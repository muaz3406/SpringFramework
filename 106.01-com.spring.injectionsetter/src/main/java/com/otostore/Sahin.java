package com.otostore;

public class Sahin {
	private String marka;
	private String model;
	private int year;
	
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

	public void brake(){
		System.out.println("sahin abs fren yap");
	}
	

}
