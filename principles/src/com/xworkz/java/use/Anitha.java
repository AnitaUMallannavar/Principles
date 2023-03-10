package com.xworkz.java.use;

import com.xworkz.java.things.GoldSeller;

public class Anitha {
	public GoldSeller goldSeller;

	public Anitha(GoldSeller goldSeller) {
		this.goldSeller = goldSeller;
		System.out.println("Running goldSeller in Anitha");
	}

	public void buyGold() {
		System.out.println("Running buyGold in Anitha");
		double ppg = this.goldSeller.pricePerGram();
		String ggn = this.goldSeller.getGstNo();
		String gl = this.goldSeller.getLocation();
		if (ppg < 5000) {
			System.out.println("Anitha will buy Gold");
		}
		System.out.println("getGstNo is :" + ggn);
		System.out.println("getLocation is :" + gl);
	}
}
