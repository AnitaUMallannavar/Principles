package com.xworkz.fine.boot;

import java.time.LocalDate;

import com.xworkz.fine.constant.Brand;
import com.xworkz.fine.constant.Color;
import com.xworkz.fine.constant.TypeAndWeight;
import com.xworkz.fine.dto.HeadPhoneDTO;
import com.xworkz.fine.repository.HeadPhoneRepository;
import com.xworkz.fine.repository.HeadPhoneRepositoryImpl;
import com.xworkz.fine.service.HeadPhoneImpl;
import com.xworkz.fine.service.HeadPhoneService;

public class HeadPhoneRunner {
	public static void main(String[] args) {

		HeadPhoneDTO headPhoneDTO = new HeadPhoneDTO(Brand.BOSE, "600", 800, true, Color.BLACK, TypeAndWeight.OVER_EAR,
				"Ambika", 6, LocalDate.now(), 4);
		HeadPhoneDTO headPhoneDTO2 = new HeadPhoneDTO(Brand.BOSE, "600", 800, true, Color.BLUE, TypeAndWeight.OVER_EAR,
				"Aniket", 4, LocalDate.now(), 4);
		HeadPhoneDTO headPhoneDTO3 = new HeadPhoneDTO(Brand.BOSE, "600", 840, true, Color.CHOCOLATE, TypeAndWeight.OVER_EAR,
				"Ambani", 6, LocalDate.now(), 4);
		HeadPhoneDTO headPhoneDTO4= new HeadPhoneDTO(Brand.BOSE, "600", 840, true, Color.CHOCOLATE, TypeAndWeight.OVER_EAR,
				"Ambani", 6, LocalDate.now(), 4);
		
		
		HeadPhoneRepository headPhoneRepository = new HeadPhoneRepositoryImpl();
		HeadPhoneService headPhoneService = new HeadPhoneImpl(headPhoneRepository);
		boolean bl = headPhoneService.validateAndThenSave(headPhoneDTO);
		System.out.println(bl);
		boolean bl2 = headPhoneService.validateAndThenSave(headPhoneDTO2);
		System.out.println(bl2);
		boolean bl3 = headPhoneService.validateAndThenSave(headPhoneDTO3);
		System.out.println(bl3);
		boolean bl4 = headPhoneService.validateAndThenSave(headPhoneDTO4);
		System.out.println(bl4);

	}
}
