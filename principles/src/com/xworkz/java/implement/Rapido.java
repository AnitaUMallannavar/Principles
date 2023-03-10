package com.xworkz.java.implement;
import com.xworkz.java.things.*;
public class Rapido implements Delivery{

	@Override
	public double chargers() {
		System.out.println("");
		return 45;
	}

	@Override
	public double timeTake() {
		System.out.println("Running timeTaken in Rapito");
		return 65;
	}

	@Override
	public String agentName(int rating) {
		System.out.println("Running agentName in Rapido");
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
