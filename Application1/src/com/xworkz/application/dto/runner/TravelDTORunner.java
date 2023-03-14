package com.xworkz.application.dto.runner;

import java.time.LocalDateTime;

import com.xworkz.application.dto.TravelDTO;

public class TravelDTORunner {

	public static void main(String[] args) {
		TravelDTO travelDTO=new TravelDTO();
		travelDTO.setTravelName("Shubhangi");
		travelDTO.setFrom("Mudhol");
		travelDTO.setTo("Bengalore");
		travelDTO.setPrice(1200);
		travelDTO.setLocalDateTime(LocalDateTime.now());
		travelDTO.toString();
		travelDTO.equals(travelDTO);
		travelDTO.hashCode();
      System.out.println(travelDTO);
		
	}

}
