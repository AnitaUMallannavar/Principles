package com.xworkz.fine.boot;

import java.time.LocalDate;

import com.xworkz.fine.constant.Sweet;
import com.xworkz.fine.dto.FestivalDTO;
import com.xworkz.fine.exception.InvalidFestivalException;
import com.xworkz.fine.repository.FestivalRepository;
import com.xworkz.fine.repository.FestivalRepositoryImpl;
import com.xworkz.fine.service.FestivalService;
import com.xworkz.fine.service.FestivalServiceImpl;

public class FestivalRunner {
	public static void main(String[] args) {
		FestivalDTO festivalDTO = new FestivalDTO(1234, "Ugadi", LocalDate.of(2023, 3, 24), LocalDate.of(2023, 3, 28),
				Sweet.NEEMJAGGERY, "Krishn");
		FestivalRepository festivalRepository=new FestivalRepositoryImpl();
		FestivalService festivalService=new FestivalServiceImpl(festivalRepository);
		
		FestivalDTO festivalDTO1 = new FestivalDTO(1234, "Diwali", LocalDate.of(2023, 3, 24), LocalDate.of(2023, 3, 28),
				Sweet.NEEMJAGGERY, "Krishn");

		FestivalService festivalService1=new FestivalServiceImpl(festivalRepository);
		
		
		FestivalDTO festivalDTO2 = new FestivalDTO(1234, "Ugadi", LocalDate.of(2023, 3, 24), LocalDate.of(2023, 3, 28),
				Sweet.NEEMJAGGERY, "Krishn");

		FestivalService festivalService2=new FestivalServiceImpl(festivalRepository);
		
		try {		
        boolean saved = festivalService.validateAndThenSave(festivalDTO);
        System.out.println("dto is saved :"+saved);
        
        System.out.println(" -----------");
        
     
        boolean saved1 = festivalService1.validateAndThenSave(festivalDTO1);
        System.out.println("dto is saved :"+saved1);
        
        System.out.println("===========");

        boolean saved2 = festivalService2.validateAndThenSave(festivalDTO2);
        System.out.println("dto is saved :"+saved2);
        

     }catch (InvalidFestivalException e) {
		System.out.println("InvalidFestivalException :" +e.getMessage());
	}
		System.out.println("Total saved is:"+festivalService2.getTotalSaved());
	}
}
