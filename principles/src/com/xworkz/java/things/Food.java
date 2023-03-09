package com.xworkz.java.things;

public class Food {
	public EatingRule eatingrule;

	public Food(EatingRule eatingrule) {
		this.eatingrule = eatingrule;
		System.out.println("EatingRule args const of Food");
	}

	public void setEatingRile() {
		boolean eat = this.eatingrule.EATINGFOOD;
		double dure = this.eatingrule.duration(5);
		if (dure<=7 && eat) {
			System.out.println("Duration is 7");
		}else {
		 System.out.println("Duration is not 7");
		}
	}
}
