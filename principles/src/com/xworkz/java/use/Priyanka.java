package com.xworkz.java.use;

import com.xworkz.java.things.GoldSeller;

public class Priyanka {
      public GoldSeller goldSeller;
      
      public Priyanka(GoldSeller goldSeller) {
		this.goldSeller=goldSeller;
		System.out.println("Running goldSeller in Priyanka");
	}
      public void purchaseGold() {
    	  System.out.println("Running purchaseGold in priyanka");
    	  double ppg=this.goldSeller.pricePerGram();
    	  String ggn=this.goldSeller.getGstNo();
    	  String gl=this.goldSeller.getLocation();
    	  if(ppg<4500) {
    		  System.out.println("Priyanka will purchaseGold");
    	  }
    	  System.out.println("getGstNo is:"+ggn);
    	  System.out.println("getLocation is :"+gl);
      }
}
