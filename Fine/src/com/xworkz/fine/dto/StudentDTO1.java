package com.xworkz.fine.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class StudentDTO1 implements Serializable {
	private String name;
	private int age;
	private double weight;
	private LocalDate dOB;

	public StudentDTO1() {
		System.out.println("No args const of StudentDTO1");
	}

	public StudentDTO1(String name, int age, double weight, LocalDate dOB) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.dOB = dOB;
	}

	@Override
	public String toString() {
		return "StudentDTO1 [name=" + name + ", age=" + age + ", weight=" + weight + ", dOB=" + dOB + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, dOB, name, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof StudentDTO1)) {
			return false;
		}
		StudentDTO1 other = (StudentDTO1) obj;
		return age == other.age && Objects.equals(dOB, other.dOB) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public LocalDate getdOB() {
		return dOB;
	}

	public void setdOB(LocalDate dOB) {
		this.dOB = dOB;
	}

}
