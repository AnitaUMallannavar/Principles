package com.xworkz.java.implement;

import com.xworkz.java.things.Delivery;

public class Dunzo implements Delivery{

	@Override
	public double chargers() {
		System.out.println("Running Charger in Dunzo");
		return 30;
	}

	@Override
	public double timeTake() {
		System.out.println("Running timeTaken in Dunzo");
		return 40;
	}

	@Override
	public String agentName(int rating) {
		System.out.println("Running agentName in Delivery");
		if(rating==1) {
			System.out.println("rating is 1");
			return "Basavaraj";
		}
		if(rating==2) {
			System.out.println("rating is 2");
			return "Dinakar";
		}
		if(rating==3) {
			System.out.println("rating is 3");
			return "Shivu";
		}
		return "Rating is good";
	}

}
