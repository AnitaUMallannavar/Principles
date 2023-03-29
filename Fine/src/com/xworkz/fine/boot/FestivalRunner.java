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
     try {
    	 
		FestivalDTO festivalDTO = new FestivalDTO(1234, "Ugadi", LocalDate.of(2023, 3, 24), LocalDate.of(2023, 3, 28),
				Sweet.NEEMJAGGERY, "Krishn");
		FestivalRepository festivalRepository=new FestivalRepositoryImpl();
		FestivalService festivalService=new FestivalServiceImpl(festivalRepository);
        boolean saved = festivalService.validateAndThenSave(festivalDTO);
        System.out.println("dto is saved :"+saved);
        
        System.out.println(" -----------");
        
        FestivalDTO festivalDTO1 = new FestivalDTO(123, "Sankranti", LocalDate.of(2023, 3, 24), LocalDate.of(2023, 3, 28),
				Sweet.NEEMJAGGERY, "Laxmi");
		FestivalService festivalService1=new FestivalServiceImpl(festivalRepository);
        boolean saved1 = festivalService1.validateAndThenSave(festivalDTO1);
        System.out.println("dto is saved :"+saved1);
        
        System.out.println("===========");
        FestivalDTO festivalDTO2 = new FestivalDTO(1234, "Ugadi", LocalDate.of(2023, 3, 24), LocalDate.of(2023, 3, 28),
				Sweet.NEEMJAGGERY, "Krishn");
		FestivalService festivalService2=new FestivalServiceImpl(festivalRepository);
        boolean saved2 = festivalService2.validateAndThenSave(festivalDTO2);
        System.out.println("dto is saved :"+saved2);
        
//        System.out.println("------------");
//        FestivalDTO festivalDTO3 = new FestivalDTO(1234, "Ugadi", LocalDate.of(2023, 3, 24), LocalDate.of(2023, 3, 28),
//				Sweet.NEEMJAGGERY, "Krishn");
//        FestivalRepository festivalRepository3=new FestivalRepositoryImpl();
//		FestivalService festivalService3=new FestivalServiceImpl(festivalRepository3);
//        boolean saved3 = festivalService3.validateAndThenSave(festivalDTO3);
//        System.out.println("dto is saved :"+saved3);
//        
//        System.out.println("-------------");
//        FestivalDTO festivalDTO4 = new FestivalDTO(1234, "Ugadi", LocalDate.of(2023, 3, 24), LocalDate.of(2023, 3, 28),
//				Sweet.NEEMJAGGERY, "Krishn");
//        FestivalRepository festivalRepository4=new FestivalRepositoryImpl();
//		FestivalService festivalService4=new FestivalServiceImpl(festivalRepository4);
//        boolean saved4 = festivalService4.validateAndThenSave(festivalDTO4);
//        System.out.println("dto is saved :"+saved4);
//        
//        System.out.println("-----------");
//        FestivalDTO festivalDTO5 = new FestivalDTO(1234, "Ugadi", LocalDate.of(2023, 3, 24), LocalDate.of(2023, 3, 28),
//				Sweet.NEEMJAGGERY, "Krishn");
//        FestivalRepository festivalRepository5=new FestivalRepositoryImpl();
//		FestivalService festivalService5=new FestivalServiceImpl(festivalRepository5);
//        boolean saved5 = festivalService5.validateAndThenSave(festivalDTO5);
//        System.out.println("dto is saved :"+saved5);
     }catch (InvalidFestivalException e) {
		System.out.println("InvalidFestivalException :" +e.getMessage());
	}
	}
}
