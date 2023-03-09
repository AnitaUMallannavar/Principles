package com.xworkz.java.run;

import com.xworkz.java.rule.food.CricketRule;

public class CricketUser {
   public CricketRule cricketrule;
   public void setCricketUser(CricketRule cricketrule) {
	   this.cricketrule=cricketrule;
	 boolean bl= this.cricketrule.allPresent("present");
     int it=this.cricketrule.noOfMembarse();
	/* if(this.noOfMemberse==null&&bl) {
		 
	 }*/
   }
   
}
