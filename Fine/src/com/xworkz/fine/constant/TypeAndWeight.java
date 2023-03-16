package com.xworkz.fine.constant;

public enum TypeAndWeight {
	EARPHON(2, "wireless"), NO_EAR(1, "wire"), OVER_EAR(1.2, "wireless");

	private final double weight;
	private final String type;

	private TypeAndWeight(double weight, String type) {
		this.weight = weight;
		this.type = type;
	}

	public double getWeight() {
		return weight;
	}

	public String getType() {
		return type;
	}
}
