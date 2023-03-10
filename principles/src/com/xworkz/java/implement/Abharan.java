package com.xworkz.java.implement;

import com.xworkz.java.things.GoldSeller;

public class Abharan implements GoldSeller {

	@Override
	public double pricePerGram() {
		System.out.println("Running pricePeGram in Abharan");
		return 4200;
	}

	@Override
	public String getGstNo() {
		System.out.println("Running getGstNo in Abharan");
		return "89765";
	}

	@Override
	public String getLocation() {
		System.out.println("Running getLocation in Abharan");
		return "345687";
	}

}
