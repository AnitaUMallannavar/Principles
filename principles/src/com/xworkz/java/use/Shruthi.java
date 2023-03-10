package com.xworkz.java.use;
import com.xworkz.java.things.GoldSeller;
public class Shruthi {
     public GoldSeller goldSeller;
     
     public Shruthi(GoldSeller goldSeller) {
    	 this.goldSeller=goldSeller;
		System.out.println("Running goldSeller in Shruthi");
	  }
     public void chinnaTago() {
    	 System.out.println("Running chinnaTago in Shruthi");
    	 double ppg = this.goldSeller.pricePerGram();
 		String ggn = this.goldSeller.getGstNo();
 		String gl = this.goldSeller.getLocation();
 		if(ppg<4000) {
 			System.out.println("Shruthi chinna tagotale");
 		}
 		System.out.println("getGstNo is :"+ggn);
 		System.out.println("getLocation is:"+gl);
     }
}
