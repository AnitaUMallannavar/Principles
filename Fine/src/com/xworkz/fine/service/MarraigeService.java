package com.xworkz.fine.service;

import java.time.LocalDate;

import com.xworkz.fine.dto.MarraigeDTO;

public interface MarraigeService {
	boolean validateAndThenSave(MarraigeDTO dto);

	int getTotal();

	MarraigeDTO find(MarraigeDTO dto);

	MarraigeDTO findByNameGAndB(String name);

	MarraigeDTO ageFindByNameGAndBAndMdate(String name, LocalDate mDate);

	MarraigeDTO[] findAll();

	MarraigeDTO findByAgeOrNameGAndBOrmTypeOrPlace(int age, String name, String mType, String palce);

}
