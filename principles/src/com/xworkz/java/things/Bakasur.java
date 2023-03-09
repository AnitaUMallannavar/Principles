package com.xworkz.java.things;

public class Bakasur implements EatingRule {
	private double time;

	public Bakasur() {
		System.out.println("No args const of Bakasur");
	}

	@Override
	public double duration(double time) {
		this.time = time;
		System.out.println("Running duration in Bakasur");
		if (this.time != 0 && this.time == 3) {
			System.out.println("Time is 3hours");
			return 3;
		}else {
			System.out.println("Time is not 3 Hours");
		}
		return 2;
	}

	@Override
	public String eatingTime(int duration1) {
		//this.duration1=duration1;
		System.out.println("Running eatingTime in Bakasur");
		if(duration1!=0&&duration1==3) {
			System.out.println("Duration is 3");
			return "1Hours";
		}else {
			System.out.println("duratuon is not 1 hours");
		}
		return "Starts 8AM";
	}

}
