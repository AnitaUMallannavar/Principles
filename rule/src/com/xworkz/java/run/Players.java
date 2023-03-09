package com.xworkz.java.run;

import com.xworkz.java.rule.food.CricketRule;

public class Players implements CricketRule {
      private String fName;
	public Players() {
		System.out.println("No args const of Player");	
	}
	@Override
	public boolean allPresent(String present) {
		System.out.println("Running allPresent in Player");
		return true;
	}
	@Override
	public double startingTime(String fName) {
		this.fName=fName;
		if(this.fName!=null&&fName.equals("Aswin")) {
			System.out.println("Aswin starting time is 10:30");
		}else {
			System.out.println("Aswin starting is not 10:30");
		}
		return 10.30;
	}
	@Override
	public int noOfMembarse() {
		System.out.println("Running number of players in Players");
		return 11;
	}
	
}