package com.xworkz.fine.service;

import java.time.LocalDate;

import com.xworkz.fine.constant.Type;
import com.xworkz.fine.dto.WeaponDTO;
import com.xworkz.fine.repository.HeadPhoneRepository;
import com.xworkz.fine.repository.WeaponRepository;

public class WeaponServiceImpl implements WeaponService {
	private WeaponRepository weaponRepository;

	public WeaponServiceImpl(WeaponRepository weaponRepository) {
		this.weaponRepository=weaponRepository;
	}
	@Override
	public boolean validateAndThenSave(WeaponDTO dto) {
		System.out.println("Running validateAndThenSave in WeaponServiceImpl" + dto);
		if (dto != null) {
			System.out.println("dto is not null");
			int id = dto.getId();
			String name = dto.getName();
			Type type = dto.getType();
			double cost = dto.getCost();
			String material = dto.getMaterial();
			String madeBy = dto.getMadeBy();
			String manufacturedBy = dto.getManufacturedBy();
			String usedBy = dto.getUsedBy();
			String usedFor = dto.getUsedFor();
			double weight = dto.getWeight();
			LocalDate manifacturedYear = dto.getManufacturedYear();

			boolean validId = false;
			boolean validName = false;
			boolean validTtpe = false;
			boolean validCost = false;
			boolean validMaterial = false;
			boolean validMadeBy = false;
			boolean validManufacturedBy = false;
			boolean validUsedBy = false;
			boolean validUsedFor = false;
			boolean validWeight = false;
			boolean validManifacturedYear = false;

			if (id > 0) {
				System.out.println("valid Id");
				validId = true;
			} else {
				System.err.println("ivalid Id");
			}
			if (name != null && !name.isEmpty() && name.length() > 1 && name.length() < 30) {
				System.out.println("valid name");
				validName = true;
			} else {
				System.err.println("invalid name");
			}
			if (type != null) {
				System.out.println("valid Type");
				validCost = true;
			} else {
				System.err.println("invalid Type");
			}
			if (cost > 100 && cost < 10000000) {
				System.out.println("valid Cost");
				validCost = true;
			} else {
				System.err.println("invalid cost");
			}
			if (material != null && !material.isEmpty() && material.length() > 3 && material.length() < 30) {
				System.out.println("valid Material");
				validMaterial = true;
			} else {
				System.err.println("invalid Material");
			}
			if (madeBy != null && !madeBy.isEmpty() && madeBy.length() > 2 && madeBy.length() < 30) {
				System.out.println("valid MadeBy");
				validMadeBy = true;
			} else {
				System.err.println("invalid MadeBy");
			}
			if (manufacturedBy != null && !manufacturedBy.isEmpty() && manufacturedBy.length() > 3
					&& manufacturedBy.length() < 30) {
				System.out.println("valid ManufacturedBy");
				validManufacturedBy = true;
			} else {
				System.err.println("invalid ManufacturedBy");
			}
			if (usedBy != null && !usedBy.isEmpty() && usedBy.length() > 3 && usedBy.length() < 30) {
				System.out.println("valid UsedBy");
				validUsedBy = true;
			} else {
				System.err.println("invalid UsedBy");
			}
			if (usedFor != null && !usedFor.isEmpty() && usedFor.length() > 3 && usedFor.length() < 30) {
				System.out.println("valid UsedFor ");
				validUsedFor = true;
			} else {
				System.err.println("invalid UsedFor");
			}
			if (weight > 250 && weight < 1000) {
				System.out.println("valid Weight");
				validWeight = true;
			} else {
				System.err.println("invalid Weight");
			}
			LocalDate year = LocalDate.of(2000, 4, 12);
			if (manifacturedYear != null && manifacturedYear.isBefore(year)) {
				System.out.println("valid ManifacturedYear");
				validManifacturedYear = true;
			} else {
				System.err.println("invalid ManifacturedYear");
			}
			if (validId && validName && validTtpe && validCost && validMaterial && validMadeBy && validManufacturedBy
					&& validUsedBy && validUsedFor && validWeight && validManifacturedYear) {
				System.out.println("valid all");
				boolean saved = this.weaponRepository.save(dto);
				return saved;
			}

		} else {
			System.err.println("dto is null");
		}
		return true;
	}

}
