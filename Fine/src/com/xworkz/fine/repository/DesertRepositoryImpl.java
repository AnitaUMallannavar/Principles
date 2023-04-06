package com.xworkz.fine.repository;

import com.xworkz.fine.dto.DesertDTO;
import com.xworkz.fine.exception.DesertMemoryfullException;

public class DesertRepositoryImpl implements DesertRepository {
	private DesertDTO[] desertDTOs = new DesertDTO[23];
	private int desertIndex = 0;

	@Override
	public boolean save(DesertDTO dto) throws DesertMemoryfullException {
		System.out.println("Running save method inDesertRepositoryImpl" + dto);
		if (this.desertIndex < this.desertDTOs.length) {
			this.desertDTOs[this.desertIndex] = dto;
			System.out.println("dto is saved at the index :" + this.desertIndex + " " + dto);
			this.desertIndex++;
			return true;
		} else {
			System.out.println("Memory is full,cannot add more than 23 elements");
			throw new DesertMemoryfullException("Memory is full");
		}
	}

	@Override
	public boolean isExist(DesertDTO dto) {
		System.out.println("Running isExist method in DesertRepositoryImpl :");
		if (this.desertIndex == 0) {
			System.out.println("1st element will not checks");
			return false;
		} else {
			for (int index = 0; index < this.desertDTOs.length; index++) {
				DesertDTO ele = this.desertDTOs[index];
				if (ele != null && ele.equals(dto)) {
					System.out.println("Dto cannot be saved as it is dublicated ");
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public DesertDTO find(DesertDTO dto) {
		for (int index = 0; index < this.desertDTOs.length; index++) {
			DesertDTO ele = this.desertDTOs[index];
			if (ele.equals(dto)) {
				System.out.println("this dto is present:" + dto);
				return ele;
			}
		}
		return null;
	}

	@Override
	public DesertDTO findByName(String name) {
		for (int index = 0; index < this.desertDTOs.length; index++) {
			DesertDTO ele = this.desertDTOs[index];
			if (ele != null && ele.getName().equals(name)) {
				System.out.println("this name is present:" + name);
				return ele;
			}
		}
		return null;
	}

	@Override
	public double fineAreaByName(String name) {
	
		for (int index = 0; index < this.desertDTOs.length; index++) {
			DesertDTO ele = this.desertDTOs[index];
			if (ele != null && ele.getName().equals(name)) {
				System.out.println("this name is present :" + name);

				return ele.getArea();
			}
		}
		return 0;
	}

	@Override
	public DesertDTO findByNameAndConutryAndArea(String name, String country, double area) {
		for (int index = 0; index < this.desertDTOs.length; index++) {
			DesertDTO ele = this.desertDTOs[index];
			if (ele != null && ele.getName().equals(name) && ele.getCountry().equals(country)
					&& ele.getArea() == area) {
				System.out.println("this name is present :" + name + "[this country is present :" + country
						+ "[this area is present:" + area);
				return ele;
			}
		}
		return null;
	}

	@Override
	public int total() {
		return this.desertIndex;
	}

}
