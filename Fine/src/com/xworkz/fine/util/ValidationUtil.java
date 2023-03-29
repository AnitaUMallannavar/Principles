package com.xworkz.fine.util;

import java.time.LocalDate;

public class ValidationUtil {
      private ValidationUtil() {
		System.out.println("No args const of ValidationUtil");
	  }
      public static boolean validString(String value) {
    	  if(value!=null &&!value.isEmpty()&&value.length()>2&&value.length()<30) {
    		  return true;
    	  } 
    	  return false;
      }
      public static boolean validPrice(double cost) {
    	  if(cost>0&& cost<100000) {
    		  return true;
    	  }
    	  return false;
      }
      public static boolean validId(double id) {
    	  if(id>0&& id<100000) {
    		  return true;
    	  }
    	  return false;
      }
      public static boolean validNumber(int no) {
    	  if(no>0&&no<10) {
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
		return false;  
      }
      public static boolean validDate(LocalDate args,LocalDate pastDate) {
    	  LocalDate tomorrow=LocalDate.now().plusDays(1);
    	  if(args!=null && args.isBefore(tomorrow)&&args.isAfter(pastDate)) {
    		  return true;
    	  }
    	  return false;
      }
}
