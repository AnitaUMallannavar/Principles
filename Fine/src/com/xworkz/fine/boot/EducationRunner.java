package com.xworkz.fine.boot;

import java.time.LocalDate;

import com.xworkz.fine.dto.EducationDTO;
import com.xworkz.fine.exception.InvaliedEducationException;
import com.xworkz.fine.repository.EducationRepository;
import com.xworkz.fine.repository.EducationRepositoyImpl;
import com.xworkz.fine.service.EducationService;
import com.xworkz.fine.service.EducationServiceImpl;

public class EducationRunner {
	public static void main(String[] args) {
		EducationDTO educationDTO = new EducationDTO(324, "B.Sc", 80, "Ranichennamma University",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 8, 7), true, "Cs", "Rajeshwari");
		EducationRepository educationRepository = new EducationRepositoyImpl();
		EducationService educationService = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO2 = new EducationDTO(324, "BCa", 87, "Ranichennamma University",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 9, 8), true, "Cs", "Rajeshwari");

		EducationService educationService2 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO3 = new EducationDTO(324, "Be", 78, "Ranichennamma University",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4), true, "Cs", "Rajeshwari");

		EducationService educationService3 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO4 = new EducationDTO(324, "BBA", 88, "Ranichennamma University",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4), true, "Cs", "Rajeshwari");

		EducationService educationService4 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO5 = new EducationDTO(324, "BBA", 80, "Ranichennamma University",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4), true, "Cs", "Rajeshwari");

		EducationService educationService5 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO6 = new EducationDTO(3674, "B.Sc", 85, "Ranichennamma University",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4), true, "Cs", "Rajeshwari");
		EducationService educationService6 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO7 = new EducationDTO(324, "B.Sc", 67, "KCD University", LocalDate.of(2023, 7, 8),
				LocalDate.of(2023, 4, 4), true, "Cs", "Rajeshwari");
		EducationService educationService7 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO8 = new EducationDTO(37644, "B.Sc", 86, "KUD University", LocalDate.of(2023, 7, 8),
				LocalDate.of(2023, 4, 4), true, "Cs", "Rajesh");
		EducationService educationService8 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO9 = new EducationDTO(3644, "B.Sc", 88, "Akkamahadevi University",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4), true, "Cs", "Rajeshwari");
		EducationService educationService9 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO10 = new EducationDTO(3426, "BBA", 65, "Ranichennamma University",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4), true, "Cs", "Ravi");
		EducationService educationService10 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO11 = new EducationDTO(324, "B.Sc", 87, "Ranichennamma University",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4), true, "Cs", "Raju");
		EducationService educationService11 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO12 = new EducationDTO(36542, "BCA", 80, "Ranichennamma University",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4), true, "Cs", "Ramya");

		EducationService educationService12 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO13 = new EducationDTO(36465, "B.Sc", 78, "Ranichennamma University",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4), true, "Cs", "Raghu");

		EducationService educationService13 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO14 = new EducationDTO(6514, "B.Sc", 86, "Ranichennamma University",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4), true, "Physics", "Rajeshwari");
		EducationService educationService14 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO15 = new EducationDTO(37675, "BBA", 85, "Ranichennamma University",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4), true, "Cs", "Rajeshwari");
		EducationService educationService15 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO16 = new EducationDTO(34351, "B.Sc", 76, "Ranichennamma University",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 8, 7), true, "Cs", "Ravi");
		EducationService educationService16 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO17 = new EducationDTO(3990, "BCA", 80, "Akkamahadevi University",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4), true, "Physics", "Rajeshwari");
		EducationService educationService17 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO18 = new EducationDTO(7643, "BBA", 70, "Ranichennamma University",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4), true, "Cs", "Rajeshwari");
		EducationService educationService18 = new EducationServiceImpl(educationRepository);

		EducationDTO educationDTO19 = new EducationDTO(54257, "B.Sc", 98, "Ranichennamma University",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4), true, "BBA", "Rajeshwari");

		EducationService educationService19 = new EducationServiceImpl(educationRepository);
		EducationDTO educationDTO20 = new EducationDTO(7580, "BCA", 90, "Akkamahadevi University",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4), true, "Cs", "Rajeshwari");
		EducationService educationService20 = new EducationServiceImpl(educationRepository);

		try {
			boolean save = educationService.validateAndThenSave(educationDTO);
			System.out.println(save);
			System.out.println("------------");

			System.out.println(educationService.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari",
					"B.Sc", "Ranichannamma university"));

			boolean save2 = educationService.validateAndThenSave(educationDTO2);
			System.out.println(save2);

			System.out.println("------------");

			boolean save3 = educationService.validateAndThenSave(educationDTO3);
			System.out.println(save3);

			System.out.println("------------");

			boolean save4 = educationService.validateAndThenSave(educationDTO4);
			System.out.println(save4);

			System.out.println("------------");

			boolean save5 = educationService.validateAndThenSave(educationDTO5);
			System.out.println(save5);
			System.out.println("------------");

			boolean save6 = educationService.validateAndThenSave(educationDTO6);
			System.out.println(save6);
			System.out.println("------------");

			boolean save7 = educationService.validateAndThenSave(educationDTO7);
			System.out.println(save7);

			System.out.println("------------");

			boolean save8 = educationService.validateAndThenSave(educationDTO8);
			System.out.println(save8);

			System.out.println("------------");

			boolean save9 = educationService.validateAndThenSave(educationDTO9);
			System.out.println(save9);
			System.out.println("------------");

			boolean save10 = educationService.validateAndThenSave(educationDTO10);
			System.out.println(save10);
			System.out.println("------------");

			boolean save11 = educationService.validateAndThenSave(educationDTO11);
			System.out.println(save11);
			System.out.println("------------");

			boolean save12 = educationService.validateAndThenSave(educationDTO12);
			System.out.println(save12);
			System.out.println("------------");

			boolean save13 = educationService.validateAndThenSave(educationDTO13);
			System.out.println(save13);

			System.out.println("------------");

			boolean save14 = educationService.validateAndThenSave(educationDTO14);
			System.out.println(save14);

			System.out.println("------------");

			boolean save15 = educationService.validateAndThenSave(educationDTO15);
			System.out.println(save15);
			System.out.println("------------");

			boolean save16 = educationService.validateAndThenSave(educationDTO16);
			System.out.println(save16);
			System.out.println("------------");

			boolean save17 = educationService.validateAndThenSave(educationDTO17);
			System.out.println(save17);

			System.out.println("------------");

			boolean save18 = educationService.validateAndThenSave(educationDTO18);
			System.out.println(save18);
			System.out.println("------------");

			boolean save19 = educationService.validateAndThenSave(educationDTO19);
			System.out.println(save19);
			System.out.println("------------");

			boolean save20 = educationService.validateAndThenSave(educationDTO20);
			System.out.println(save20);
		} catch (InvaliedEducationException e) {
			System.out.println("InvaliedEducationException :" + e.getMessage());
		}
		System.out.println(educationService.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "B.Sc",
				"Ranichennamma University"));
		System.out.println(educationService.findIdByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "B.Sc",
				"Ranichennamma University"));
		System.out.println(educationService.findPercentageByCandidateName("Rajeshwari"));
		System.out.println(educationService.findStreamByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "B.Sc",
				"Ranichennamma University"));
		System.out.println(educationService.findUnivercityByCandidateName("Rajeshwari"));
		System.out.println(educationService.findByCandidateName("Rajeshwari"));
		System.out.println(educationService.find(educationDTO));
		System.out.println(educationService.findByCandidateNameAndStartDateAndEndDate("Rajeshwari",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 8, 7)));
		System.out.println("--------------");
		System.out.println(educationService2.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "BCa",
				"Ranichennamma University"));
		System.out.println(educationService2.findIdByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "BCa",
				"Ranichennamma University"));
		System.out.println(educationService2.findPercentageByCandidateName("Rajeshwari"));
		System.out.println(educationService2.findStreamByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "BCa",
				"Ranichannamma university"));
		System.out.println(educationDTO.toString());
		System.out.println(educationService2.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "B.Sc",
				"Ranichannamma University"));
		System.out.println(educationService.findStreamByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "BCa",
				"Ranichannamma University"));
		System.out.println(educationService3.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshari", "Be",
				"Ranichennamma University"));
		System.out.println("------------");
		System.out.println(educationService3.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "Be",
				"Ranichennamma University"));
		System.out.println(educationService3.findIdByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "Be",
				"Ranichennamma University"));
		System.out.println(educationService3.findPercentageByCandidateName("Rajeshwari"));
		System.out.println(educationService3.findStreamByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "Be",
				"Ranichennamma University"));
		System.out.println(educationService3.findUnivercityByCandidateName("Rajeshwari"));
		System.out.println(educationService3.find(educationDTO3));
		System.out.println(educationService3.findByCandidateNameAndStartDateAndEndDate("Rajeshwari",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4)));
		System.out
				.println(educationService3.findByCandidateNameAndUnivercity("Rajeshwari", "Ranichannamma University"));
		System.out.println("------------");
		System.out.println(educationService4.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "BCa",
				"Ranichannamma University"));
		System.out.println(educationService4.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "BCa",
				"Ranichennamma University"));
		System.out.println(educationService4.findIdByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "BCa",
				"Ranichennamma University"));
		System.out.println(educationService4.findPercentageByCandidateName("Rajeshwari"));
		System.out.println(educationService4.findStreamByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "BCa",
				"Ranichannamma university"));
		System.out.println(educationDTO.toString());
		System.out.println(educationService4.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "B.Sc",
				"Ranichannamma University"));
		System.out.println(educationService4.findStreamByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "BCa",
				"Ranichannamma University"));
		System.out.println(educationService4.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshari", "Be",
				"Ranichennamma University"));
		System.out.println("-------");
		System.out.println(educationService5.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "BCa",
				"Ranichennamma University"));
		System.out.println(educationService5.findIdByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "BCa",
				"Ranichennamma University"));
		System.out.println(educationService5.findPercentageByCandidateName("Rajeshwari"));
		System.out.println(educationService5.findStreamByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "BCa",
				"Ranichannamma university"));
		System.out.println(educationDTO.toString());
		System.out.println(educationService5.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "B.Sc",
				"Ranichannamma University"));
		System.out.println(educationService5.findStreamByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "BCa",
				"Ranichannamma University"));
		System.out.println(educationService5.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshari", "Be",
				"Ranichennamma University"));
		System.out.println("-------");
		System.out.println(educationService6.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "B.Sc",
				"Ranichennamma University"));
		System.out.println(educationService6.findIdByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "B.Sc",
				"Ranichennamma University"));
		System.out.println(educationService6.findPercentageByCandidateName("Rajeshwari"));
		System.out.println(educationService6.findStreamByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "B.Sc",
				"Ranichannamma university"));
		System.out.println(educationDTO.toString());
		System.out.println(educationService6.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "B.Sc",
				"Ranichannamma University"));
		System.out.println(educationService6.findStreamByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "B.Sc",
				"Ranichannamma University"));
		System.out.println(educationService6.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshari", "B.Sc",
				"Ranichennamma University"));
		System.out.println("----------");
		System.out.println(educationService7.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "B.Sc",
				"KCD University"));
		System.out.println(educationService7.findIdByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "B.Sc",
				"KCD University"));
		System.out.println(educationService7.findPercentageByCandidateName("Rajeshwari"));
		System.out.println(educationService7.findStreamByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "B.Sc",
				"KCD University"));
		System.out.println(educationService7.findUnivercityByCandidateName("Rajeshwari"));
		System.out.println(educationService7.findByCandidateName("Rajeshwari"));
		System.out.println(educationService7.find(educationDTO7));
		System.out.println(educationService7.findByCandidateNameAndStartDateAndEndDate("Rajeshwari",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4)));
		System.out.println("------------");
		System.out.println(educationService8.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajesh", "B.Sc",
				"KUD University"));
		System.out.println("------------");
		System.out.println(educationService8.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajesh", "B.Sc",
				"KUD University"));
		System.out.println(
				educationService8.findIdByCandidateNameAndDegreeNameAndUnivercity("Rajesh", "B.Sc", "KUD University"));
		System.out.println(educationService8.findPercentageByCandidateName("Rajesh"));
		System.out.println(educationService8.findStreamByCandidateNameAndDegreeNameAndUnivercity("Rajesh", "B.Sc",
				"KUD University"));
		System.out.println(educationService8.findUnivercityByCandidateName("Rajesh"));
		System.out.println(educationService8.find(educationDTO8));
		System.out.println(educationService8.findByCandidateNameAndStartDateAndEndDate("Rajesh",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4)));
		System.out.println(educationService8.findByCandidateNameAndUnivercity("Rajesh", "KUD University"));
		System.out.println("------------");
		System.out.println(educationService9.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshari", "B.Sc",
				"Akkamahadevi University"));
		System.out.println("------------");
		System.out.println(educationService9.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "B.Sc",
				"Akkamahadevi University"));
		System.out.println(educationService9.findIdByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "B.Sc",
				"Akkamahadevi University"));
		System.out.println(educationService9.findPercentageByCandidateName("Rajeshwari"));
		System.out.println(educationService9.findStreamByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "B.Sc",
				"Akkamahadevi University"));
		System.out.println(educationService9.findUnivercityByCandidateName("Rajeshwari"));
		System.out.println(educationService9.find(educationDTO9));
		System.out.println(educationService9.findByCandidateNameAndStartDateAndEndDate("Rajeshwari",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4)));
		System.out.println(educationService9.findByCandidateNameAndUnivercity("Rajeshwari", "Akkamahadevi University"));
		System.out.println("------------");
		System.out.println(educationService10.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshari", "Be",
				"Ranichennamma University"));
		System.out.println("------------");
		System.out.println(educationService10.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Ravi", "BBa",
				"Ranichennamma University"));
		System.out.println(educationService10.findIdByCandidateNameAndDegreeNameAndUnivercity("Ravi", "BBA",
				"Ranichennamma University"));
		System.out.println(educationService10.findPercentageByCandidateName("Ravi"));
		System.out.println(educationService10.findStreamByCandidateNameAndDegreeNameAndUnivercity("Ravi", "BBA",
				"Ranichennamma University"));
		System.out.println(educationService10.findUnivercityByCandidateName("Ravi"));
		System.out.println(educationService10.find(educationDTO10));
		System.out.println(educationService10.findByCandidateNameAndStartDateAndEndDate("Ravi",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4)));
		System.out.println(educationService10.findByCandidateNameAndUnivercity("Ravi", "Ranichannamma University"));
		System.out.println("------------");
		System.out.println(educationService11.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Raju", "B.Sc",
				"Ranichennamma University"));
		System.out.println("------------");
		System.out.println(educationService11.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Raju", "B.Sc",
				"Ranichennamma University"));
		System.out.println(educationService11.findIdByCandidateNameAndDegreeNameAndUnivercity("Raju", "B.Sc",
				"Ranichennamma University"));
		System.out.println(educationService11.findPercentageByCandidateName("Raju"));
		System.out.println(educationService11.findStreamByCandidateNameAndDegreeNameAndUnivercity("Raju", "B.Sc",
				"Ranichennamma University"));
		System.out.println(educationService11.findUnivercityByCandidateName("Raju"));
		System.out.println(educationService11.find(educationDTO3));
		System.out.println(educationService11.findByCandidateNameAndStartDateAndEndDate("Raju",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4)));
		System.out.println(educationService11.findByCandidateNameAndUnivercity("Raju", "Ranichannamma University"));
		System.out.println("------------");
		System.out.println(educationService12.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Ramya", "BCA",
				"Ranichennamma University"));
		System.out.println("------------");
		System.out.println(educationService12.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Ramya", "BCA",
				"Ranichennamma University"));
		System.out.println(educationService12.findIdByCandidateNameAndDegreeNameAndUnivercity("Ramya", "BCA",
				"Ranichennamma University"));
		System.out.println(educationService12.findPercentageByCandidateName("Ramya"));
		System.out.println(educationService12.findStreamByCandidateNameAndDegreeNameAndUnivercity("Ramya", "BCA",
				"Ranichennamma University"));
		System.out.println(educationService12.findUnivercityByCandidateName("Ramya"));
		System.out.println(educationService12.find(educationDTO12));
		System.out.println(educationService12.findByCandidateNameAndStartDateAndEndDate("Ramya",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4)));
		System.out.println(educationService12.findByCandidateNameAndUnivercity("Ramya", "Ranichannamma University"));
		System.out.println("------------");
		System.out.println(educationService13.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Raghu", "B.Sc",
				"Ranichennamma University"));
		System.out.println("------------");
		System.out.println(educationService13.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Raghu", "B.Sc",
				"Ranichennamma University"));
		System.out.println(educationService13.findIdByCandidateNameAndDegreeNameAndUnivercity("Raghu", "B.Sc",
				"Ranichennamma University"));
		System.out.println(educationService13.findPercentageByCandidateName("Rajeshwari"));
		System.out.println(educationService13.findStreamByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "Be",
				"Ranichennamma University"));
		System.out.println(educationService13.findUnivercityByCandidateName("Rajeshwari"));
		System.out.println(educationService13.find(educationDTO13));
		System.out.println(educationService13.findByCandidateNameAndStartDateAndEndDate("Rajeshwari",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4)));
		System.out
				.println(educationService13.findByCandidateNameAndUnivercity("Rajeshwari", "Ranichannamma University"));
		System.out.println("------------");
		System.out.println(educationService13.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshari", "Be",
				"Ranichennamma University"));
		System.out.println("------------");
		System.out.println(educationService16.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Ravi", "B.Sc",
				"Ranichennamma University"));
		System.out.println(educationService16.findIdByCandidateNameAndDegreeNameAndUnivercity("Ravi", "B.Sc",
				"Ranichennamma University"));
		System.out.println(educationService16.findPercentageByCandidateName("Ravi"));
		System.out.println(educationService16.findStreamByCandidateNameAndDegreeNameAndUnivercity("Ravi", "B.Sc",
				"Ranichennamma University"));
		System.out.println(educationService16.findUnivercityByCandidateName("Ravi"));
		System.out.println(educationService16.find(educationDTO16));
		System.out.println(educationService16.findByCandidateNameAndStartDateAndEndDate("Ravi",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 8, 7)));
		System.out.println(educationService16.findByCandidateNameAndUnivercity("Ravi", "Ranichannamma University"));
		System.out.println("------------");
		System.out.println(educationService16.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Ravi", "B.Sc",
				"Ranichennamma University"));
		System.out.println("------------");
		System.out.println(educationService17.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "Be",
				"Ranichennamma University"));
		System.out.println(educationService17.findIdByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "Be",
				"Ranichennamma University"));
		System.out.println(educationService17.findPercentageByCandidateName("Rajeshwari"));
		System.out.println(educationService17.findStreamByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "Be",
				"Ranichennamma University"));
		System.out.println(educationService17.findUnivercityByCandidateName("Rajeshwari"));
		System.out.println(educationService17.find(educationDTO3));
		System.out.println(educationService17.findByCandidateNameAndStartDateAndEndDate("Rajeshwari",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4)));
		System.out
				.println(educationService17.findByCandidateNameAndUnivercity("Rajeshwari", "Ranichannamma University"));
		System.out.println("------------");
		System.out.println(educationService17.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshari", "Be",
				"Ranichennamma University"));
		System.out.println("------------");
		System.out.println(educationService18.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "Be",
				"Ranichennamma University"));
		System.out.println(educationService18.findIdByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "Be",
				"Ranichennamma University"));
		System.out.println(educationService18.findPercentageByCandidateName("Rajeshwari"));
		System.out.println(educationService18.findStreamByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "Be",
				"Ranichennamma University"));
		System.out.println(educationService18.findUnivercityByCandidateName("Rajeshwari"));
		System.out.println(educationService18.find(educationDTO3));
		System.out.println(educationService18.findByCandidateNameAndStartDateAndEndDate("Rajeshwari",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4)));
		System.out
				.println(educationService19.findByCandidateNameAndUnivercity("Rajeshwari", "Ranichannamma University"));
		System.out.println("------------");
		System.out.println(educationService19.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshari", "Be",
				"Ranichennamma University"));
		System.out.println("------------");
		System.out.println(educationService19.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "Be",
				"Ranichennamma University"));
		System.out.println(educationService19.findIdByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "Be",
				"Ranichennamma University"));
		System.out.println(educationService19.findPercentageByCandidateName("Rajeshwari"));
		System.out.println(educationService19.findStreamByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "Be",
				"Ranichennamma University"));
		System.out.println(educationService19.findUnivercityByCandidateName("Rajeshwari"));
		System.out.println(educationService19.find(educationDTO3));
		System.out.println(educationService19.findByCandidateNameAndStartDateAndEndDate("Rajeshwari",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4)));
		System.out
				.println(educationService19.findByCandidateNameAndUnivercity("Rajeshwari", "Ranichannamma University"));
		System.out.println("------------");
		System.out.println(educationService20.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshari", "Be",
				"Ranichennamma University"));
		System.out.println("------------");
		System.out.println(educationService20.findBacklogByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "Be",
				"Ranichennamma University"));
		System.out.println(educationService20.findIdByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "Be",
				"Ranichennamma University"));
		System.out.println(educationService20.findPercentageByCandidateName("Rajeshwari"));
		System.out.println(educationService20.findStreamByCandidateNameAndDegreeNameAndUnivercity("Rajeshwari", "Be",
				"Ranichennamma University"));
		System.out.println(educationService20.findUnivercityByCandidateName("Rajeshwari"));
		System.out.println(educationService20.find(educationDTO20));
		System.out.println(educationService20.findByCandidateNameAndStartDateAndEndDate("Rajeshwari",
				LocalDate.of(2023, 7, 8), LocalDate.of(2023, 4, 4)));
		System.out
				.println(educationService20.findByCandidateNameAndUnivercity("Rajeshwari", "Ranichannamma University"));
		System.out.println("------------");

		System.out.println("Total saved is:" + educationService.total());
	}
}
