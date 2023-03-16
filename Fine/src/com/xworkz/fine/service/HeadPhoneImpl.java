package com.xworkz.fine.service;

import java.time.LocalDate;
import com.xworkz.fine.constant.Brand;
import com.xworkz.fine.constant.Color;
import com.xworkz.fine.constant.TypeAndWeight;
import com.xworkz.fine.dto.HeadPhoneDTO;
import com.xworkz.fine.util.ValidationUtil;
import static com.xworkz.fine.util.ValidationUtil.*;

public class HeadPhoneImpl implements HeadPhoneService {

	@Override
	public boolean validateAndThenSave(HeadPhoneDTO dto) {
		System.out.println("Running validteAndThenSave in HeadPhoneImpl" + dto);
		if (dto != null) {
			System.out.println("dto is not null");
			Brand brand = dto.getBrand();
			String modelNo = dto.getModelNo();
			double price = dto.getPrice();
			boolean bass = dto.isBass();
			Color color = dto.getColor();
			TypeAndWeight tyepAndWeight = dto.getTypeAndWeight();
			String customerName = dto.getCustomerName();
			int invoiceNo = dto.getInvoiceNo();
			int warrantyPeriod = dto.getWarrantyPeriod();
			LocalDate mgfDate = dto.getMfgDate();

			boolean validBrand = false;
			boolean validModelNo = false;
			boolean validPrice = false;
			boolean validBass = false;
			boolean validColor = false;
			boolean validTypeAndWeight = false;
			boolean validCustomerName = false;
			boolean validInvoiceNo = false;
			boolean validWarrantyPeriod = false;
			boolean validMgfDate = false;

			if (brand != null) {
				System.out.println("valid Brand");
				validBrand = true;
			} else {
				System.err.println("invalid Brand");
			}
			if (validString(modelNo)) {
				System.out.println("valid modelNo");
				validModelNo = true;
			} else {
				System.err.println("invalid modelNo");
			}
			if (validPrice(price)) {
				System.out.println("valid price");
				validPrice = true;
			} else {
				System.err.println("invalid price");
			}
			if (validString(customerName)) {
				System.out.println("valid CustomerName");
				validCustomerName = true;
			} else {
				System.err.println("invalid CustomerName");
			}
			if (validNumber(invoiceNo)) {
				System.out.println("valid InvoiceNo");
				validInvoiceNo = true;
			} else {
				System.err.println("invalid InvoiceNo");
			}
			if (validNumber(warrantyPeriod)) {
				System.out.println("valid WarrantyPeriod");
				validWarrantyPeriod = true;
			} else {
				System.err.println("invalid WarrantyPeriod");
			}
			if (validBass) {
				System.out.println("valid bass");
				validBass = true;
			} else {
				System.err.println("invalid bass");
			}
			if (color != null) {
				System.out.println("valid color");
				validColor = true;
			} else {
				System.err.println("invalid color");
			}
			if (tyepAndWeight != null) {
				System.out.println("valid TyepAndWeight");
				validTypeAndWeight = true;
			} else {
				System.err.println("invalid TyepAndWeight");
			}
			if (validDate(mgfDate, LocalDate.of(2001, 4, 3))) {
				System.out.println("valid mgfdate");
				validMgfDate = true;
			} else {
				System.err.println("invalid mgfDate");
			}
			if (validFlag(validBrand, validModelNo, validPrice, validCustomerName, validInvoiceNo, validWarrantyPeriod,
					validBass, validColor, validTypeAndWeight, validMgfDate)) {
				System.out.println("valid dto");
			} else {
				System.err.println("invalid dto");
			}

		} else {
			System.err.println("dto is null");
		}
		return true;
	}

}
