package com.otostore;

public class Civic {
	private String model;

	public Civic(String model) {
		super();
		this.model = model;
	}

	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Civic [model=" + model + "]";
	}

	
}
