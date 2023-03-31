package com.xworkz.fine.repository;

import com.xworkz.fine.dto.FestivalDTO;
import com.xworkz.fine.dto.WeaponDTO;
import com.xworkz.fine.exception.FestivalMemoryFullExcetion;

public class FestivalRepositoryImpl implements FestivalRepository{
	private FestivalDTO[] festival=new FestivalDTO[4];
	private  int index=0;
	
	
	@Override
	public boolean save(FestivalDTO dto) {
		System.out.println("Running save in FestivalRepositoryImpl" + dto);
		if(this.index<this.festival.length) {
			this.festival[this.index]=dto;
			System.out.println("dto saved at index :" + index + " " + dto);
			this.index++;
			return true;
		}
		else {
			System.err.println("memory is full,element can not be stored");
			throw new FestivalMemoryFullExcetion("Memory is full and cannot add festivals further");
		}
	}
	
	@Override
	public boolean isExist(FestivalDTO dto) {
		if(this.index==0) {
			System.out.println("first Element will not Checks");
			return false;
		}else {
			for(int i=0;i<this.index;i++) {
				System.out.println("first Element onwords checks");
				FestivalDTO tempDTO=this.festival[i];
				if(tempDTO.equals(dto)) {
					System.out.println("data is alredy exist :"+tempDTO);
					return true;
				}
			}
		}
		return FestivalRepository.super.isExist(dto);
	}
	@Override
	public int getTotalSaved() {
		
		return this.index;
		
	}
    
}
