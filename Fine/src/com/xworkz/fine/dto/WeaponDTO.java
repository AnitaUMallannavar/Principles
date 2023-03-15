package com.xworkz.fine.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.xworkz.fine.constant.Type;

public class WeaponDTO implements Serializable{
     private int id;
     private String name;
     private Type type;
     private double cost;
     private String material;
     private String madeBy;
     private String manufacturedBy;
     private LocalDate manufacturedYear;
     private String usedBy;
     private String usedFor;
     private double weight;
     
     public WeaponDTO() {
		System.out.println("No args const of Weapon");
	}

	public WeaponDTO(int id, String name, Type type, double cost, String material, String madeBy, String manufacturedBy,
			LocalDate manufacturedYear, String usedBy, String usedFor, double weight) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.material = material;
		this.madeBy = madeBy;
		this.manufacturedBy = manufacturedBy;
		this.manufacturedYear = manufacturedYear;
		this.usedBy = usedBy;
		this.usedFor = usedFor;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "WeaponDTO [id=" + id + ", name=" + name + ", type=" + type + ", cost=" + cost + ", material=" + material
				+ ", madeBy=" + madeBy + ", manufacturedBy=" + manufacturedBy + ", manufacturedYear=" + manufacturedYear
				+ ", usedBy=" + usedBy + ", usedFor=" + usedFor + ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((madeBy == null) ? 0 : madeBy.hashCode());
		result = prime * result + ((manufacturedBy == null) ? 0 : manufacturedBy.hashCode());
		result = prime * result + ((manufacturedYear == null) ? 0 : manufacturedYear.hashCode());
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((usedBy == null) ? 0 : usedBy.hashCode());
		result = prime * result + ((usedFor == null) ? 0 : usedFor.hashCode());
		temp = Double.doubleToLongBits(weight);
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
		WeaponDTO other = (WeaponDTO) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (id != other.id)
			return false;
		if (madeBy == null) {
			if (other.madeBy != null)
				return false;
		} else if (!madeBy.equals(other.madeBy))
			return false;
		if (manufacturedBy == null) {
			if (other.manufacturedBy != null)
				return false;
		} else if (!manufacturedBy.equals(other.manufacturedBy))
			return false;
		if (manufacturedYear == null) {
			if (other.manufacturedYear != null)
				return false;
		} else if (!manufacturedYear.equals(other.manufacturedYear))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type != other.type)
			return false;
		if (usedBy == null) {
			if (other.usedBy != null)
				return false;
		} else if (!usedBy.equals(other.usedBy))
			return false;
		if (usedFor == null) {
			if (other.usedFor != null)
				return false;
		} else if (!usedFor.equals(other.usedFor))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public String getManufacturedBy() {
		return manufacturedBy;
	}

	public void setManufacturedBy(String manufacturedBy) {
		this.manufacturedBy = manufacturedBy;
	}

	public LocalDate getManufacturedYear() {
		return manufacturedYear;
	}

	public void setManufacturedYear(LocalDate manufacturedYear) {
		this.manufacturedYear = manufacturedYear;
	}

	public String getUsedBy() {
		return usedBy;
	}

	public void setUsedBy(String usedBy) {
		this.usedBy = usedBy;
	}

	public String getUsedFor() {
		return usedFor;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	
     
}
