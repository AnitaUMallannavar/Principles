package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.xworkz.application.constant.LangUsed;
import com.xworkz.application.constant.OsTypeSupported;
import com.xworkz.application.constant.Type;

public class Application1DTO implements Serializable{
    private String name;
    private double version;
    private LocalDate createdDate;
    private double size;
    private String developedBy;
    private Type type;
    private int price;
    private LocalDate firstVersionLeasedDate;
    private LocalDate currentVersionReleaseDate;
    private LocalDate nextVersionReleaseDate;
    private LocalDate trialDays;
    private LangUsed language;
    private int minProcessorSpeed;
    private double minRamSpaceRequired;
    private boolean iternetNeeded;
    private int ageLimit;
    private int noOfDownloads;
    private int rating;
    private OsTypeSupported osTypeSupported;
    
    @Override
	public String toString() {
		return "Application1DTO [name=" + name + ", version=" + version + ", localDate=" + createdDate+ ", size=" + size
				+ ", developedBy=" + developedBy + ", type="+type + ", price=" + price + ", firstVersionLeasedDate="
				+ firstVersionLeasedDate + ", currentVersionReleaseDate=" + currentVersionReleaseDate
				+ ", nextVersionReleaseDate=" + nextVersionReleaseDate + ", trialDays=" + trialDays + ", language="
				+ language + ", minProcessorSpeed=" + minProcessorSpeed + ", minRamSpaceRequired=" + minRamSpaceRequired
				+ ", iternetNeeded=" + iternetNeeded + ", ageLimit=" + ageLimit + ", noOfDownloads=" + noOfDownloads
				+ ", rating=" + rating + ", osTypeSupported=" + osTypeSupported + "]";
	}

	public Application1DTO() {
		System.out.println("No args const of Application1DTO");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ageLimit;
		result = prime * result + ((currentVersionReleaseDate == null) ? 0 : currentVersionReleaseDate.hashCode());
		result = prime * result + ((developedBy == null) ? 0 : developedBy.hashCode());
		result = prime * result + ((firstVersionLeasedDate == null) ? 0 : firstVersionLeasedDate.hashCode());
		result = prime * result + (iternetNeeded ? 1231 : 1237);
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + minProcessorSpeed;
		long temp;
		temp = Double.doubleToLongBits(minRamSpaceRequired);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nextVersionReleaseDate == null) ? 0 : nextVersionReleaseDate.hashCode());
		result = prime * result + noOfDownloads;
		result = prime * result + ((osTypeSupported == null) ? 0 : osTypeSupported.hashCode());
		result = prime * result + price;
		result = prime * result + rating;
		temp = Double.doubleToLongBits(size);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((trialDays == null) ? 0 : trialDays.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		temp = Double.doubleToLongBits(version);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Application1DTO other = (Application1DTO) obj;
		if (ageLimit != other.ageLimit)
			return false;
		if (currentVersionReleaseDate == null) {
			if (other.currentVersionReleaseDate != null)
				return false;
		} else if (!currentVersionReleaseDate.equals(other.currentVersionReleaseDate))
			return false;
		if (developedBy == null) {
			if (other.developedBy != null)
				return false;
		} else if (!developedBy.equals(other.developedBy))
			return false;
		if (firstVersionLeasedDate == null) {
			if (other.firstVersionLeasedDate != null)
				return false;
		} else if (!firstVersionLeasedDate.equals(other.firstVersionLeasedDate))
			return false;
		if (iternetNeeded != other.iternetNeeded)
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (createdDate.equals(other.createdDate))
			return false;
		if (minProcessorSpeed != other.minProcessorSpeed)
			return false;
		if (Double.doubleToLongBits(minRamSpaceRequired) != Double.doubleToLongBits(other.minRamSpaceRequired))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nextVersionReleaseDate == null) {
			if (other.nextVersionReleaseDate != null)
				return false;
		} else if (!nextVersionReleaseDate.equals(other.nextVersionReleaseDate))
			return false;
		if (noOfDownloads != other.noOfDownloads)
			return false;
		if (osTypeSupported == null) {
			if (other.osTypeSupported != null)
				return false;
		} else if (!osTypeSupported.equals(other.osTypeSupported))
			return false;
		if (price != other.price)
			return false;
		if (rating != other.rating)
			return false;
		if (Double.doubleToLongBits(size) != Double.doubleToLongBits(other.size))
			return false;
		if (trialDays == null) {
			if (other.trialDays != null)
				return false;
		} else if (!trialDays.equals(other.trialDays))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (Double.doubleToLongBits(version) != Double.doubleToLongBits(other.version))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public LocalDate getFirstVersionLeasedDate() {
		return firstVersionLeasedDate;
	}

	public void setFirstVersionLeasedDate(LocalDate firstVersionLeasedDate) {
		this.firstVersionLeasedDate = firstVersionLeasedDate;
	}

	public LocalDate getCurrentVersionReleaseDate() {
		return currentVersionReleaseDate;
	}

	public void setCurrentVersionReleaseDate(LocalDate currentVersionReleaseDate) {
		this.currentVersionReleaseDate = currentVersionReleaseDate;
	}

	public LocalDate getNextVersionReleaseDate() {
		return nextVersionReleaseDate;
	}

	public void setNextVersionReleaseDate(LocalDate nextVersionReleaseDate) {
		this.nextVersionReleaseDate = nextVersionReleaseDate;
	}

	public LocalDate getTrialDays() {
		return trialDays;
	}

	public void setTrialDays(LocalDate trialDays) {
		this.trialDays = trialDays;
	}

	public LangUsed getLanguage() {
		return language;
	}

	public void setLanguage(LangUsed language) {
		this.language = language;
	}

	public int getMinProcessorSpeed() {
		return minProcessorSpeed;
	}

	public void setMinProcessorSpeed(int minProcessorSpeed) {
		this.minProcessorSpeed = minProcessorSpeed;
	}

	public double getMinRamSpaceRequired() {
		return minRamSpaceRequired;
	}

	public void setMinRamSpaceRequired(double minRamSpaceRequired) {
		this.minRamSpaceRequired = minRamSpaceRequired;
	}

	public boolean isIternetNeeded() {
		return iternetNeeded;
	}

	public void setIternetNeeded(boolean iternetNeeded) {
		this.iternetNeeded = iternetNeeded;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}

	public int getNoOfDownloads() {
		return noOfDownloads;
	}

	public void setNoOfDownloads(int noOfDownloads) {
		this.noOfDownloads = noOfDownloads;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public OsTypeSupported getOsTypeSupported() {
		return osTypeSupported;
	}

	public void setOsTypeSupported(OsTypeSupported osTypeSupported) {
		this.osTypeSupported = osTypeSupported;
	}  
}
