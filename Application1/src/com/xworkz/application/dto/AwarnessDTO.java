package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class AwarnessDTO implements Serializable{
    private String type;
    private int noOfPeople;
    private String onDay;
    private String location;
    private LocalDate loaDate;
    public AwarnessDTO() {
		System.out.println("No args const of AwarnessDTO");
	}
	@Override
	public String toString() {
		System.out.println("toString method Overriden in Awarness");
		return "AwarnessDTO [type=" + type + "][, noOfPeople=" + noOfPeople + "][, onDay=" + onDay + ",][ location="
				+ location + "][, loaDate=" + loaDate + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((loaDate == null) ? 0 : loaDate.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + noOfPeople;
		result = prime * result + ((onDay == null) ? 0 : onDay.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		AwarnessDTO other = (AwarnessDTO) obj;
		if (loaDate == null) {
			if (other.loaDate != null)
				return false;
		} else if (!loaDate.equals(other.loaDate))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (noOfPeople != other.noOfPeople)
			return false;
		if (onDay == null) {
			if (other.onDay != null)
				return false;
		} else if (!onDay.equals(other.onDay))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNoOfPeople() {
		return noOfPeople;
	}
	public void setNoOfPeople(int noOfPeople) {
		this.noOfPeople = noOfPeople;
	}
	public String getOnDay() {
		return onDay;
	}
	public void setOnDay(String onDay) {
		this.onDay = onDay;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public LocalDate getLoaDate() {
		return loaDate;
	}
	public void setLoaDate(LocalDate loaDate) {
		this.loaDate = loaDate;
	}
}
