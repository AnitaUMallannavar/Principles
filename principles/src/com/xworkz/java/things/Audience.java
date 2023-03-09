package com.xworkz.java.things;

public class Audience {
    public CricketRule cricketRule;
    
    public Audience(CricketRule cricketRule) {
	   this.cricketRule=cricketRule;
	   System.out.println("CricketRule const in Audience");
	}
    public String setCricketRules() {
    	boolean bl=this.cricketRule.ALLPRESENT;
    	int it=this.cricketRule.noOfPlayers(11);
    	//if(bl!=false&&)
		return "All rules are present";
    	
    }
}
