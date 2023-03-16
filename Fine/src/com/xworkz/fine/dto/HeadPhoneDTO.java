package com.xworkz.fine.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.xworkz.fine.constant.Brand;
import com.xworkz.fine.constant.Color;
import com.xworkz.fine.constant.TypeAndWeight;

public class HeadPhoneDTO implements Serializable{
      private Brand brand;
      private String modelNo;
      private double price;
      private boolean bass;
      private Color color;
      private TypeAndWeight typeAndWeight;
      private String customerName;
      private int invoiceNo;
      private LocalDate mfgDate;
      private int warrantyPeriod;
      
      public HeadPhoneDTO() {
    	  System.out.println("No args const of HeadPhone");
	  }

	public HeadPhoneDTO(Brand brand, String modelNo, double price, boolean bass, Color color,
			TypeAndWeight typeAndWeight, String customerName, int invoiceNo, LocalDate mfgDate, int warrantyPeriod) {
		super();
		this.brand = brand;
		this.modelNo = modelNo;
		this.price = price;
		this.bass = bass;
		this.color = color;
		this.typeAndWeight = typeAndWeight;
		this.customerName = customerName;
		this.invoiceNo = invoiceNo;
		this.mfgDate = mfgDate;
		this.warrantyPeriod = warrantyPeriod;
	}

	@Override
	public String toString() {
		return "HeadPhoneDTO [brand=" + brand + ", modelNo=" + modelNo + ", price=" + price + ", bass=" + bass
				+ ", color=" + color + ", typeAndWeight=" + typeAndWeight + ", customerName=" + customerName
				+ ", invoiceNo=" + invoiceNo + ", mfgDate=" + mfgDate + ", warrantyPeriod=" + warrantyPeriod + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (bass ? 1231 : 1237);
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + invoiceNo;
		result = prime * result + ((mfgDate == null) ? 0 : mfgDate.hashCode());
		result = prime * result + ((modelNo == null) ? 0 : modelNo.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((typeAndWeight == null) ? 0 : typeAndWeight.hashCode());
		result = prime * result + warrantyPeriod;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HeadPhoneDTO other = (HeadPhoneDTO) obj;
		if (bass != other.bass)
			return false;
		if (brand != other.brand)
			return false;
		if (color != other.color)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (invoiceNo != other.invoiceNo)
			return false;
		if (mfgDate == null) {
			if (other.mfgDate != null)
				return false;
		} else if (!mfgDate.equals(other.mfgDate))
			return false;
		if (modelNo == null) {
			if (other.modelNo != null)
				return false;
		} else if (!modelNo.equals(other.modelNo))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (typeAndWeight != other.typeAndWeight)
			return false;
		if (warrantyPeriod != other.warrantyPeriod)
			return false;
		return true;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isBass() {
		return bass;
	}

	public void setBass(boolean bass) {
		this.bass = bass;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public TypeAndWeight getTypeAndWeight() {
		return typeAndWeight;
	}

	public void setTypeAndWeight(TypeAndWeight typeAndWeight) {
		this.typeAndWeight = typeAndWeight;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public LocalDate getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(LocalDate mfgDate) {
		this.mfgDate = mfgDate;
	}

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}	
}
