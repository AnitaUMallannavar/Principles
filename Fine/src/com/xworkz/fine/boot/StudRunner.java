package com.xworkz.fine.boot;

import java.time.LocalDate;

import com.xworkz.fine.dto.StudentDTO1;
import com.xworkz.fine.exception.InvalidStudentDataException;
import com.xworkz.fine.repository.StudentRepository1;
import com.xworkz.fine.repository.StudentRepositoryImpl1;
import com.xworkz.fine.service.StudentService1;
import com.xworkz.fine.service.StudentServiceImpl1;

public class StudRunner {
	public static void main(String[] args) {
		StudentDTO1 studentDTO1 = new StudentDTO1("Anita", 22, 38, LocalDate.of(2001, 9, 27));
		StudentRepository1 studentRepository1 = new StudentRepositoryImpl1();
		StudentService1 studentService1 = new StudentServiceImpl1(studentRepository1);

		StudentDTO1 studentDTO12 = new StudentDTO1("Ankita", 21, 39, LocalDate.of(2001, 9, 27));

		StudentDTO1 studentDTO13 = new StudentDTO1("Anika", 23, 40, LocalDate.of(2002, 9, 27));

		// StudentDTO1 studentDTO14 = new StudentDTO1("Anita", 22, 38,
		// LocalDate.of(2000, 9, 27));

		try {
			boolean save1 = studentService1.validateAndThenSave(studentDTO1);
			System.out.println(save1);

			System.out.println("=======");
			boolean save2 = studentService1.validateAndThenSave(studentDTO12);
			System.out.println(save2);

			System.out.println("===========");

			boolean save3 = studentService1.validateAndThenSave(studentDTO13);
			System.out.println(save3);

			System.out.println("===========");

			// boolean save4 = studentService1.validateAndThenSave(studentDTO14);
			// System.out.println(save4);

		} catch (InvalidStudentDataException e) {
			System.out.println("Invalied Student data" + e.getMessage());
		}
		System.out.println(studentService1.find(studentDTO1));
		System.out.println(studentService1.findAgeByName("Anita"));
		System.out.println(studentService1.findDOBByAge(22));
		System.out.println(studentService1.findNameByAge(22));
		System.out.println(studentService1.findWeightByName("nita"));
		System.out.println("Total saved elements are :" + studentService1.getTotal());
	}
}
