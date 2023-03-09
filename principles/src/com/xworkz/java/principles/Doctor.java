package com.xworkz.java.principles;

public class Doctor implements HospitalRule {

	@Override
	public double opentime() {
		System.out.println("Running OpenTime in Doctor");
		return 7.30;
	}

	@Override
	public String doctorTiming() {
		System.out.println("Running Doctor Timing in Doctor");
		return "1:30";
	}

	@Override
	public int fileRate() {
		System.out.println("Running fileRate in Doctor");
		return 100;
	}

	@Override
	public String specialist() {
		System.out.println("Running specialist in Doctor");
		return "Manpohar";
	}

	@Override
	public double closingTime() {
		System.out.println("Running closingTime in Doctor");
		return 5.30;
	}

	@Override
	public String medisinType() {
		System.out.println("Running medisinType in Doctor");
		return "Ayurvedic";
	}

	@Override
	public String noOfFloors() {
		System.out.println("Running noOfFloors in Doctor");
		return "4";
	}

	@Override
	public String toString() {
		System.out.println("Running toString method in Doctor");
		return "[OpenTime :" + this.opentime() + "][DoctorTimimg :" + this.doctorTiming() + "][FileRate :" + this.fileRate()
				+ "][Specialist :" + this.specialist() + "][ClosingTime :" + this.closingTime() + "][MedisinType :"
				+ this.medisinType();
	}

}
