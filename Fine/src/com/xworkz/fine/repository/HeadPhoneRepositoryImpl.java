package com.xworkz.fine.repository;

import com.xworkz.fine.dto.HeadPhoneDTO;

public class HeadPhoneRepositoryImpl implements HeadPhoneRepository{
    private HeadPhoneDTO[] head=new HeadPhoneDTO[5];
    private int index=0;
 
	@Override
	public boolean save(HeadPhoneDTO dto) {
		System.out.println("Running save in HeadPhoneRepositoryImpl"+dto);
		if(index<head.length) {
			this.head[index]=dto;
		}
		return false;
	}

}
