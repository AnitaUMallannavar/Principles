package com.xworkz.fine.repository;

import com.xworkz.fine.dto.HeadPhoneDTO;

public class HeadPhoneRepositoryImpl implements HeadPhoneRepository {
	private HeadPhoneDTO[] head = new HeadPhoneDTO[5];
	private int index = 0;

	@Override
	public boolean save(HeadPhoneDTO dto) {
		System.out.println("Running save in HeadPhoneRepositoryImpl" + dto);
		if (index < head.length) {
			this.head[index] = dto;
			System.out.println("dto saved at index :" + index + " " + dto);
			this.index++;
			return true;
		} else {
			System.err.println("memory is full,element can not be stored");
		}
		return false;
	}

}
