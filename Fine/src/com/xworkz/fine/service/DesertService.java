package com.xworkz.fine.service;

import com.xworkz.fine.dto.DesertDTO;

public interface DesertService {
	boolean validateAndThenSave(DesertDTO dto);

	DesertDTO find(DesertDTO dto);

	DesertDTO findByName(String name);

	double fineAreaByName(String name);

	DesertDTO findByNameAndConutryAndArea(String name, String country, double area);

	int total();
}
