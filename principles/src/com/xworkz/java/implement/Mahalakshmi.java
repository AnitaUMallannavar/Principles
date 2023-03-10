package com.xworkz.java.implement;

import com.xworkz.java.things.GoldSeller;

public class Mahalakshmi implements GoldSeller {

	@Override
	public double pricePerGram() {
		System.out.println("Running pricePerGram in Mahalakshmi");
		return 4200;
	}

	@Override
	public String getGstNo() {
		System.out.println("Running gerGstNo in Mahalakshmi");
		return "222999";
	}

	@Override
	public String getLocation() {
		System.out.println("Running getLocation in Mahalakshmi");
		return "Nammuru";
	}

}
