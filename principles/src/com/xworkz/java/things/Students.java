package com.xworkz.java.things;

public class Students implements ExamRule{
     private String duration;
     
     public Students() {
		System.out.println("No args const of Student");
	}
	@Override
	public String holticket(String duration) {
		this.duration=duration;
		System.out.println("Running holticket in Students");
		if(this.duration!=null&&this.duration.equals("3 Hours")) {
			System.out.println("Duratipon is 3 Hours");
			return "3 Hours";
		}else {
			System.out.println("Duration is not 3 Hours");
		}
		return null;
	}

	@Override
	public String id(double time) {
		
		System.out.println("Running time in Students");
		if(time!=0&&time==2) {
			System.out.println("Timing is 2 Hours");
			return "2 Hours";
		}else {
			System.out.println("Timing is not 2 Hours");
		}
		return null;
	}

}
