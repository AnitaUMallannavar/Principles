package com.xworkz.fine.repository;

import java.time.LocalDate;

import com.xworkz.fine.dto.MarraigeDTO;

public interface MarraigeRepository {
	boolean save(MarraigeDTO dto);

	boolean isExist(MarraigeDTO dto);

	int getTotal();

	MarraigeDTO find(MarraigeDTO dto);

	MarraigeDTO findByNameGAndB(String name);

	MarraigeDTO ageFindByNameGAndBAndMdate(String name, LocalDate mDate);

	MarraigeDTO[] findAll();

	MarraigeDTO findByAgeOrNameGAndBOrmTypeOrPlace(int age, String name, String mType, String palce);
}
