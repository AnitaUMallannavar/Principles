package com.xworkz.fine.repository;

import com.xworkz.fine.dto.FestivalDTO;

public interface FestivalRepository {
     boolean save(FestivalDTO dto);
     default boolean isExist(FestivalDTO dto) {
    	 return false;
     }
     
     default int getTotalSaved() {
    	 return 0;
     }
}
