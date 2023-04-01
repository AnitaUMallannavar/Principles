package com.xworkz.fine.dto;

import java.io.Serializable;
import java.util.Objects;

public class AddressDTO implements Serializable {

	private String street;
	private String area;
	private int pincoad;
	private int floor;
	private String number;
	private String city;
	private String state;

	public AddressDTO() {
		System.out.println("No args const of Address");
	}

	public AddressDTO(String street, String area, int pincoad, int floor, String number, String city, String state) {
		super();
		this.street = street;
		this.area = area;
		this.pincoad = pincoad;
		this.floor = floor;
		this.number = number;
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "AddressDTO [street=" + street + ", area=" + area + ", pincoad=" + pincoad + ", floor=" + floor
				+ ", number=" + number + ", city=" + city + ", state=" + state + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, city, floor, number, pincoad, state, street);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof AddressDTO)) {
			return false;
		}
		AddressDTO other = (AddressDTO) obj;
		return Objects.equals(area, other.area) && Objects.equals(city, other.city) && floor == other.floor
				&& Objects.equals(number, other.number) && pincoad == other.pincoad
				&& Objects.equals(state, other.state) && Objects.equals(street, other.street);
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPincoad() {
		return pincoad;
	}

	public void setPincoad(int pincoad) {
		this.pincoad = pincoad;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
