package com.xworkz.fine.repository;

import com.xworkz.fine.dto.StudentDTO1;

public interface StudentRepository1 {
	boolean saved(StudentDTO1 dto);

	boolean isExist(StudentDTO1 dto);

	StudentDTO1 find(StudentDTO1 dto);

	StudentDTO1 findNameByAge(int age);

	StudentDTO1 findAgeByName(String name);

	StudentDTO1 findWeightByName(String name);

	StudentDTO1 findDOBByAge(int age);

	int getTotal();
}
