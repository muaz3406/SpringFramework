package com.otostore.test.classic;

import com.otostore.ArabaType;
import com.otostore.Tofas;

public class TestArabaClassic {

	public static void main(String[] args) {
		Tofas tofas = new Tofas();
		
		ArabaType sahin = new ArabaType();
		sahin.setMarka("Tofas");
		sahin.setModel("Sahin");
		sahin.setYear(1985);
		
		ArabaType kartal = new ArabaType();
		kartal.setMarka("Tofas");
		kartal.setMarka("Kartal");
		kartal.setYear(1986);

		ArabaType dogan = new ArabaType();
		dogan.setMarka("Tofas");
		dogan.setModel("Doğan");
		dogan.setYear(1985);
		
		tofas.setSahin(sahin);
		tofas.setKartal(kartal);
		tofas.setDogan(dogan);
		
		System.out.println(tofas);
	}

}
