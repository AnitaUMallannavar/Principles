package com.xworkz.java.runner;

import com.xworkz.java.things.Bakasur;
import com.xworkz.java.things.EatingRule;
import com.xworkz.java.things.Food;

public class EatingRuleRunner {

	public static void main(String[] args) {
		EatingRule eatingRule=new Bakasur();
		Food food=new Food(eatingRule);
		food.setEatingRile();

	}

}
