package com.xworkz.application.dto.runner;

import java.util.Locale;

import com.xworkz.application.dto.MarketDTO;

public class MarketDTORunner {

	public static void main(String[] args) {
		MarketDTO marketDTO=new MarketDTO();
		marketDTO.setName("FruitMarket");
		marketDTO.setLocation("Navanagar");
		marketDTO.setStartedFrom("Abhinav");
		marketDTO.setStartedIn(2004);
		marketDTO.toString();
		marketDTO.setLocale(Locale.getDefault());
        marketDTO.equals(marketDTO);
        System.out.println(marketDTO);
	}

}
