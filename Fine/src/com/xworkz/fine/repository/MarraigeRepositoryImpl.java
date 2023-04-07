package com.xworkz.fine.repository;

import java.time.LocalDate;

import com.xworkz.fine.dto.MarraigeDTO;
import com.xworkz.fine.exception.MemoryFullException;

public class MarraigeRepositoryImpl implements MarraigeRepository {
	private MarraigeDTO[] marraige = new MarraigeDTO[3];
	private int index = 0;

	@Override
	public boolean save(MarraigeDTO dto) throws MemoryFullException {
		System.out.println("Running save method in MarraigeRepositoryImpl");
		if (this.index < this.marraige.length) {
			this.marraige[this.index] = dto;
			System.out.println("dto is saved @index :" + index);
			this.index++;
			return true;
		} else {
			System.err.println("Cannot add more than 3 elements");
			throw new MemoryFullException("Memory is full,limitation for dto elements is only 3 ");
		}
	}

	@Override
	public boolean isExist(MarraigeDTO dto) {
		System.out.println("Running isExist method in MarraigeRepositoryImpl");
		if (this.index == 0) {
			System.out.println("first element will not chacks");
			return false;
		}
		for (int index = 0; index < this.marraige.length; index++) {
			MarraigeDTO ele = this.marraige[index];
			if (ele != null && ele.equals(dto)) {
				System.out.println("second elements omwords compars,if it is dublicated then element will not save");
				return true;
			}
		}
		return false;
	}

	@Override
	public int getTotal() {

		return this.index;
	}

	@Override
	public MarraigeDTO find(MarraigeDTO dto) {
		System.out.println("Running find method in MarraigeRepositoryImpl");
		for (int index = 0; index < this.marraige.length; index++) {
			MarraigeDTO ele = this.marraige[index];
			if (ele != null && ele.equals(dto)) {
				System.out.println("this method is present :" + dto);
				return ele;
			}
		}
		return null;
	}

	@Override
	public MarraigeDTO findByNameGAndB(String name) {
		System.out.println("Running findByNameBoth  method in MarraigeRepositoryImpl");
		for (int index = 0; index < this.marraige.length; index++) {
			MarraigeDTO ele = this.marraige[index];
			if (ele != null && ele.getNameGAndB().equals(name)) {
				System.out.println("this name is present :" + name);
				return ele;
			}
		}
		return null;
	}

	@Override
	public MarraigeDTO ageFindByNameGAndBAndMdate(String name, LocalDate mDate) {
		System.out.println("Running ageFindByNameBothAndMdate method in MarraigeRepositoryImpl");
		for (int index = 0; index < this.marraige.length; index++) {
			MarraigeDTO ele = this.marraige[index];
			if (ele != null && ele.getNameGAndB().equals(name) && ele.getmDate().equals(mDate)) {
				System.out.println("Name & MDate are present ");
				return ele;
			}
		}
		return null;
	}

	@Override
	public MarraigeDTO[] findAll() {
		if (index != 0) {
			return marraige;
		}
		return null;
	}

	@Override
	public MarraigeDTO findByAgeOrNameGAndBOrmTypeOrPlace(int age, String name, String mType, String palce) {
		System.out.println("Running findByAgeOrNameGAndBOrmTypeOrPlace method in findByAgeOrNameGAndBOrmTypeOrPlace");
		for (int index = 0; index < this.marraige.length; index++) {
			MarraigeDTO ele = this.marraige[index];
			if (ele != null && ele.getNameGAndB().equals(name) && ele.getAge() == age && ele.getMType().equals(mType)
					&& ele.getPlace().equals(palce)) {
				System.out.println("these all are present");
				return ele;
			}
		}
		return null;
	}

}
