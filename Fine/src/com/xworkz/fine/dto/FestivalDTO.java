package com.xworkz.fine.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.xworkz.fine.constant.Sweet;

public class FestivalDTO implements Serializable {
	private double id;
	private String name;
	private LocalDate staetDate;
	private LocalDate endDate;
	private Sweet sweet;
	private String godName;

	public FestivalDTO() {
		System.out.println("No args const of FestivalDTO");
	}
	
	public FestivalDTO(double id, String name, LocalDate staetDate, LocalDate endDate,Sweet sweet, String godName) {
		super();
		this.id = id;
		this.name = name;
		this.staetDate = staetDate;
		this.endDate = endDate;
		this.sweet = sweet;
		this.godName = godName;
	}

	public void setSweet(Sweet sweet) {
		this.sweet = sweet;
	}

	@Override
	public String toString() {
		return "FestivalDTO [id=" + id + ", name=" + name + ", staetDate=" + staetDate + ", endDate=" + endDate
				+ ", sweet=" + sweet + ", godName=" + godName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((godName == null) ? 0 : godName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(id);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((staetDate == null) ? 0 : staetDate.hashCode());
		result = prime * result + ((sweet == null) ? 0 : sweet.hashCode());
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
		FestivalDTO other = (FestivalDTO) obj;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (godName == null) {
			if (other.godName != null)
				return false;
		} else if (!godName.equals(other.godName))
			return false;
		if (Double.doubleToLongBits(id) != Double.doubleToLongBits(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (staetDate == null) {
			if (other.staetDate != null)
				return false;
		} else if (!staetDate.equals(other.staetDate))
			return false;
		if (sweet != other.sweet)
			return false;
		return true;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getStaetDate() {
		return staetDate;
	}

	public void setStaetDate(LocalDate staetDate) {
		this.staetDate = staetDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Sweet getSweet() {
		return sweet;
	}

	public String getGodName() {
		return godName;
	}

	public void setGodName(String godName) {
		this.godName = godName;
	}
    
}
