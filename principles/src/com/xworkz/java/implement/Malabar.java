package com.xworkz.java.implement;

import com.xworkz.java.things.GoldSeller;

public class Malabar implements GoldSeller {

	@Override
	public double pricePerGram() {
		System.out.println("Running pricePerGram in Malabar");
		return 5000;
	}

	@Override
	public String getGstNo() {
		System.out.println("Running getGstNo in Malabar");
		return "#876543";
	}

	@Override
	public String getLocation() {
		System.out.println("Running getLocation in Malabar");
		return "Vijapur";
	}

}
