package com.xworkz.fine.boot;

import java.time.LocalDate;

import com.xworkz.fine.dto.StudentDTO;
import com.xworkz.fine.exception.InvaliedStudentException;
import com.xworkz.fine.repository.StudentRepository;
import com.xworkz.fine.repository.StudentRepositoryImpl;
import com.xworkz.fine.service.StudentService;
import com.xworkz.fine.service.StudentServiceImpl;

public class StudentRunner {

	public static void main(String[] args) {
		StudentDTO studentDTO = new StudentDTO("Anil", LocalDate.of(1999, 1, 1), 22, 222.22);
		StudentRepository studentRepository = new StudentRepositoryImpl();
		StudentService studentService = new StudentServiceImpl(studentRepository);

		StudentDTO studentDTO2 = new StudentDTO("Aniket", LocalDate.of(1998, 2, 1), 24, 222.22);

		StudentDTO studentDTO3 = new StudentDTO("Anvita", LocalDate.of(1990, 3, 1), 26, 222.22);

		try {
			boolean save = studentService.validateAndThenSave(studentDTO);
			System.out.println(save);
			System.out.println("-----------");

			boolean save2 = studentService.validateAndThenSave(studentDTO2);
			System.out.println(save2);
			System.out.println("-----------");

			boolean save3 = studentService.validateAndThenSave(studentDTO3);
			System.out.println(save3);
		} catch (InvaliedStudentException e) {
			System.out.println("InvaliedStudentException:" + e.getMessage());
		}

		System.out.println(studentService.findDOBByAge(22));
		System.out.println(studentService.findAgeByName("Anil"));
		System.out.println(studentService.findIdByName("ashvi"));

		System.out.println("Total saved is:" + studentService.getTotal());

	}

}
