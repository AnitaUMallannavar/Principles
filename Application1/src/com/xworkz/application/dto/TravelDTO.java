package com.xworkz.application.dto;

import java.time.LocalDateTime;

public class TravelDTO {
     private String travelName;
     private String from;
     private String to;
     private double price;
     private LocalDateTime localDateTime;
     
     public TravelDTO() {
		System.out.println("NO ARGS CONST OF TravelDTO");
	 }

	@Override
	public String toString() {
		return "TravelDTO [travelName=" + travelName + ", from=" + from + ", to=" + to + ", price=" + price
				+ ", localDateTime=" + localDateTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + ((localDateTime == null) ? 0 : localDateTime.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((to == null) ? 0 : to.hashCode());
		result = prime * result + ((travelName == null) ? 0 : travelName.hashCode());
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
		TravelDTO other = (TravelDTO) obj;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (localDateTime == null) {
			if (other.localDateTime != null)
				return false;
		} else if (!localDateTime.equals(other.localDateTime))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (to == null) {
			if (other.to != null)
				return false;
		} else if (!to.equals(other.to))
			return false;
		if (travelName == null) {
			if (other.travelName != null)
				return false;
		} else if (!travelName.equals(other.travelName))
			return false;
		return true;
	}

	public String getTravelName() {
		return travelName;
	}

	public void setTravelName(String travelName) {
		this.travelName = travelName;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
     
     
     
}
