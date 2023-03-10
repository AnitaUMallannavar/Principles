package com.xworkz.java.runner;

import com.xworkz.java.implement.Abharan;
import com.xworkz.java.implement.DevendraSetu;
import com.xworkz.java.implement.Mahalakshmi;
import com.xworkz.java.implement.Malabar;
import com.xworkz.java.things.GoldSeller;
import com.xworkz.java.use.Anitha;
import com.xworkz.java.use.Bhairavi;
import com.xworkz.java.use.Priyanka;
import com.xworkz.java.use.Shruthi;

public class GoldSellerRunner {

	public static void main(String[] args) {
		GoldSeller goldSeller = new Malabar();
		Bhairavi bhairavi = new Bhairavi(goldSeller);
		bhairavi.bangaraKaridi();
		System.out.println("===================");
		GoldSeller goldSeller1 = new DevendraSetu();
		Shruthi shruthi = new Shruthi(goldSeller1);
		shruthi.chinnaTago();
		System.out.println("===================");
		GoldSeller goldSeller2 = new Abharan();
		Priyanka priyanka = new Priyanka(goldSeller2);
		priyanka.purchaseGold();
		System.out.println("==================");
		GoldSeller goldSeller3 = new Mahalakshmi();
		Anitha anitha = new Anitha(goldSeller3);
		anitha.buyGold();
	}

}
