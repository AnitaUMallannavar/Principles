package com.xworkz.application.dto.runner;

import java.time.LocalDate;

import com.xworkz.application.dto.ApplicationDTO;

public class ApplicationDTORunner {

	public static void main(String[] args) {
		ApplicationDTO applicationDTO=new ApplicationDTO();
		applicationDTO.setName("Whatsapp");
		applicationDTO.setCreatedBy("Jan Koum");
		applicationDTO.setCreatesIn(2009);
		applicationDTO.setVersion(2.23);
		applicationDTO.setLocalDate(LocalDate.of(2009, 9, 27));
        System.out.println(applicationDTO);
	}

}
