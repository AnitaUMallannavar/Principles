package com.xworkz.fine.service;

import java.time.LocalDate;
import static com.xworkz.fine.util.EducationValidationUtil.*;
import com.xworkz.fine.dto.EducationDTO;
import com.xworkz.fine.exception.EducationMemoryFullExeption;
import com.xworkz.fine.exception.InvaliedEducationException;
import com.xworkz.fine.repository.EducationRepository;

public class EducationServiceImpl implements EducationService {
	private EducationRepository educationRepository;

	public EducationServiceImpl(EducationRepository educationRepository) {
		this.educationRepository = educationRepository;
	}

	@Override
	public boolean validateAndThenSave(EducationDTO dto) throws InvaliedEducationException {
		System.out.println("Running validateAndThenSave in EducationServiceImpl :" + dto);
		if (dto != null) {
			System.out.println("dto is not null");

			int id = dto.getId();
			double percentage = dto.getPercentage();
			String univercity = dto.getUnivercity();
			LocalDate startDate = dto.getStartDate();
			LocalDate endDate = dto.getEndDate();
			boolean backlog = dto.getBacklog();
			String stream = dto.getStream();
			String candidateName = dto.getCandidateName();

			boolean validId = false;
			boolean validPercentage = false;
			boolean validUnivercity = false;
			boolean validStartDate = false;
			boolean validEndDate = false;
			boolean validStream = false;
			boolean validBacklog = false;
			boolean validCandidateName = false;

			if (validString(univercity)) {
				System.out.println("valid university");
				validUnivercity = true;
			} else {
				System.err.println("invalid univercity");
			}
			if (validString(stream)) {
				System.out.println("valid stream");
				validStream = true;
			} else {
				System.err.println("invalid stream");
			}
			if (validString(candidateName)) {
				System.out.println("valid candidateName");
				validCandidateName = true;
			} else {
				System.err.println("invalid candidateName");
			}
			if (validId(id)) {
				System.out.println("valid id");
				validId = true;
			} else {
				System.err.println("invalid id");
			}
			if (validNumber(percentage)) {
				System.out.println("valid percentage");
				validPercentage = true;
			} else {
				System.err.println("invalid percentage");
			}
			if (backlog) {
				System.out.println("valid backlog");
				validBacklog = true;
			} else {
				System.err.println("invalid backlog");
			}
			if (validDate(startDate)) {
				System.out.println("valid startDate");
				validStartDate = true;
			} else {
				System.err.println("invalid startDate");
			}
			if (validDate(endDate)) {
				System.out.println("valid EndDate");
				validEndDate = true;
			} else {
				System.err.println("invalid endDate");
			}

			if (validFlag(validId && validPercentage && validUnivercity && validStartDate && validEndDate && validStream
					&& validBacklog && validCandidateName)) {
				System.out.println("dto is valid & can be save");
				boolean exist = this.educationRepository.isExist(dto);
				if (!exist) {
					boolean save = this.educationRepository.saved(dto);
					return save;
				} else {
					System.err.println("dto is not valid");
				}
			} else {
				throw new InvaliedEducationException("invalid dto");
			}

		} else {
			System.err.println("dto is null");
		}
		return false;
	}

	@Override
	public EducationDTO find(EducationDTO dto) {

		return null;
	}

	@Override
	public EducationDTO findByCandidateName(String name) {
		return this.educationRepository.findByCandidateName(name);
	}

	@Override
	public EducationDTO findByCandidateNameAndUnivercity(String name, String univercity) {
		return this.educationRepository.findByCandidateNameAndUnivercity(name, univercity);
	}

	@Override
	public boolean findBacklogByCandidateNameAndDegreeNameAndUnivercity(String candidateName, String degreeName,
			String univercity) {

		return this.educationRepository.findBacklogByCandidateNameAndDegreeNameAndUnivercity(candidateName, degreeName,
				univercity);
	}

	@Override
	public EducationDTO findByCandidateNameAndStartDateAndEndDate(String name, LocalDate startDate, LocalDate endDate) {
		return this.educationRepository.findByCandidateNameAndStartDateAndEndDate(name, startDate, endDate);
	}

	@Override
	public double findPercentageByCandidateName(String candidateName) {
		return this.educationRepository.findPercentageByCandidateName(candidateName);
	}

	@Override
	public String findStreamByCandidateNameAndDegreeNameAndUnivercity(String candidateName, String degreeName,
			String univercity) {
		return this.educationRepository.findStreamByCandidateNameAndDegreeNameAndUnivercity(candidateName, degreeName,
				univercity);
	}

	@Override
	public int findIdByCandidateNameAndDegreeNameAndUnivercity(String candidateName, String degreeName,
			String univercity) {
		return this.educationRepository.findIdByCandidateNameAndDegreeNameAndUnivercity(candidateName, degreeName,
				univercity);
	}

	@Override
	public String findUnivercityByCandidateName(String candidateName) {
		return this.educationRepository.findUnivercityByCandidateName(candidateName);
	}

	@Override
	public int total() {
		return this.educationRepository.total();
	}

}
