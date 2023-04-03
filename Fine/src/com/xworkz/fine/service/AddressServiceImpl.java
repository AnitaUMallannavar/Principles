package com.xworkz.fine.service;

import com.xworkz.fine.dto.AddressDTO;
import com.xworkz.fine.repository.AddressRepository;
import com.xworkz.fine.repository.SoftwereRepository;
import static com.xworkz.fine.util.AddressValidationUtil.*;

public class AddressServiceImpl implements AddressService {
	private AddressRepository addressRepository;

	public AddressServiceImpl(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}

	@Override
	public boolean validateAndThenSave(AddressDTO dto) {
		System.out.println("Running validationAndThenSave in AddressRepositoryimpl:" + dto);
		if (dto != null) {
			System.out.println("dto is not null");
			String street = dto.getStreet();
			String area = dto.getArea();
			int pincode = dto.getPincoad();
			int floor = dto.getFloor();
			String number = dto.getNumber();
			String city = dto.getCity();
			String state = dto.getState();

			boolean validStreet = false;
			boolean validArea = false;
			boolean validPincode = false;
			boolean validFloor = false;
			boolean validNumber = false;
			boolean validCity = false;
			boolean validState = false;

			if (validString(street)) {
				System.out.println("Street is valid");
				validStreet = true;
			} else {
				System.err.println("Street is invalid");
			}
			if (validString(area)) {
				System.out.println("Area is valid ");
				validArea = true;
			} else {
				System.err.println("Area is invalid");
			}
			if (validString(city)) {
				System.out.println("City is valid");
				validCity = true;
			} else {
				System.err.println("City is invalid");
			}
			if (validNumber(pincode)) {
				System.out.println("valid pincode");
				validPincode = true;
			} else {
				System.err.println("invalid pincode");
			}
			if (validNumber(floor)) {
				System.out.println("valid floor");
				validFloor = true;
			} else {
				System.err.println("invalid floor");
			}
			if (validString(state)) {
				System.out.println("valid state");
				validState = true;
			} else {
				System.err.println("invalid state");
			}

			if (validFlag(
					validStreet && validArea && validCity && validPincode && validFloor && validState && validNumber)) {
				System.out.println("valid dto");
				boolean exists = this.addressRepository.isExist(dto);
				if (!exists) {
					boolean saved = this.addressRepository.save(dto);
					return saved;
				}
			}
		} else {
			System.err.println("dto is null");
		}
		return false;
	}

	@Override
	public boolean find(AddressDTO dto) {
		return true;
	}

	@Override
	public AddressDTO findByStreet(String street) {
		return this.addressRepository.findByStreet(street);
	}

	@Override
	public AddressDTO findByNumber(int number) {
		return this.addressRepository.findByNumber(number);
	}

	@Override
	public AddressDTO findBypincode(int pincode) {
		return this.addressRepository.findBypincode(pincode);
	}

	@Override
	public AddressDTO findByStreetAndPincoadAndArea(String street, int pincode, String area) {
		return this.addressRepository.findByStreetAndPincoadAndArea(street, pincode, area);
	}

	@Override
	public AddressDTO findByCityAndState(String city, String state) {
		return this.addressRepository.findByCityAndState(city, state);
	}

	@Override
	public int total() {
		return this.addressRepository.total();
	}

	@Override
	public int findFloorByNumber(int number) {
		return this.addressRepository.findFloorByNumber(null);
	}

	@Override
	public int findPincodeByNumber(int number) {
		return this.addressRepository.findPincodeByNumber(number);
	}

	@Override
	public String findCityByNumberAndFloorAndStreetAndPincode(int number, int floor, String street, int pincode) {
		return this.addressRepository.findCityByNumberAndFloorAndStreetAndPincode(number, floor, street, pincode);
	}

}
