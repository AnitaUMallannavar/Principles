package com.xworkz.fine.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class StudentDTO implements Serializable{
     private String name;
     private LocalDate dob;
     private int age;
     private double id;
     
     public StudentDTO() {
		System.out.println("No args const of StudentDTO");
	}

	public StudentDTO(String name, LocalDate dob, int age, double id) {
		super();
		this.name = name;
		this.dob = dob;
		this.age = age;
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, dob, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof StudentDTO)) {
			return false;
		}
		StudentDTO other = (StudentDTO) obj;
		return age == other.age && Objects.equals(dob, other.dob)
				&& Double.doubleToLongBits(id) == Double.doubleToLongBits(other.id) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "StudentDTO [name=" + name + "[, dob=" + dob + "[, age=" + age + ",[ id=" + id + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}
     
}
