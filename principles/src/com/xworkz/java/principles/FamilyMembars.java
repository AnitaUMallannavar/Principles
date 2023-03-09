package com.xworkz.java.principles;

public class FamilyMembars implements FamilyRule {

	@Override
	public double getTime() {
		System.out.println("Running getUpTiming in FamilyMembers");
		return 8;
	}

	@Override
	public String tiffinTime() {
		System.out.println("Running tiffinTime in FamilyMembers");
		return "within 9:30am";
	}

	@Override
	public String poojaTime() {
		System.out.println("Running poojaTiming in FamilyMembers");
		return "within 11am";
	}

	@Override
	public double goingTime() {
		System.out.println("Running going time in FamilyMembers");
		return 9.30;
	}

	@Override
	public int reachingTime() {
		System.out.println("Running reaching time in FamilyMembers");
		return 10;
	}

	@Override
	public double travellingTime() {
		System.out.println("Running Travelling Time in FamilyMembers in hours ");
		return 1;
	}

	@Override
	public String toString() {
		System.out.println("Running toString method in FamilyMembers");
		return "[GetUpTime :" + this.getTime() + "][TiffinTime :" + this.tiffinTime() + "PoojaTiming :"
				+ this.poojaTime() + "][GoingTime :" + this.goingTime() + "][ReachingTime :" + this.reachingTime()
				+ "][TravellingTime :" + this.travellingTime();
	}

}
