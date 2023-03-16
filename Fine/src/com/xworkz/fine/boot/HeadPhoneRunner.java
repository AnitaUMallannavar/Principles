package com.xworkz.fine.boot;

import java.time.LocalDate;

import com.xworkz.fine.constant.Brand;
import com.xworkz.fine.constant.Color;
import com.xworkz.fine.constant.TypeAndWeight;
import com.xworkz.fine.dto.HeadPhoneDTO;
import com.xworkz.fine.service.HeadPhoneImpl;
import com.xworkz.fine.service.HeadPhoneService;

public class HeadPhoneRunner {
	public static void main(String[] args) {

		HeadPhoneDTO headPhoneDTO = new HeadPhoneDTO(Brand.BOAT, "2345", 60, true, Color.BLACK, TypeAndWeight.EARPHON,
				"Akshata", 65, LocalDate.now().plusDays(1), 23);
		HeadPhoneService headPhoneService = new HeadPhoneImpl();
		boolean bl = headPhoneService.validateAndThenSave(headPhoneDTO);
		System.out.println(bl);
	}
}
