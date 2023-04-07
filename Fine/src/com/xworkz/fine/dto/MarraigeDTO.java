package com.xworkz.fine.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class MarraigeDTO implements Serializable {
	private String nameGAndB;
	private int age;
	private LocalDate mDate;
	private String place;
	private String mType;

	public MarraigeDTO() {
		System.out.println("No args const of MarraigeDTO");
	}

	public MarraigeDTO(String nameGAndB, int age, LocalDate mDate, String place, String mType) {
		super();
		this.nameGAndB = nameGAndB;
		this.age = age;
		this.mDate = mDate;
		this.place = place;
		this.mType = mType;
	}

	@Override
	public String toString() {
		return "MarraigeDTO [nameGAndB=" + nameGAndB + ", age=" + age + ", mDate=" + mDate + ", place=" + place
				+ ", type=" + mType + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, mDate, nameGAndB, place, mType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof MarraigeDTO)) {
			return false;
		}
		MarraigeDTO other = (MarraigeDTO) obj;
		return age == other.age && Objects.equals(mDate, other.mDate) && Objects.equals(nameGAndB, other.nameGAndB)
				&& Objects.equals(place, other.place) && Objects.equals(mType, other.mType);
	}

	public String getNameGAndB() {
		return nameGAndB;
	}

	public void setNameGAndB(String nameGAndB) {
		this.nameGAndB = nameGAndB;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getmDate() {
		return mDate;
	}

	public void setmDate(LocalDate mDate) {
		this.mDate = mDate;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getMType() {
		return mType;
	}

	public void setMType(String mType) {
		this.mType = mType;
	}

}
