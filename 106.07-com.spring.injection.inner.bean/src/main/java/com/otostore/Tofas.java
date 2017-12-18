package com.otostore;

public class Tofas {
	private ArabaType sahin;
	private ArabaType kartal;
	private ArabaType dogan;
	
	public ArabaType getSahin() {
		return sahin;
	}
	public void setSahin(ArabaType sahin) {
		this.sahin = sahin;
	}
	public ArabaType getKartal() {
		return kartal;
	}
	public void setKartal(ArabaType kartal) {
		this.kartal = kartal;
	}
	public ArabaType getDogan() {
		return dogan;
	}
	public void setDogan(ArabaType dogan) {
		this.dogan = dogan;
	}
	
	@Override
	public String toString() {
		return "Tofas [sahin=" + sahin + ", kartal=" + kartal + ", dogan=" + dogan + "]";
	}
	
	
	
	

}
