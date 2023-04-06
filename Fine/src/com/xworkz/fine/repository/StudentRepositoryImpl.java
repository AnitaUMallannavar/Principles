package com.xworkz.fine.repository;

import com.xworkz.fine.dto.StudentDTO;
import com.xworkz.fine.exception.StudentMemoryFullException;

public class StudentRepositoryImpl implements StudentRepository {
	private StudentDTO[] student = new StudentDTO[3];
	private int stdIndex = 0;

	@Override
	public boolean Save(StudentDTO dto) throws StudentMemoryFullException {
		System.out.println("Running save method in StudentRepositoryImpl");
		if (this.stdIndex < this.student.length) {
			this.student[this.stdIndex] = dto;
			System.out.println("dto is saved at index:" + this.stdIndex + " " + dto);
			this.stdIndex++;
			return true;
		} else {
			System.out.println("Memory is Full,cannot add more than 3 elements");
			throw new StudentMemoryFullException("Memory is Full");
		}
	}

	@Override
	public boolean isExist(StudentDTO dto) {
		System.out.println("Running isExist method in StudentRepositoryImpl");
		if (this.stdIndex == 0) {
			System.out.println("first element cannot be check");
			return false;
		}
		for (int index = 0; index < this.student.length; index++) {
			StudentDTO ele = this.student[index];
			if (ele != null && ele.equals(dto)) {
				System.out.println("Second element onwords check,if it is dublicated then it will not save");
				return true;
			}
		}
		return false;
	}

	@Override
	public int getTotal() {
		return this.stdIndex;
	}

	@Override
	public StudentDTO find(StudentDTO dto) {
		System.out.println("Running find method in StudentRepositoryImpl");
		for (int index = 0; index < this.student.length; index++) {
			StudentDTO ele = this.student[index];
			if (ele.equals(dto)) {
				System.out.println("this dto is present :" + dto);
				return ele;
			}
		}
		return null;
	}

	@Override
	public StudentDTO findNameById(double id) {
		System.out.println("Running findNameById in StudentRepositoryImpl");
		for (int index = 0; index < this.student.length; index++) {
			StudentDTO ele = this.student[index];
			if (ele.getId() == id) {
				System.out.println("This Id present :" + id);
				return ele;
			}
		}
		return null;
	}

	@Override
	public StudentDTO findAgeByName(String name) {
		System.out.println("Running findAgeByName in StudentRepositoryImpl");
		for (int index = 0; index < this.student.length; index++) {
			StudentDTO ele = this.student[index];
			if (ele.getName().equals(name)) {
				System.out.println("this name is present :" + name);
				return ele;
			}
		}
		return null;
	}

	@Override
	public StudentDTO findIdByName(String name) {
		System.out.println("Running findIdByName in StudentRepositoryImpl");
		for (int index = 0; index < this.student.length; index++) {
			StudentDTO ele = this.student[index];
			if (ele.getName().equals(name)) {
				System.out.println("this name is present :" + name);
				return ele;
			}
		}
		return null;
	}

	@Override
	public int findDOBByAge(int age) {
		System.out.println("Running findDOBByAge in StudentRepositoryImpl");
		for (int index = 0; index < this.student.length; index++) {
			StudentDTO ele = this.student[index];
			if (ele.getId() == age) {
				System.out.println("this age is present :" + age);
				return ele.getAge();
			}
		}
		return 0;
	}

}
