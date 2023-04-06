package com.xworkz.fine.service;

import java.time.LocalDate;

import com.xworkz.fine.dto.StudentDTO;
import com.xworkz.fine.exception.InvaliedStudentException;
import com.xworkz.fine.repository.StudentRepository;
import static com.xworkz.fine.util.StudentValidation.*;

public class StudentServiceImpl implements StudentService {
	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public boolean validateAndThenSave(StudentDTO dto) throws InvaliedStudentException {
		System.out.println("Running validateAndThenSave in StudentServiceImpl :" + dto);
		if (dto != null) {
			System.out.println("dto is not null");

			/*
			 * String name; private LocalDate dob; private int age; private double id;
			 */

			String name = dto.getName();
			LocalDate dob = dto.getDob();
			int age = dto.getAge();
			double id = dto.getId();

			boolean validName = false;
			boolean validDOB = false;
			boolean validAge = false;
			boolean validId = false;

			if (validString(name)) {
				System.out.println("name is valid");
				validName = true;
			} else {
				System.err.println("name is invalid");
			}
			if (validNumber(id)) {
				System.out.println("valid id");
				validId = true;
			} else {
				System.err.println("invalid id");
			}
			if (validInt(age)) {
				System.out.println("age is valid");
				validAge = true;
			} else {
				System.err.println("invalid age");
			}
			if (validDate(dob)) {
				System.out.println("dob is valid");
				validDOB = true;
			} else {
				System.err.println("invalid DOB");
			}

			if (validFlag(validName && validId && validAge && validDOB)) {
				System.out.println("dto is valid & it will save");
				boolean exist = this.studentRepository.isExist(dto);
				if (!exist) {
					boolean saved = this.studentRepository.Save(dto);
					return saved;
				} else {
					System.err.println("dto is invalid");
				}

			} else {
				throw new InvaliedStudentException("InvaliedStudent DTO");
			}
		} else {
			System.err.println("dto is null");
		}

		return false;
	}

	@Override
	public int getTotal() {
		return this.studentRepository.getTotal();
	}

	@Override
	public StudentDTO find(StudentDTO dto) {
		return this.studentRepository.find(dto);
	}

	@Override
	public StudentDTO findNameById(double id) {
		return this.studentRepository.findNameById(id);
	}

	@Override
	public StudentDTO findAgeByName(String name) {
		return this.studentRepository.findAgeByName(name);
	}

	@Override
	public StudentDTO findIdByName(String name) {
		return this.studentRepository.findIdByName(name);
	}

	@Override
	public int findDOBByAge(int age) {
		return this.studentRepository.findDOBByAge(age);
	}

}
