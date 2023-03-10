package com.xworkz.java.use;

import com.xworkz.java.things.GoldSeller;

public class Bhairavi {
	public GoldSeller goldSeller;

	public Bhairavi(GoldSeller goldSeller) {
		this.goldSeller = goldSeller;
		System.out.println("Running goldSeller in Bhairavi");
	}

	public void bangaraKaridi() {
		double ppg = this.goldSeller.pricePerGram();
		String ggn = this.goldSeller.getGstNo();
		String gl = this.goldSeller.getLocation();
		if (ppg < 6000 && ppg > 4500) {
			System.out.println("Bhairavi will buy gold");
		}
		System.out.println("getGstNo is" + ggn);
		System.out.println("getlocation is" + gl);
	}
}
