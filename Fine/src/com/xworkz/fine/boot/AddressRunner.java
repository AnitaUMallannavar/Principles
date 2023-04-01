package com.xworkz.fine.boot;

import com.xworkz.fine.dto.AddressDTO;
import com.xworkz.fine.repository.AddressRepository;
import com.xworkz.fine.repository.AddressRepositoryImpl;
import com.xworkz.fine.service.AddressService;
import com.xworkz.fine.service.AddressServiceImpl;

public class AddressRunner {
	public static void main(String[] args) {
		AddressDTO addressDTO = new AddressDTO("Bhashyam circle", "Magadi Road", 1232, 2, "121", "Tumkur", "Karnataka");
		AddressRepository addressRepository = new AddressRepositoryImpl();
		AddressService addressService = new AddressServiceImpl(addressRepository);
		boolean saved = addressService.validateAndThenSave(addressDTO);
		System.out.println(saved);
		
		System.out.println("=========");
		AddressDTO addressDTO2 = new AddressDTO("Bhashyam circle", "Magadi Road", 1232, 2, "121", "Tumkur", "Karnataka");
	//	AddressRepository addressRepository = new AddressRepositoryImpl();
		AddressService addressService2 = new AddressServiceImpl(addressRepository);
		boolean saved2 = addressService.validateAndThenSave(addressDTO2);
		System.out.println(saved2);
		
		System.out.println("=========");
		AddressDTO addressDTO3 = new AddressDTO("AnandReo circle", "Magadi Road", 32, 2, "121", "Bengalor", "Karnataka");
	//	AddressRepository addressRepository = new AddressRepositoryImpl();
		AddressService addressService3= new AddressServiceImpl(addressRepository);
		boolean saved3= addressService.validateAndThenSave(addressDTO3);
		System.out.println(saved3);
	}
}
