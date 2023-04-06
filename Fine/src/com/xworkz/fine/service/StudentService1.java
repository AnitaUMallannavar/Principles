package com.xworkz.fine.service;

import com.xworkz.fine.dto.StudentDTO1;

public interface StudentService1 {
	boolean validateAndThenSave(StudentDTO1 dto);

	StudentDTO1 find(StudentDTO1 dto);

	StudentDTO1 findNameByAge(int age);

	StudentDTO1 findAgeByName(String name);

	StudentDTO1 findWeightByName(String name);

	StudentDTO1 findDOBByAge(int age);

	int getTotal();
}
