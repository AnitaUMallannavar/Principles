package com.xworkz.java.runner;

import com.xworkz.java.things.Audience;
import com.xworkz.java.things.CricketRule;
import com.xworkz.java.things.Players;

public class CricketRuleRunner {

	public static void main(String[] args) {
		CricketRule cricketRule=new Players();
		Audience audience=new Audience(cricketRule);
		audience.setCricketRules();

	}

}
