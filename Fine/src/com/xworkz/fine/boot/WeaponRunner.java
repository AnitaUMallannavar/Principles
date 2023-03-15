package com.xworkz.fine.boot;

import java.time.LocalDate;

import com.xworkz.fine.constant.Type;
import com.xworkz.fine.dto.WeaponDTO;
import com.xworkz.fine.service.WeaponService;
import com.xworkz.fine.service.WeaponServiceImpl;

public class WeaponRunner {

	public static void main(String[] args) {
		WeaponDTO weaponDTO = new WeaponDTO(420, "Glock", Type.GUN, 430, "Fiber", "Akshata", "Shubhangi",
				LocalDate.of(2000, 3, 21), "Anita", "ToKill", 243);
		WeaponService weaponService = new WeaponServiceImpl();
		boolean save = weaponService.validateAndThenSave(weaponDTO);
		System.out.println("Save:" + save);

	}
}
