package com.xworkz.application.dto.runner;

import java.time.LocalDate;

import com.xworkz.application.Application1ServiceDtoImpts;
import com.xworkz.application.constant.LangUsed;
import com.xworkz.application.constant.OsTypeSupported;
import com.xworkz.application.constant.Type;
import com.xworkz.application.dto.Application1DTO;
import com.xworkz.application.dto.Application1Service;
import com.xworkz.application.dto.ApplicationDTO;

public class ApplicationDTORunner {

	public static void main(String[] args) {
		ApplicationDTO applicationDTO = new ApplicationDTO();
		applicationDTO.setName("Whatsapp");
		applicationDTO.setCreatedBy("Jan Koum");
		applicationDTO.setCreatesIn(2009);
		applicationDTO.setVersion(2.23);
		applicationDTO.setLocalDate(LocalDate.of(2009, 9, 27));
		System.out.println(applicationDTO);

		Application1DTO application1DTO = new Application1DTO();
		application1DTO.setName("Instagram");
		application1DTO.setVersion(2.3);
		application1DTO.setCreatedDate(LocalDate.now().plusDays(1));
		application1DTO.setSize(104);
		application1DTO.setDevelopedBy("Mansik");
		application1DTO.setType(Type.GAMINGAPPLICATIUON);
		application1DTO.setPrice(123);
		application1DTO.setFirstVersionLeasedDate(LocalDate.now().plusDays(2));
		application1DTO.setTrialDays(LocalDate.now());
		application1DTO.setLanguage(LangUsed.KANNADA);
		application1DTO.setMinProcessorSpeed(45);
		application1DTO.setMinRamSpaceRequired(54);
		application1DTO.setIternetNeeded(true);
		application1DTO.setAgeLimit(65);
		application1DTO.setNoOfDownloads(64);
		application1DTO.setRating(102);
		application1DTO.setOsTypeSupported(OsTypeSupported.MICROSOFTWINDOWS);

		Application1Service application1Service = new Application1ServiceDtoImpts();
		boolean bl=application1Service.validateAndThenSave(application1DTO);

		System.out.println(bl);
	}

}
