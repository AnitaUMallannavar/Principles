package com.xworkz.fine.service;

import java.time.LocalDate;

import com.xworkz.fine.dto.MarraigeDTO;
import com.xworkz.fine.exception.InvalidDataException;
import com.xworkz.fine.repository.MarraigeRepository;
import static com.xworkz.fine.util.StudentValidateUtil.*;
 
public class MarraigeServoiceImpl implements MarraigeService {
	private MarraigeRepository marraigeRepository;

	public MarraigeServoiceImpl(MarraigeRepository marraigeRepository) {
		this.marraigeRepository = marraigeRepository;
	}

	@Override
	public boolean validateAndThenSave(MarraigeDTO dto) throws InvalidDataException {
		System.out.println("Running validateAndThenSave method in MarraigeServiceImpl=" + dto);
		if (dto != null) {
			System.out.println("Dto is not null");
			 
			String nameGAndB = dto.getNameGAndB();
			int age = dto.getAge();
			LocalDate mDate = dto.getmDate();
			String place = dto.getPlace();
			String mType = dto.getMType();

			boolean validNameGAndB = false;
			boolean validAge = false;
			boolean validMDate = false;
			boolean validPlace = false;
			boolean validMType = false;

			if (validString(nameGAndB)) {
				System.out.println("both names are valid");
				validNameGAndB = true;
			} else {
				System.err.println("invalid names");
			}
			if (validString(place)) {
				System.out.println("valid place");
				validPlace = true;
			} else {
				System.err.println("invalid place");
			}
			if (validString(mType)) {
				System.out.println("MType is valid");
				validMType = true;
			} else {
				System.err.println("invalid MType");
			}
			if (validDate(mDate)) {
				System.out.println("Marraige date valid");
				validMDate = true;
			} else {
				System.err.println("invalid Marraige Date");
			}
			if (validAge(age)) {
				System.out.println("age is valid");
				validAge = true;
			} else {
				System.err.println("invalid age");
			}
			if (validFlag(validNameGAndB && validAge && validMDate && validPlace && validMType)) {
				System.out.println("dto is valid & it can be saved");
				boolean exist = marraigeRepository.isExist(dto);
				if (!exist) {
					boolean save = marraigeRepository.save(dto);
					return save;
				} else {
					System.err.println("dto is not saved");
				}

			} else {
				throw new InvalidDataException("InvalidDataExeption");
			}
		} else {
			System.err.println("dto is null");
		}
		return false;
	}

	@Override
	public int getTotal() {

		return this.marraigeRepository.getTotal();
	}

	@Override
	public MarraigeDTO find(MarraigeDTO dto) {

		return this.marraigeRepository.find(dto);
	}

	@Override
	public MarraigeDTO findByNameGAndB(String name) {
		if (validString(name)) {

			return this.marraigeRepository.findByNameGAndB(name);
		}
		return null;
	}

	@Override
	public MarraigeDTO ageFindByNameGAndBAndMdate(String name, LocalDate mDate) {
		if (validString(name) && validDate(mDate)) {
			return this.marraigeRepository.ageFindByNameGAndBAndMdate(name, mDate);
		}
		return null;
	}

	@Override
	public MarraigeDTO[] findAll() {
		MarraigeDTO[] own = new MarraigeDTO[3];
		MarraigeDTO[] old = this.marraigeRepository.findAll();
		int i = 0;
		if (i < old.length) {
			for (int j = 0; j < old.length; j++) {
				if (old[j] != null) {
					own[i] = old[j];
					System.out.println(own[i]);
					i++;
				}
			}
		}
		return own;
	}
	
	
	@Override
	public MarraigeDTO findByAgeOrNameGAndBOrmTypeOrPlace(int age, String name, String mType, String palce) {
		if (validString(name) && validAge(age) && validString(mType) && validString(palce)) {
			return this.findByAgeOrNameGAndBOrmTypeOrPlace(age, name, mType, palce);
		}
		return null;
	} 
}
