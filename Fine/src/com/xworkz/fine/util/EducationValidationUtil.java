package com.xworkz.fine.util;

import java.time.LocalDate;

public class EducationValidationUtil {

	private EducationValidationUtil() {
		System.out.println("No args const of EducationValidationUtil");
	}

	public static boolean validString(String name) {
		if (name != null && !name.isEmpty() && name.length() > 1 && name.length() < 30) {
			return true;
		}
		return false;
	}

	public static boolean validNumber(double persentage) {
		if (persentage > 0) {
			return true;
		}
		return false;
	}

	public static boolean validId(int id) {
		if (id > 0) {
			return true;
		}
		return false;
	}

	public static boolean validDate(LocalDate start) {
		LocalDate today = LocalDate.now();
		if (start != null && start.isAfter(today)) {
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
