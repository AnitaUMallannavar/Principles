package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class AttendanceDTO implements Serializable{
     private String name;
     private int noOfDaysPresent;
     private int noOfDaysAbsent;
     private boolean regular;
     private LocalDate localDate;
     public AttendanceDTO() {
		System.out.println("No args const of Attendance");
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfDaysPresent() {
		return noOfDaysPresent;
	}
	public void setNoOfDaysPresent(int noOfDaysPresent) {
		this.noOfDaysPresent = noOfDaysPresent;
	}
	public int getNoOfDaysAbsent() {
		return noOfDaysAbsent;
	}
	public void setNoOfDaysAbsent(int noOfDaysAbsent) {
		this.noOfDaysAbsent = noOfDaysAbsent;
	}
	public boolean isRegular() {
		return regular;
	}
	public void setRegular(boolean regular) {
		this.regular = regular;
	}
	public LocalDate getLocalDate() {
		return localDate;
	}
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((localDate == null) ? 0 : localDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noOfDaysAbsent;
		result = prime * result + noOfDaysPresent;
		result = prime * result + (regular ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AttendanceDTO other = (AttendanceDTO) obj;
		if (localDate == null) {
			if (other.localDate != null)
				return false;
		} else if (!localDate.equals(other.localDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noOfDaysAbsent != other.noOfDaysAbsent)
			return false;
		if (noOfDaysPresent != other.noOfDaysPresent)
			return false;
		if (regular != other.regular)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AttendanceDTO [name=" + name + ", noOfDaysPresent=" + noOfDaysPresent + ", noOfDaysAbsent="
				+ noOfDaysAbsent + ", regular=" + regular + ", localDate=" + localDate + "]";
	}
     
     
}
