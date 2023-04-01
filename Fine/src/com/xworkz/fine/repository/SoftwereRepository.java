package com.xworkz.fine.repository;

import com.xworkz.fine.dto.SoftwereDTO;

public interface SoftwereRepository {
	boolean save(SoftwereDTO dto);

	boolean isExist(SoftwereDTO dto);

	int totalSaved();

	default SoftwereDTO findById(int id) {
		return null;

	}

	default SoftwereDTO findByName(String name) {
		return null;

	}

	default SoftwereDTO findByNameAndId(String name, int id) {
		return null;
	}

}
