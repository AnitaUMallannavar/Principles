package com.xworkz.java.things;

public class Farmer implements FarmRule{
   private int landCost;
   public Farmer() {
	System.out.println("No args const of Farmer");
}
	@Override
	public String farmerStrong(int landCost) {
	   this.landCost=landCost;
	System.out.println("Running landCost in Farmer");
	if(this.landCost!=0 && landCost==19) {
		System.out.println("landCost is 19L");
		return "19L";
	}else {
		System.out.println("landCost is null");
	}
		return "19L";
	}

}
