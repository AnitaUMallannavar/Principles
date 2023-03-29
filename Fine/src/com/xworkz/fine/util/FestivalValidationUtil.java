package com.xworkz.fine.util;

import java.time.LocalDate;

public class FestivalValidationUtil {
   
	private FestivalValidationUtil() {
		System.out.println("No args const of FestivalValidationUtil");
	}
	public static boolean validString(String name) {
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 30) {
			return true;
		}
		return false;
	}
	public static boolean validNumber(double id) {
		if(id>0) {
			return true;
		}
		return false;
	}
	public static boolean validDate(LocalDate start) {
		LocalDate thisYear=LocalDate.of(2023, 3, 3);
		if(start!=null && start.isAfter(thisYear)) {
			return true;
		}
		return false;
	}
	public static boolean validFlag(boolean... flags) {
  	  for(int index=0;index<flags.length;index++) {
  		  boolean element=flags[index];
  		  if(!element) {
  			  System.out.println("invalid element at index"+index);
  			  return false;
  		  }
  	  }
		return true;  
	
	}	
}
