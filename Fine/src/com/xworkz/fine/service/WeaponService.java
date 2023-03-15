package com.xworkz.fine.service;

import com.xworkz.fine.dto.WeaponDTO;

public interface WeaponService {
        boolean validateAndThenSave(WeaponDTO dto);
}
