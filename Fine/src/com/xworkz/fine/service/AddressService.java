package com.xworkz.fine.service;

import com.xworkz.fine.dto.AddressDTO;

public interface AddressService {
	boolean validateAndThenSave(AddressDTO dto);

	boolean find(AddressDTO dto);

	AddressDTO findByStreet(String street);

	AddressDTO findByNumber(int number);

	AddressDTO findBypincode(int pincode);

	AddressDTO findByStreetAndPincoadAndArea(String street, int pincode, String area);

	AddressDTO findByCityAndState(String city, String state);

	int total();

	int findFloorByNumber(int number);

	int findPincodeByNumber(int number);

	String findCityByNumberAndFloorAndStreetAndPincode(int number, int floor, String street, int pincode);

}
