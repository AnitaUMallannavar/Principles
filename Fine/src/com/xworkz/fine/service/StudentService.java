package com.xworkz.fine.service;

import com.xworkz.fine.dto.StudentDTO;

public interface StudentService {
	boolean validateAndThenSave(StudentDTO dto);

	int getTotal();

	StudentDTO find(StudentDTO dto);

	StudentDTO findNameById(double id);

	StudentDTO findAgeByName(String name);

	StudentDTO findIdByName(String name);

	int findDOBByAge(int age);
}
