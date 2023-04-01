package com.xworkz.fine.repository;

import com.xworkz.fine.dto.SoftwereDTO;

public class SoftwereRepositosyImpl implements SoftwereRepository {
	private SoftwereDTO software[] = new SoftwereDTO[3];
	private int softwareIndex = 0;

	@Override
	public boolean save(SoftwereDTO dto) {
		if (this.softwareIndex < this.software.length) {
			this.software[softwareIndex] = dto;
			System.out.println("Index position:" + softwareIndex);
			this.softwareIndex++;
			return true;
		}

		return false;
	}

	@Override
	public boolean isExist(SoftwereDTO dto) {
		if (this.softwareIndex == 0) {
			System.out.println("fist element will not check");
			return false;
		} else {
			for (int index = 0; index < this.softwareIndex; index++) {
				SoftwereDTO dtoElement = this.software[index];
				if (dtoElement.equals(dto)) {
					System.out.println("First member vl be saved");
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public int totalSaved() {

		return this.softwareIndex;
	}

	@Override
	public SoftwereDTO findById(int id) {
		for (int i = 0; i < this.software.length; i++) {
			SoftwereDTO ref = this.software[i];
			if (ref.getId() == id) {
				System.out.println("Dto for id:" + id);
				return ref;
			}
		}

		return null;
	}

	@Override
	public SoftwereDTO findByName(String name) {

		for (int index = 0; index < this.software.length; index++) {
			SoftwereDTO ref1 = this.software[index];
			if (ref1.getName().equals(name)) {
				System.out.println("Dto for name:" + name);
				return ref1;
			}
		}
		return null;
	}

	@Override
	public SoftwereDTO findByNameAndId(String name, int id) {
		for (int index = 0; index < this.software.length; index++) {
			SoftwereDTO ref2 = this.software[index];
			if (ref2.getName().equals(name) && ref2.getId() == id) {
				System.out.println("Dto for name& Id:" + name);
				return ref2;
			}
		}
		return null;
	}
}
