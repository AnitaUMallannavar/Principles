package com.xworkz.fine.repository;

import com.xworkz.fine.dto.DesertDTO;

public interface DesertRepository {
	boolean save(DesertDTO dto);

	boolean isExist(DesertDTO dto);

	DesertDTO find(DesertDTO dto);

	DesertDTO findByName(String name);

	double fineAreaByName(String name);

	DesertDTO findByNameAndConutryAndArea(String name, String country, double area);

	int total();
}
