package com.xworkz.fine.repository;

import com.xworkz.fine.dto.StudentDTO1;
import com.xworkz.fine.exception.StudentMemoryFullException1;

public class StudentRepositoryImpl1 implements StudentRepository1 {

	private StudentDTO1[] student1 = new StudentDTO1[3];
	private int index = 0;

	@Override
	public boolean saved(StudentDTO1 dto) throws StudentMemoryFullException1 {
		System.out.println("Running Saved method in StudentRepositoryImpl1");
		if (this.index < this.student1.length) {
			this.student1[this.index] = dto;
			System.out.println("dto is saved at index :" + index);
			this.index++;
			return true;
		} else {
			System.err.println("Memory is full ,cannot add more than 3 elements");
			throw new StudentMemoryFullException1("Memory is loded");
		}
	}

	@Override
	public boolean isExist(StudentDTO1 dto) {
		System.out.println("Running isExist method in StudentRepositoryImpl1");
		if (this.index == 0) {
			System.out.println("first element will not checks");
			return false;
		}
		for (int index = 0; index < this.student1.length; index++) {
			StudentDTO1 ele = this.student1[index];
			if (ele != null && ele.equals(dto)) {
				System.out.println("Second Elements omwords checks,if it doblicated then it will not saved");
				return true;
			}
		}
		return false;
	}

	@Override
	public StudentDTO1 find(StudentDTO1 dto) {
		System.out.println("Running find method in StudentRepositoryImpl1");
		for (int index = 0; index < this.student1.length; index++) {
			StudentDTO1 ele = this.student1[index];
			if (ele != null && ele.equals(dto)) {
				System.out.println("this dto is present" + dto);
				return ele;
			}
		}
		return null;
	}

	@Override
	public StudentDTO1 findNameByAge(int age) {
		for (int index = 0; index < this.student1.length; index++) {
			StudentDTO1 ele = this.student1[index];
			if (ele != null && ele.getAge() == age) {
				System.out.println("this age is present :" + age);
				return ele;
			}
		}
		return null;
	}

	@Override
	public StudentDTO1 findAgeByName(String name) {
		System.out.println("Running findAgeByName in StudentRepositoryImpl1");
		for (int index = 0; index < this.student1.length; index++) {
			StudentDTO1 ele = this.student1[index];
			if (ele != null && ele.getName().equals(name)) {
				System.out.println("this name is present :" + name);
				return ele;
			}
		}
		return null;
	}

	@Override
	public StudentDTO1 findWeightByName(String name) {
		System.out.println("Running findWeightByName in StudentRepositoryImpl1");
		for (int index = 0; index < this.student1.length; index++) {
			StudentDTO1 ele = this.student1[index];
			if (ele != null && ele.getName().equals(name)) {
				System.out.println("this name is present :" + name);
				return ele;
			}
		}
		return null;
	}

	@Override
	public StudentDTO1 findDOBByAge(int age) {
		System.out.println("Running findDOBByAge in StudentRepositoryImpl1");
		for (int index = 0; index < this.student1.length; index++) {
			StudentDTO1 ele = this.student1[index];
			if (ele != null && ele.getAge() == age) {
				System.out.println("this age is present :" + age);
				return ele;
			}
		}
		return null;
	}

	@Override
	public int getTotal() {
		return this.index;
	}

}
