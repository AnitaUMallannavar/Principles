package com.xworkz.fine.repository;

import com.xworkz.fine.dto.AddressDTO;

public interface AddressRepository {
	boolean save(AddressDTO dto);

	boolean isExist(AddressDTO dto);

	// boolean validateAndThenSave(AddressDTO dto);

	boolean find(AddressDTO dto);

	AddressDTO findByStreet(String street);

	AddressDTO findByNumber(int number);

	AddressDTO findBypincode(int pincode);

	AddressDTO findByStreetAndPincoadAndArea(String street, int pincode, String area);

	AddressDTO findByCityAndState(String city, String state);

	int total();

	int findPincodeByNumber(int number);

	String findCityByNumberAndFloorAndStreetAndPincode(int number, int floor, String street, int pincode);

	int findFloorByNumber(String number);

}
