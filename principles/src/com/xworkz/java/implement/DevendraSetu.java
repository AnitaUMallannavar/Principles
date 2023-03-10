package com.xworkz.java.implement;

import com.xworkz.java.things.GoldSeller;

public class DevendraSetu implements GoldSeller{

	@Override
	public double pricePerGram() {
		System.out.println("Running pricePerGram ");
		return 6000;
	}

	@Override
	public String getGstNo() {
		System.out.println("Running getGstNo ");
		return "76532";
	}

	@Override
	public String getLocation() {
		System.out.println("Running getLocation");
		return "Bengalur";
	}      
}
