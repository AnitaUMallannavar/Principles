package com.xworkz.fine.service;

import java.time.LocalDate;

import com.xworkz.fine.dto.EducationDTO;

public interface EducationService {
	boolean validateAndThenSave(EducationDTO dto);

	EducationDTO find(EducationDTO dto);

	EducationDTO findByCandidateName(String name);

	EducationDTO findByCandidateNameAndUnivercity(String name, String univercity);

	boolean findBacklogByCandidateNameAndDegreeNameAndUnivercity(String candidateName, String degreeName,
			String univercity);

	EducationDTO findByCandidateNameAndStartDateAndEndDate(String name, LocalDate startDate, LocalDate endDate);

	double findPercentageByCandidateName(String candidateName);

	String findStreamByCandidateNameAndDegreeNameAndUnivercity(String candidateName, String degreeName,
			String univercity);

	int findIdByCandidateNameAndDegreeNameAndUnivercity(String candidateName, String degreeName, String univercity);

	String findUnivercityByCandidateName(String candidateName);

	int total();
}
