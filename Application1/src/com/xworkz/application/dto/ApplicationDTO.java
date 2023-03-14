package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class ApplicationDTO implements Serializable{
     private String name;
     private String createdBy;
     private double createsIn;
     private LocalDate localDate;
     private double version;
     public ApplicationDTO() {
		System.out.println("No args const of ApplicationDTO");
	}
	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", createdBy=" + createdBy + ", createsIn=" + createsIn + ", localDate="
				+ localDate + ", version=" + version + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		long temp;
		temp = Double.doubleToLongBits(createsIn);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((localDate == null) ? 0 : localDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(version);
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
		ApplicationDTO other = (ApplicationDTO) obj;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (Double.doubleToLongBits(createsIn) != Double.doubleToLongBits(other.createsIn))
			return false;
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
		if (Double.doubleToLongBits(version) != Double.doubleToLongBits(other.version))
			return false;
		return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public double getCreatesIn() {
		return createsIn;
	}
	public void setCreatesIn(double createsIn) {
		this.createsIn = createsIn;
	}
	public LocalDate getLocalDate() {
		return localDate;
	}
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
     
}
