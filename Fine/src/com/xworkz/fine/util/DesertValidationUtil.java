package com.xworkz.fine.util;

import com.xworkz.fine.dto.DesertDTO;

public class DesertValidationUtil {

	public DesertValidationUtil() {
		System.out.println("No args const of DesertValidationUtil");
	}

	public static boolean validString(String name) {
		if (name != null && !name.isEmpty() && name.length() > 1 && name.length() < 30) {
			return true;
		}
		return false;
	}

	public static boolean validNumber(double num) {
		if (num < 0) {
			return true;
		}
		return false;
	}

	public static boolean validId(int id) {
		if (id < 0) {
			return true;
		}
		return false;
	}

	public static boolean validFlag(boolean... flag) {
		for (int index = 0; index < flag.length; index++) {
			boolean ele = flag[index];
			if (!ele) {
				System.out.println("invalid element at index:" + index);
				return false;
			}
		}

		return true;
	}

}
