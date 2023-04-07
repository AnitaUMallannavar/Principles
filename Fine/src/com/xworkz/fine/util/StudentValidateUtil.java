package com.xworkz.fine.util;

import java.time.LocalDate;

import com.xworkz.fine.dto.StudentDTO1;

public class StudentValidateUtil {
	private StudentValidateUtil() {
		System.out.println("No args const of StudentValidateUtil");
	}

	public static boolean validString(String name) {
		if (name != null && !name.isEmpty() && name.length() > 1 && name.length() < 30) {
			return true;
		}
		return false;
	}

	public static boolean validNum(double num) {
		if (num > 0) {
			return true;
		}
		return false;
	}

	public static boolean validAge(int age) {
		if (age > 0) {
			return true;
		}
		return false;
	}

	public static boolean validDate(LocalDate date) {
		LocalDate year = LocalDate.now();
		if (date != null && date.isAfter(year)) {
			return true;
		}
		return false;
	}

	public static boolean validFlag(boolean... flag) {
		for (int index = 0; index < flag.length; index++) {
			boolean exist = flag[index];
			if (!exist) {
				System.out.println("invalid element @index:" + index);
				return false;
			}
		}
		return true;
	}
}
