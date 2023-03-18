package com.xworkz.fine.repository;

import com.xworkz.fine.dto.WeaponDTO;

public class WeaponRepositoryImpl implements WeaponRepository{
	private WeaponDTO[] weapon=new WeaponDTO[4];
	private  int index=0;
	
	@Override
	public boolean save(WeaponDTO dto) {
		System.out.println("Running save in HeadPhoneRepositoryImpl" + dto);
		if (index < weapon.length) {
			this.weapon[index] = dto;
			System.out.println("dto saved at index :" + index + " " + dto);
			this.index++;
			return true;
		} else {
			System.err.println("memory is full,element can not be stored");
		}
		return false;
	}

}
