package com.xworkz.fine.service;

import com.xworkz.fine.dto.FestivalDTO;
import com.xworkz.fine.exception.InvalidFestivalException;

public interface FestivalService {
     boolean validateAndThenSave(FestivalDTO dto)throws InvalidFestivalException;
}
