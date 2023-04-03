package com.xworkz.fine.repository;

import com.xworkz.fine.dto.AddressDTO;

public class AddressRepositoryImpl implements AddressRepository {
	private AddressDTO[] address = new AddressDTO[2];
	private int index = 0;

	@Override
	public boolean save(AddressDTO dto) {
		if (this.index < this.address.length) {
			this.address[index] = dto;
			System.out.println("index posion is:" + index);
			this.index++;
			return true;
		}
		return false;
	}

	@Override
	public boolean isExist(AddressDTO dto) {
		if (this.index == 0) {
			System.out.println("first element will not check");
			return false;
		} else {
			for (int index1 = 0; index1 < address.length; index1++) {
				AddressDTO dtoEle = this.address[index1];
				if (dtoEle.equals(dto)) {
					System.out.println("data will not save ,Bcz it is same as One of the existing data");
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean find(AddressDTO dto) {
		for(int index=0;index<this.address.length;index++) {
			AddressDTO ele=this.address[index];
			if(ele.equals(dto)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public AddressDTO findByStreet(String street) {
		for (int index2 = 0; index2 < this.address.length;) {
			AddressDTO ref = this.address[index2];
			if (ref.getStreet().equals(street)) {
				System.out.println("dot for Street:" + street);
				return ref;
			}
		}
		return null;
	}

	@Override
	public AddressDTO findByNumber(int number) {
		for (int index3 = 0; index3 < this.address.length; index3++) {
			AddressDTO ele = this.address[index3];
			//ele!=null &&
			if ( ele!=null && ele.getNumber().equals(number)) {
				System.out.println("dto for number:" + number);
				return ele;
			}
		}
		return null;
	}

	@Override
	public AddressDTO findBypincode(int pincode) {
		for (int index4 = 0; index4 < this.address.length; index4++) {
			AddressDTO ref2 = this.address[index4];
			if (ref2.getPincoad()==pincode) {
				System.out.println("dto for Pincode :" + pincode);
				return ref2;
			}
		}
		return null;
	}

	@Override
	public AddressDTO findByStreetAndPincoadAndArea(String street, int pincode, String area) {
		for (int index3 = 0; index3 < this.address.length; index3++) {
			AddressDTO ref3 = this.address[index3];
			if (ref3!=null && ref3.getStreet().equals(street) && ref3.getPincoad() == pincode && ref3.getArea().equals(area)) {
				System.out.println("dto for street :" + street + "dto for pincode :" + pincode + "dto for area :" + area);
				return ref3;
			}
		}
		return null;
	}

	@Override
	public AddressDTO findByCityAndState(String city, String state) {
		for (int index4 = 0; index4 < this.address.length; index4++) {
			AddressDTO ref4 = this.address[index4];
			if (ref4.getCity().equals(city) && ref4.getState().equals(state)) {
				System.out.println("dto for city :" + city + "dto for state :" + state);
				return ref4;
			}
		}
		return null;
	}

	@Override
	public int total() {
		return this.index;
	}

	@Override
	public int findFloorByNumber(String number) {
		for (int index5 = 0; index5 < this.address.length; index5++) {
			AddressDTO ref5 = this.address[index5];
			if (ref5!=null &&ref5.getNumber().equals(number)) {
				System.out.println("dto for number :" + number);
				int floor = ref5.getFloor();
				return floor;
			}
		}
		return 0;
	}

	@Override
	public int findPincodeByNumber(int number) {
		for (int index6 = 0; index6 < this.address.length; index6++) {
			AddressDTO ref6 = this.address[index6];
			if (ref6!=null && ref6.getPincoad() == number) {
				System.out.println("dto for number :" + number);
				int pincode = ref6.getPincoad();
				return pincode;
			}
		}
		return 0;
	}

	@Override
	public String findCityByNumberAndFloorAndStreetAndPincode(int number, int floor, String street, int pincode) {
		for (int index7 = 0; index7 < this.address.length; index7++) {
			AddressDTO ref7 = this.address[index7];
			if (ref7!=null &&ref7.getNumber().equals(number) && ref7.getFloor() == floor && ref7.getStreet().equals(street)
					&& ref7.getPincoad() == pincode) {
				System.out.println("dto for number :" + number + "dto for floor:" + floor + "dto for street :" + street
						+ "dto for pincode :" + pincode);
				String cityName = ref7.getCity();
				return cityName;
			}
			return null;
		}
		return null;
	}
}
