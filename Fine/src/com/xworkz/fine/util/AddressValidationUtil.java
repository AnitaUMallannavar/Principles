package com.xworkz.fine.util;

public class AddressValidationUtil {
 
	public AddressValidationUtil() {
		System.out.println("No args const of AddressValidationUtil");
	}
	public static boolean validString(String name) {
		if(name!=null && !name.isEmpty() && name.length()>3 && name.length()<30) {
			return true;
		}
		return false;
	}
	public static boolean validNumber(int number) {
		if(number>0) {
			return true;
		}
		return false;
	}
	public static boolean validFlag(boolean... flags) {
		for(int index=0;index<flags.length;index++) {
			boolean element=flags[index];
			if(!element) {
				System.out.println("invalid element at index:"+index);
				return false;
			}
		}
		return true;
	}
	
}

