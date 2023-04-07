package com.xworkz.fine.boot;

import java.time.LocalDate;

import com.xworkz.fine.dto.MarraigeDTO;
import com.xworkz.fine.exception.InvalidDataException;
import com.xworkz.fine.repository.MarraigeRepository;
import com.xworkz.fine.repository.MarraigeRepositoryImpl;
import com.xworkz.fine.service.MarraigeService;
import com.xworkz.fine.service.MarraigeServoiceImpl;

public class MarraigeRunner {

	public static void main(String[] args) {
		MarraigeDTO marraigeDTO1 = new MarraigeDTO("Asha&Sateesh", 33, LocalDate.of(2025, 4, 9), "Jamakhandi",
				"LoveComArrenge");
		MarraigeRepository marraigeRepository = new MarraigeRepositoryImpl();
		MarraigeService marraigeService = new MarraigeServoiceImpl(marraigeRepository);

		MarraigeDTO marraigeDTO2 = new MarraigeDTO("Uaha&Manjunath", 32, LocalDate.of(2023, 10, 11), "Vijayapur",
				"Arrenge");
		// MarraigeDTO marraigeDTO3 = new MarraigeDTO("Savita&Mantesh", 32,
		// LocalDate.of(2023, 11, 8), "Vijayapur",

		// "Arrenge");
		try {
			boolean save = marraigeService.validateAndThenSave(marraigeDTO1);
			System.out.println(save);

			System.out.println("============");
			boolean save2 = marraigeService.validateAndThenSave(marraigeDTO2);
			System.out.println(save2);

			System.out.println("============");
			// boolean save3 = marraigeService.validateAndThenSave(marraigeDTO3);
			// System.out.println(save3);

			System.out.println("============");

		} catch (InvalidDataException e) {
			System.out.println("InvalidDataException :" + e.getMessage());
		}
		System.out.println("Total saved :" + marraigeService.getTotal());
		marraigeService.findAll();
	}
}