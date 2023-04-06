package com.xworkz.fine.repository;

import com.xworkz.fine.dto.StudentDTO;

public interface StudentRepository {
	boolean Save(StudentDTO dto);

	boolean isExist(StudentDTO dto);

	int getTotal();

	StudentDTO find(StudentDTO dto);

	StudentDTO findNameById(double id);

	StudentDTO findAgeByName(String name);

	StudentDTO findIdByName(String name);

	int findDOBByAge(int age);
}
