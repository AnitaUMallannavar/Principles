package com.xworkz.fine.service;

import java.time.LocalDate;
import static com.xworkz.fine.util.StudentValidateUtil.*;
import com.xworkz.fine.dto.StudentDTO1;
import com.xworkz.fine.exception.InvalidStudentDataException;
import com.xworkz.fine.repository.StudentRepository1;

public class StudentServiceImpl1 implements StudentService1 {
	private StudentRepository1 studentRepository1;

	public StudentServiceImpl1(StudentRepository1 studentRepository1) {
		this.studentRepository1 = studentRepository1;
	}

	@Override
	public boolean validateAndThenSave(StudentDTO1 dto) throws InvalidStudentDataException {
		System.out.println("Running validateAndThenSave method in StudentServiceImpl1");
		if (dto != null) {
			System.out.println("Dto is not null");

			String name = dto.getName();
			int age = dto.getAge();
			double weight = dto.getWeight();
			LocalDate dOB = dto.getdOB();
			boolean validName = false;
			boolean validAge = false;
			boolean validDOB = false;
			boolean validWeight = false;

			if (validString(name)) {
				System.out.println("name is valid");
				validName = true;
			} else {
				System.err.println("name is invalid");
			}
			if (validAge(age)) {
				System.out.println("age is valid");
				validAge = true;
			} else {
				System.err.println("invalid age");
			}
			if (validNum(weight)) {
				System.out.println("valid weight");
				validWeight = true;
			} else {
				System.err.println("invalid weight");
			}
			if (validDate(dOB)) {
				System.out.println("valid dOB");
				validDOB = true;
			} else {
				System.err.println("invalid DOB");
			}
			if (validFlag(validDOB && validWeight && validAge && validName)) {
				System.out.println("dto is valid & it can be saved");
				boolean exist = this.studentRepository1.isExist(dto);
				if (!exist) {
					boolean save = this.studentRepository1.saved(dto);
					return save;
				} else {
					System.err.println("dto is invalid");
				}
			} else {
				throw new InvalidStudentDataException("Invalied date");
			}
		} else {
			System.err.println("dto is null");
		}
		return false;
	}

	@Override
	public StudentDTO1 find(StudentDTO1 dto) {
		return this.studentRepository1.find(dto);
	}

	@Override
	public StudentDTO1 findNameByAge(int age) {
		// TODO Auto-generated method stub
		return this.studentRepository1.findNameByAge(age);
	}

	@Override
	public StudentDTO1 findAgeByName(String name) {
		// TODO Auto-generated method stub
		return this.studentRepository1.findAgeByName(name);
	}

	@Override
	public StudentDTO1 findWeightByName(String name) {
		// TODO Auto-generated method stub
		return this.studentRepository1.findWeightByName(name);
	}

	@Override
	public StudentDTO1 findDOBByAge(int age) {
		// TODO Auto-generated method stub
		return this.studentRepository1.findDOBByAge(age);
	}

	@Override
	public int getTotal() {
		// TODO Auto-generated method stub
		return this.studentRepository1.getTotal();
	}

}
