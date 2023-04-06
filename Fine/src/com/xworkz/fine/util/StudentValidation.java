package com.xworkz.fine.util;

import java.time.LocalDate;

public class StudentValidation {
	private StudentValidation() {
		System.out.println("No args const of StudentValidation");
	}

	public static boolean validString(String name) {
		if (name != null && !name.isEmpty() && name.length() > 2 && name.length() < 30) {
			return true;
		}
		return false;
	}

	public static boolean validNumber(double num) {
		if (num > 0) {
			return true;
		}
		return false;
	}

	public static boolean validInt(int age) {
		if (age > 0) {
			return true;
		}
		return false;
	}

	public static boolean validDate(LocalDate date) {
		LocalDate year = LocalDate.of(2000, 3, 3);
		if (date != null && date.isBefore(year)) {
			return true;
		}
		return false;
	}

	public static boolean validFlag(boolean... flag) {
		for (int index = 0; index < flag.length; index++) {
			boolean ref = flag[index];
			if (!ref) {
				System.out.println("invalid element at index :" + index);
				return false;
			}
		}
		return true;
	}
}
