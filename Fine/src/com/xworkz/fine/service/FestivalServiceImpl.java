package com.xworkz.fine.service;

import java.time.LocalDate;

import com.xworkz.fine.constant.Sweet;
import com.xworkz.fine.dto.FestivalDTO;
import com.xworkz.fine.exception.InvalidFestivalException;
import com.xworkz.fine.repository.FestivalRepository;
import static com.xworkz.fine.util.FestivalValidationUtil.*;

public class FestivalServiceImpl implements FestivalService {
	private FestivalRepository festivalRepository;

	public FestivalServiceImpl(FestivalRepository festivalRepository) {
		this.festivalRepository = festivalRepository;
	}

	@Override
	public boolean validateAndThenSave(FestivalDTO dto) throws InvalidFestivalException {
		System.out.println("Running validateAndThenSave in FestuvalServiceImpl" + dto);
		if (dto != null) {
			System.out.println("dto is not null");
			double id = dto.getId();
			String name = dto.getName();
			LocalDate staetDate = dto.getStaetDate();
			LocalDate endDate = dto.getEndDate();
			Sweet sweet = dto.getSweet();
			String godName = dto.getGodName();

			boolean validId = false;
			boolean validName = false;
			boolean validStaetDate = false;
			boolean validEndDate = false;
			boolean validSweet = false;
			boolean validGodName = false;

			if (validNumber(id)) {
				System.out.println("valid Id");
				validId = true;
			} else {
				System.err.println("ivalid Id");
			}
			if (validString(name)) {
				System.out.println("valid name");
				validName = true;
			} else {
				System.err.println("invalid name");
			}
			if (sweet != null) {
				System.out.println("valid Sweet");
				validSweet = true;
			} else {
				System.err.println("invalid Sweet");
			}
			if (validString(godName)) {
				System.out.println("valid GodName");
				validGodName = true;
			} else {
				System.err.println("invalid GodName");
			}
			if (validDate(staetDate)) {
				System.out.println("StartDate is valid");
				validStaetDate = true;
			} else {
				System.err.println("StartDate is invalid");
			}
			if (validDate(endDate) && endDate.isAfter(staetDate)) {
				System.out.println("endDate is valid");
				validEndDate = true;
			} else {
				System.err.println("endDate is Invalid");
			}
			if (validFlag(validId && validName && validStaetDate && validEndDate && validSweet && validGodName)) {
				System.out.println("dto is valid & can be save");
				boolean saved = this.festivalRepository.save(dto);
				return saved;
			} else {
				throw new InvalidFestivalException("data is invalid");
			}

		} else {
			System.err.println("dto is null");
		}
		return false;
	}
}