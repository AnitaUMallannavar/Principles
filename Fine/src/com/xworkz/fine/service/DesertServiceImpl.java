package com.xworkz.fine.service;

import com.xworkz.fine.dto.DesertDTO;
import com.xworkz.fine.exception.InvaliedDesertException;
import com.xworkz.fine.repository.DesertRepository;

import static com.xworkz.fine.util.EducationValidationUtil.*;

public class DesertServiceImpl implements DesertService {
	private DesertRepository desertRepository;

	public DesertServiceImpl(DesertRepository desertRepository) {
		this.desertRepository = desertRepository;
	}

	@Override
	public boolean validateAndThenSave(DesertDTO dto) throws InvaliedDesertException {
		System.out.println("Running ValidateAndThenSave in DesertServiceImpl:" + dto);
		if (dto != null) {
			System.out.println("dto is not null");

			int id = dto.getId();
			String name = dto.getName();
			String country = dto.getCountry();
			double area = dto.getArea();
			double minTemp = dto.getMinTemp();
			double maxTemp = dto.getMaxTemp();

			boolean validId = false;
			boolean validName = false;
			boolean validCountry = false;
			boolean validArea = false;
			boolean validMinTemp = false;
			boolean validMaxTemp = false;

			if (validString(name)) {
				System.out.println("valid name");
				validName = true;
			} else {
				System.err.println("invalid name");
			}
			if (validId(id)) {
				System.out.println("valid ID");
				validId = true;
			} else {
				System.err.println("invalid id");
			}
			if (validString(country)) {
				System.out.println("country is valid");
				validCountry = true;
			} else {
				System.err.println("invalid country");
			}
			if (validNumber(area)) {
				System.out.println("area is valid");
				validArea = true;
			} else {
				System.err.println("invalid area");
			}
			if (validNumber(minTemp)) {
				System.out.println("minTemp is valid");
				validMinTemp = true;
			} else {
				System.err.println("invalid minTemp");
			}
			if (validNumber(maxTemp)) {
				System.out.println("valid maxTemp");
				validMaxTemp = true;
			} else {
				System.err.println("invalid maxTemp");
			}
			if (validFlag(validId && validName && validCountry && validArea && validMinTemp && validMaxTemp)) {
				System.out.println("dto is valid & data is saved");
				boolean exist = this.desertRepository.isExist(dto);
				if (!exist) {
					boolean save = this.desertRepository.save(dto);
					return save;
				} else {
					System.err.println("dto is not valid");
				}

			} else {
				throw new InvaliedDesertException("invalied data");
			}
		} else {
			System.err.println("dto is null");
		}
		return false;
	}

	@Override
	public DesertDTO find(DesertDTO dto) {
		return null;
	}

	@Override
	public DesertDTO findByName(String name) {
		return this.desertRepository.findByName(name);
	}

	@Override
	public double fineAreaByName(String name) {
		return this.desertRepository.fineAreaByName(name);
	}

	@Override
	public DesertDTO findByNameAndConutryAndArea(String name, String country, double area) {
		return this.desertRepository.findByNameAndConutryAndArea(name, country, area);
	}

	@Override
	public int total() {
		return this.desertRepository.total();
	}

}
