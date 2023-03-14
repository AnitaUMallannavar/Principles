package com.xworkz.application;

import java.time.LocalDate;


import com.xworkz.application.constant.LangUsed;
import com.xworkz.application.constant.OsTypeSupported;
import com.xworkz.application.constant.Type;
import com.xworkz.application.dto.Application1DTO;
import com.xworkz.application.dto.Application1Service;

public class Application1ServiceDtoImpts implements Application1Service {

	@Override
	public boolean validateAndThenSave(Application1DTO dto) {
		if (dto != null) {
			System.out.println("dto is not null");
			String name = dto.getName();
			double version = dto.getVersion();
			double size = dto.getSize();
			LocalDate createdDate = dto.getCreatedDate();
			String developedBy = dto.getDevelopedBy();
		    Type type=dto.getType();
			int price = dto.getPrice();
			LocalDate firstVersionLeasedDate = dto.getFirstVersionLeasedDate();
			LocalDate currentVersionReleaseDate = dto.getCurrentVersionReleaseDate();
			LocalDate trailDays = dto.getTrialDays();
			LangUsed langUsed = dto.getLanguage();
			int minProcessorSpeed = dto.getMinProcessorSpeed();
			double minRamSpaceRequired = dto.getMinRamSpaceRequired();
			boolean internetNeeded = dto.isIternetNeeded();
			int ageLimit = dto.getAgeLimit();
			int noOfDownloads=dto.getNoOfDownloads();
			int rating=dto.getRating();
			OsTypeSupported osTypeSupported=dto.getOsTypeSupported();

			boolean validName = false;
			boolean validVersion = false;
			boolean validSize = false;
			boolean validCreatedDate = false;
			boolean validDevelopedBy = false;
			boolean validType = false;
			boolean validPrice = false;
			boolean vallidFirstVersionLeasedDate = false;
			boolean validCurrentVersionReleaseDate = false;
			boolean validTrailDays = false;
			boolean validLanguage = false;
			boolean validMinProcessorSpeed = false;
			boolean validMinRamSpaceRequired = false;
			boolean validInternetNeeded = false;
			boolean validAgeLimit = false;
			boolean validNoOfDownloads=false;
			boolean validRating=false;
			boolean validOsTypeSupported=false;
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 30) {
				System.out.println("name is valied");
				validName= true;
			} else {
				System.err.println("name is invalied");
			}
			if (version > 0 && version < 100) {
				System.out.println("version is valid");
				validVersion= true;
			} else {
				System.err.println("version is invalid");
			}
			if (size > 0 && size < 100) {
				System.out.println("size is valid");
				validSize= true;
			} else {
				System.err.println("size is invalid");
			}
			LocalDate today = LocalDate.now().plusDays(1);
			LocalDate year = LocalDate.of(2001, 9, 27);
			if (createdDate != null && createdDate.isBefore(today) && createdDate.isBefore(year)) {
				System.out.println("createdDate is valid");
				validCreatedDate= true;
			} else {
				System.err.println("createdDate is invalid");
			}
			if (developedBy != null && !developedBy.isEmpty() && developedBy.length() > 3
					&& developedBy.length() < 30) {
				System.out.println("developedBy is valid");
				validDevelopedBy= true;
			} else {
				System.err.println("developedBy is invalid");
			}
			if (type != null) {
				System.out.println("type is valid");
				validType= true;
			} else {
				System.err.println("type is invalid");
			}
			if (price > 0 && price < 100) {
				System.out.println("price is valid");
				validPrice= true;
			} else {
				System.err.println("price is invalid");
			}
			LocalDate pastDate = LocalDate.of(1999, 3, 12).plusDays(2);
			LocalDate year1 = LocalDate.of(2000, 7, 21);
			if (firstVersionLeasedDate != null && firstVersionLeasedDate.isBefore(pastDate)
					&& firstVersionLeasedDate.isAfter(year1)) {
				System.out.println("firstVersionLeasedDate is valid");
				vallidFirstVersionLeasedDate= true;
			} else {
				System.err.println("firstVersionLeasedDate is invalid");
			}
			LocalDate past = LocalDate.now().minusYears(3);
			LocalDate present = LocalDate.now().plusDays(2);
			if (trailDays != null && trailDays.isBefore(present) && trailDays.isAfter(past)) {
				System.out.println("TrailDays is valid");
				validTrailDays= true;
			} else {
				System.err.println("TrailDays is invalid");
			}
			if (langUsed != null) {
				System.out.println("LanguageUsed is valid");
				validLanguage= true;
			} else {
				System.err.println("Language is invalid");
			}
			if (minProcessorSpeed > 0 && minProcessorSpeed < 100) {
				System.out.println("MinProcessorSpeed is valid");
			  validMinProcessorSpeed= true;
			} else {
				System.err.println("MinProcessorSpeed is invalid");
			}
			if (minRamSpaceRequired > 3 && minRamSpaceRequired < 100) {
				System.out.println("MinRamSpaceRequired is valid");
				validMinRamSpaceRequired= true;
			} else {
				System.err.println("MinRamSpaceRequired is invalid");
			}
			if (internetNeeded == true) {
				System.out.println("InternetNeeded is valid");
				validInternetNeeded= true;
			} else {
				System.err.println("InternetNeeded is invalid");
			}
			if (ageLimit > 3 && ageLimit < 100) {
				System.out.println("AgeLimit is valid");
				validAgeLimit=true;
			} else {
				System.err.println("AgeLimit is valid");
			}
			if(noOfDownloads>3&&noOfDownloads<100) {
				System.out.println("NoOfDownloads is valid");
				validNoOfDownloads=true;
			}else {
				System.err.println("NoOfDownloads is invalid");
			}
			if(rating>3&&rating<100) {
				System.out.println("Rating is valid");
				validRating= true;
			}else {
				System.err.println("Rating is invalid");
			}if(osTypeSupported!=null) {
				System.out.println("OsTypeSupported is valid");
				validOsTypeSupported= true;
			}else {
				System.err.println("OsTypeSupported is invalid");
			}
			// LocalDate today1=LocalDate.
		} else {
			System.err.println("dto is null");
		}
		return false;
	}

	/*
	 * @Override public boolean validateAndThenSave(Application1DTO dto) {
	 * if(dto!=null) { System.out.println("dto is not null"+dto); } else {
	 * System.err.println("dto is null"); } return false; }
	 */

}
