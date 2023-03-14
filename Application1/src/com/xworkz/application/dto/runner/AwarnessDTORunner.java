package com.xworkz.application.dto.runner;

import java.time.LocalDate;

import com.xworkz.application.dto.AwarnessDTO;

public class AwarnessDTORunner {

	public static void main(String[] args) {
		AwarnessDTO awarnessDTO=new AwarnessDTO();
		awarnessDTO.setType("Awar of public");
		awarnessDTO.setLocation("Bengalor City");
		awarnessDTO.setNoOfPeople(2);
		awarnessDTO.setOnDay("EveryDay");
		awarnessDTO.toString();
		awarnessDTO.setLoaDate(LocalDate.now());
		System.out.println(awarnessDTO);
	}
}
