package com.xworkz.fine.repository;

import java.time.LocalDate;

import com.xworkz.fine.dto.EducationDTO;
import com.xworkz.fine.exception.EducationMemoryFullExeption;

public class EducationRepositoyImpl implements EducationRepository {
	private EducationDTO[] educationDTO = new EducationDTO[20];
	private int index = 0;

	@Override
	public boolean saved(EducationDTO dto) throws EducationMemoryFullExeption {
		System.out.println("Running Saved method in EducationRepositoryImpl :" + dto);
		if (this.index < this.educationDTO.length) {
			this.educationDTO[this.index] = dto;
			System.out.println("dto is saved at the index :" + this.index + " " + dto);
			this.index++;
			return true;
		} else {
			System.out.println("Memory is full,elements cannot be stored");
			throw new EducationMemoryFullExeption("Memory is full,cannot add more than 10 elements");
		}
	}

	@Override
	public boolean isExist(EducationDTO dto) {
		System.out.println("Running isExist method");
		if (this.index == 0) {
			System.out.println("1st element will not Checks");
			return false;
		} else {
			for (int index1 = 0; index1 < this.educationDTO.length; index1++) {
				EducationDTO ele = this.educationDTO[index1];
				if (ele != null && ele.equals(dto)) {
					System.out.println("dto cannot be saved as it is duplicate");
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public EducationDTO find(EducationDTO dto) {
		for (int index2 = 0; index2 < this.educationDTO.length; index2++) {
			EducationDTO ele = this.educationDTO[index2];
			if (ele.equals(dto)) {
				System.out.println("this dto is present :" + dto);
				return ele;
			}
		}
		return null;
	}

	@Override
	public EducationDTO findByCandidateName(String name) {
		for (int index3 = 0; index3 < this.educationDTO.length; index3++) {
			EducationDTO ele = this.educationDTO[index3];
			if (ele.getCandidateName().equals(name)) {
				System.out.println("candidateName is present :" + name);
				return ele;
			}
		}
		return null;
	}

	@Override
	public EducationDTO findByCandidateNameAndUnivercity(String name, String univercity) {
		for (int index4 = 0; index4 < this.educationDTO.length; index4++) {
			EducationDTO ele = this.educationDTO[index4];
			if (ele!=null && ele.getCandidateName().equals(name) && ele.getUnivercity().equals(univercity)) {
				System.out.println("this Name is present :" + name + "this Univercity is present : " + univercity);
				return ele;
			}
		}
		return null;
	}

	@Override
	public boolean findBacklogByCandidateNameAndDegreeNameAndUnivercity(String candidateName, String degreeName,
			String univercity) {
		for (int index5 = 0; index5 < this.educationDTO.length; index5++) {
			EducationDTO ele = this.educationDTO[index5];
			if (ele != null && ele.getCandidateName().equals(candidateName) && ele.getDegreeName().equals(degreeName)
					&& ele.getUnivercity().equals(univercity)) {
				System.out.println("candidateName is present :[" + candidateName + "degreeName is present :[" + degreeName
						+ "university is present :[" + univercity);
				return true;
			}
		}
		return false;
	}

	@Override
	public EducationDTO findByCandidateNameAndStartDateAndEndDate(String name, LocalDate startDate, LocalDate endDate) {
		for (int index6 = 0; index6 < this.educationDTO.length; index6++) {
			EducationDTO ele = this.educationDTO[index6];
			if ( ele!=null && ele.getCandidateName().equals(name) && ele.getStartDate().equals(startDate)
					&& ele.getEndDate().equals(endDate)) {
				System.out.println("name is present :" + name + "startDate is present :" + startDate
						+ "endDate is present :" + endDate);
				return ele;
			}
		}
		return null;
	}

	@Override
	public double findPercentageByCandidateName(String candidateName) {
		for (int index7 = 0; index7 < this.educationDTO.length; index7++) {
			EducationDTO ele = this.educationDTO[index7];
			if (ele != null && ele.getCandidateName().equals(candidateName)) {
				System.out.println("candidateName is present :" + candidateName);
				double per = ele.getPercentage();
				return per;
			}

		}

		return 0;
	}

	@Override
	public String findStreamByCandidateNameAndDegreeNameAndUnivercity(String candidateName, String degreeName,
			String univercity) {
		for (int index8 = 0; index8 < this.educationDTO.length; index8++) {
			EducationDTO ele = this.educationDTO[index8];
			if (ele != null && ele.getCandidateName().equals(candidateName) && ele.getDegreeName().equals(degreeName)
					&& ele.getUnivercity().equals(univercity))
				;
			{
				System.out.println("candidateName is present :" + candidateName + "degreeName is present :" + degreeName
						+ "university is present :" + univercity);
				String ref = ele.getStream();
				return ref;
			}
		}
		return null;
	}

	@Override
	public int findIdByCandidateNameAndDegreeNameAndUnivercity(String candidateName, String degreeName,
			String univercity) {
		for (int index9 = 0; index9 < this.educationDTO.length; index9++) {
			EducationDTO ele = this.educationDTO[index9];
			if (ele != null && ele.getCandidateName().equals(candidateName) && ele.getDegreeName().equals(degreeName)
					&& ele.getUnivercity().equals(univercity)) {
				System.out.println("candidateName is present :" + candidateName + "DegreeName is present :" + degreeName
						+ "univercity is present :" + univercity);
				int ref = ele.getId();
				return ref;
			}
		}
		return 0;
	}

	@Override
	public String findUnivercityByCandidateName(String candidateName) {
		for (int index10 = 0; index10 < this.educationDTO.length; index10++) {
			EducationDTO ele = this.educationDTO[index10];
			if (ele!=null && ele.getCandidateName().equals(candidateName)) {
				System.out.println("candidateName is present :" + candidateName);
				String ref = ele.getUnivercity();
				return ref;
			}
		}
		return null;
	}

	@Override
	public int total() {
		return this.index;
	}

}
