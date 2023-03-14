package com.xworkz.application.dto;

import java.util.Locale;

public class MarketDTO {
     private String name;
     private String location;
     private double startedIn;
     private String startedFrom;
     private Locale locale;
     public MarketDTO() {
		System.out.println("No args const of MarketDTO");
	}
     
     
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((locale == null) ? 0 : locale.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((startedFrom == null) ? 0 : startedFrom.hashCode());
		long temp;
		temp = Double.doubleToLongBits(startedIn);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		MarketDTO other = (MarketDTO) obj;
		if (locale == null) {
			if (other.locale != null)
				return false;
		} else if (!locale.equals(other.locale))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (startedFrom == null) {
			if (other.startedFrom != null)
				return false;
		} else if (!startedFrom.equals(other.startedFrom))
			return false;
		if (Double.doubleToLongBits(startedIn) != Double.doubleToLongBits(other.startedIn))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "MarketDTO [name=" + name + ", location=" + location + ", startedIn=" + startedIn + ", startedFrom="
				+ startedFrom + ", locale=" + locale + "]";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getStartedIn() {
		return startedIn;
	}
	public void setStartedIn(double startedIn) {
		this.startedIn = startedIn;
	}
	public String getStartedFrom() {
		return startedFrom;
	}
	public void setStartedFrom(String startedFrom) {
		this.startedFrom = startedFrom;
	}
	public Locale getLocale() {
		return locale;
	}
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
     
}
