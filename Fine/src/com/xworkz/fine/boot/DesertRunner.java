package com.xworkz.fine.boot;

import com.xworkz.fine.dto.DesertDTO;
import com.xworkz.fine.exception.InvaliedDesertException;
import com.xworkz.fine.repository.DesertRepository;
import com.xworkz.fine.repository.DesertRepositoryImpl;
import com.xworkz.fine.service.DesertService;
import com.xworkz.fine.service.DesertServiceImpl;

public class DesertRunner {
	public static void main(String[] args) {
		DesertDTO desertDTO = new DesertDTO(123, "Namib", "South Africa", 13322.432, 11.2, 12.32);
		DesertRepository desertRepository = new DesertRepositoryImpl();
		DesertService desertService = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO2 = new DesertDTO(543, "Sahara", "Algeria", 3243.242, 10.32, 12.423);
		DesertService desertService2 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO3 = new DesertDTO(543, "Atacama", "Algentina", 3243.242, 10.32, 12.423);
		DesertService desertService3 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO4 = new DesertDTO(543, "Kalahari", "Africa", 3243.242, 10.32, 12.423);
		DesertService desertService4 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO5 = new DesertDTO(543, "Arabian", "Yemen", 3243.242, 10.32, 12.423);
		DesertService desertService5 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO6 = new DesertDTO(543, "Gobi", "China", 3243.242, 10.32, 12.423);
		DesertService desertService6 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO7 = new DesertDTO(543, "Great Victoria", "Australia", 3243.242, 10.32, 12.423);
		DesertService desertService7 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO8 = new DesertDTO(543, "Patagonian", "Algentina", 3243.242, 10.32, 12.423);
		DesertService desertService8 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO9 = new DesertDTO(543, "Thar", "India", 3243.242, 10.32, 12.423);
		DesertService desertService9 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO10 = new DesertDTO(543, "Takla Makan", "China", 3243.242, 10.32, 12.423);
		DesertService desertService10 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO11 = new DesertDTO(543, "Syrian", "Soudi Arabia", 3243.242, 10.32, 12.423);
		DesertService desertService11 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO12 = new DesertDTO(543, "Mojave", "United States", 3243.242, 10.32, 12.423);
		DesertService desertService12 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO13 = new DesertDTO(543, "Greadt Basin", "United States", 3243.242, 10.32, 12.423);
		DesertService desertService13 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO14 = new DesertDTO(543, "Karakum", "Turkmenistan", 3243.242, 10.32, 12.423);
		DesertService desertService14 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO15 = new DesertDTO(543, "Antarctic", "Antarctic", 3243.242, 10.32, 12.423);
		DesertService desertService15 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO16 = new DesertDTO(543, "Arctic", "Europ", 3243.242, 10.32, 12.423);
		DesertService desertService16 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO17 = new DesertDTO(543, "Chihuahuan", "Northern America", 3243.242, 10.32, 12.423);
		DesertService desertService17 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO18 = new DesertDTO(543, "Colorado Plateau", "Northern America", 3243.242, 10.32, 12.423);
		DesertService desertService18 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO19 = new DesertDTO(543, "Sonoran", "Northern America", 3243.242, 10.32, 12.423);
		DesertService desertService19 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO20 = new DesertDTO(543, "Kyzylkum", "Central Asia", 3243.242, 10.32, 12.423);
		DesertService desertService20 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO21 = new DesertDTO(543, "Taklamakan", "Eastern Asia", 3243.242, 10.32, 12.423);
		DesertService desertService21 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO22 = new DesertDTO(543, "Ogden", "Eastern America", 3243.242, 10.32, 12.423);
		DesertService desertService22 = new DesertServiceImpl(desertRepository);

		DesertDTO desertDTO23 = new DesertDTO(543, "Guban", "Northern America", 3243.242, 10.32, 12.423);
		DesertService desertService23 = new DesertServiceImpl(desertRepository);

		try {
			boolean save = desertService.validateAndThenSave(desertDTO);
			System.out.println(save);
			System.out.println("-----------");
			boolean save2 = desertService.validateAndThenSave(desertDTO2);
			System.out.println(save2);
			System.out.println("-----------");

			boolean save3 = desertService.validateAndThenSave(desertDTO3);
			System.out.println(save3);
			System.out.println("-----------");

			boolean save4 = desertService.validateAndThenSave(desertDTO4);
			System.out.println(save4);
			System.out.println("-----------");

			boolean save5 = desertService.validateAndThenSave(desertDTO5);
			System.out.println(save5);
			System.out.println("-----------");

			boolean save6 = desertService.validateAndThenSave(desertDTO6);
			System.out.println(save6);
			System.out.println("-----------");

			boolean save7 = desertService.validateAndThenSave(desertDTO7);
			System.out.println(save7);
			System.out.println("-----------");

			boolean save8 = desertService.validateAndThenSave(desertDTO8);
			System.out.println(save8);
			System.out.println("-----------");

			boolean save9 = desertService.validateAndThenSave(desertDTO9);
			System.out.println(save9);
			System.out.println("-----------");

			boolean save10 = desertService.validateAndThenSave(desertDTO10);
			System.out.println(save10);
			System.out.println("-----------");

			boolean save11 = desertService.validateAndThenSave(desertDTO11);
			System.out.println(save11);
			System.out.println("-----------");

			boolean save12 = desertService.validateAndThenSave(desertDTO12);
			System.out.println(save12);
			System.out.println("-----------");

			boolean save13 = desertService.validateAndThenSave(desertDTO13);
			System.out.println(save13);
			System.out.println("-----------");

			boolean save14 = desertService.validateAndThenSave(desertDTO14);
			System.out.println(save14);
			System.out.println("-----------");

			boolean save15 = desertService.validateAndThenSave(desertDTO15);
			System.out.println(save15);
			System.out.println("-----------");

			boolean save16 = desertService.validateAndThenSave(desertDTO16);
			System.out.println(save16);
			System.out.println("-----------");

			boolean save17 = desertService.validateAndThenSave(desertDTO17);
			System.out.println(save17);
			System.out.println("-----------");

			boolean save18 = desertService.validateAndThenSave(desertDTO18);
			System.out.println(save18);
			System.out.println("-----------");

			boolean save19 = desertService.validateAndThenSave(desertDTO19);
			System.out.println(save19);
			System.out.println("-----------");

			boolean save20 = desertService.validateAndThenSave(desertDTO20);
			System.out.println(save20);
			System.out.println("-----------");

			boolean save21 = desertService.validateAndThenSave(desertDTO21);
			System.out.println(save21);
			System.out.println("-----------");

			boolean save22 = desertService.validateAndThenSave(desertDTO22);
			System.out.println(save22);
			System.out.println("-----------");

			boolean save23 = desertService.validateAndThenSave(desertDTO23);
			System.out.println(save23);
		} catch (InvaliedDesertException e) {
			System.out.println("InvaliedDesertException :" + e.getMessage());

		}

		System.out.println(desertService.fineAreaByName("Namib"));
		System.out.println(desertService.findByNameAndConutryAndArea("Namib", "South Africa", 13322.432));
		System.out.println(desertService.find(desertDTO));
		System.out.println(desertService.findByName("Namib"));

		System.out.println("------------");

		System.out.println(desertService2.fineAreaByName("Sahara"));
		System.out.println(desertService2.findByNameAndConutryAndArea("Sahara", "Algeria", 3243.242));
		System.out.println(desertService2.find(desertDTO2));
		System.out.println(desertService2.findByName("Sahara"));

		System.out.println("------------");

		System.out.println(desertService3.fineAreaByName("Atacama"));
		System.out.println(desertService3.findByNameAndConutryAndArea("Atacama", "Algentina", 3243.242));
		System.out.println(desertService3.find(desertDTO3));
		System.out.println(desertService3.findByName("Atacama"));

		System.out.println("------------");

		System.out.println(desertService4.fineAreaByName("Kalahari"));
		System.out.println(desertService4.findByNameAndConutryAndArea("Kalahari", "Africa", 3243.242));
		System.out.println(desertService4.find(desertDTO4));
		System.out.println(desertService4.findByName("Kalahari"));

		System.out.println("------------");

		System.out.println(desertService5.fineAreaByName("Arabian"));
		System.out.println(desertService5.findByNameAndConutryAndArea("Arabian", "Yemen", 3243.242));
		System.out.println(desertService5.find(desertDTO5));
		System.out.println(desertService5.findByName("Arabian"));
		System.out.println("------------");

		System.out.println(desertService6.fineAreaByName("Gobi"));
		System.out.println(desertService6.findByNameAndConutryAndArea("Gobi", "China", 3243.242));
		System.out.println(desertService6.find(desertDTO6));
		System.out.println(desertService6.findByName("Gobi"));

		System.out.println("------------");

		System.out.println(desertService7.fineAreaByName("Great Victoria"));
		System.out.println(desertService7.findByNameAndConutryAndArea("Great Victoria", "Australia", 3243.242));
		System.out.println(desertService7.find(desertDTO7));
		System.out.println(desertService7.findByName("Great Victoria"));

		System.out.println("------------");

		System.out.println(desertService8.fineAreaByName("Patagonian"));
		System.out.println(desertService8.findByNameAndConutryAndArea("Patagonian", "Algentina", 3243.242));
		System.out.println(desertService8.find(desertDTO8));
		System.out.println(desertService8.findByName("Patagonian"));

		System.out.println("------------");

		System.out.println(desertService9.fineAreaByName("Thar"));
		System.out.println(desertService9.findByNameAndConutryAndArea("Thar", "India", 3243.242));
		System.out.println(desertService9.find(desertDTO9));
		System.out.println(desertService9.findByName("Thar"));

		System.out.println("------------");

		System.out.println(desertService10.fineAreaByName("Takla Makan"));
		System.out.println(desertService10.findByNameAndConutryAndArea("Takla Makan", "China", 3243.242));
		System.out.println(desertService10.find(desertDTO10));
		System.out.println(desertService10.findByName("Takla Makan"));

		System.out.println("------------");

		System.out.println(desertService11.fineAreaByName("Syrian"));
		System.out.println(desertService11.findByNameAndConutryAndArea("Syrian", "Soudi Arabia", 3243.242));
		System.out.println(desertService11.find(desertDTO11));
		System.out.println(desertService11.findByName("Syrian"));

		System.out.println("------------");

		System.out.println(desertService12.fineAreaByName("Mojave"));
		System.out.println(desertService12.findByNameAndConutryAndArea("Mojave", "United States", 3243.242));
		System.out.println(desertService12.find(desertDTO12));
		System.out.println(desertService12.findByName("Mojave"));

		System.out.println("------------");

		System.out.println(desertService13.fineAreaByName("Greadt Basin"));
		System.out.println(desertService13.findByNameAndConutryAndArea("Greadt Basin", "United States", 3243.242));
		System.out.println(desertService13.find(desertDTO13));
		System.out.println(desertService13.findByName("Greadt Basin"));

		System.out.println("------------");

		System.out.println(desertService14.fineAreaByName("Karakum"));
		System.out.println(desertService14.findByNameAndConutryAndArea("Karakum", "Turkmenistan", 3243.242));
		System.out.println(desertService14.find(desertDTO14));
		System.out.println(desertService14.findByName("Karakum"));

		System.out.println("------------");

		System.out.println(desertService15.fineAreaByName("Antarctic"));
		System.out.println(desertService15.findByNameAndConutryAndArea("Antarctic", "Antarctic", 3243.242));
		System.out.println(desertService15.find(desertDTO15));
		System.out.println(desertService15.findByName("Antarctic"));

		System.out.println("------------");

		System.out.println(desertService16.fineAreaByName("Arctic"));
		System.out.println(desertService16.findByNameAndConutryAndArea("Arctic", "Europ", 3243.242));
		System.out.println(desertService16.find(desertDTO16));
		System.out.println(desertService16.findByName("Arctic"));

		System.out.println("------------");

		System.out.println(desertService17.fineAreaByName("Chihuahuan"));
		System.out.println(desertService17.findByNameAndConutryAndArea("Chihuahuan", "Northern America", 3243.242));
		System.out.println(desertService17.find(desertDTO17));
		System.out.println(desertService17.findByName("Chihuahuan"));

		System.out.println("------------");

		System.out.println(desertService18.fineAreaByName("Colorado Plateau"));
		System.out
				.println(desertService18.findByNameAndConutryAndArea("Colorado Plateau", "Northern America", 3243.242));
		System.out.println(desertService18.find(desertDTO18));
		System.out.println(desertService18.findByName("Colorado Plateau"));

		System.out.println("----181818--------");

		System.out.println(desertService19.fineAreaByName("Sonoran"));
		System.out.println(desertService19.findByNameAndConutryAndArea("Sonoran", "Northern America", 3243.242));
		System.out.println(desertService19.find(desertDTO19));
		System.out.println(desertService19.findByName("Sonoran"));

		System.out.println("------------");

		System.out.println(desertService20.fineAreaByName("Kyzylkum"));
		System.out.println(desertService20.findByNameAndConutryAndArea("Kyzylkum", "Central Asia", 3243.242));
		System.out.println(desertService20.find(desertDTO20));
		System.out.println(desertService20.findByName("Kyzylkum"));

		System.out.println("------------");

		System.out.println(desertService21.fineAreaByName("Taklamakan"));
		System.out.println(desertService21.findByNameAndConutryAndArea("Taklamakan", "Eastern Asia", 3243.242));
		System.out.println(desertService21.find(desertDTO21));
		System.out.println(desertService21.findByName("Taklamakan"));

		System.out.println("------------");

		System.out.println(desertService22.fineAreaByName("Ogden"));
		System.out.println(desertService22.findByNameAndConutryAndArea("Ogden", "Eastern America", 3243.242));
		System.out.println(desertService22.find(desertDTO22));
		System.out.println(desertService22.findByName("Ogden"));

		System.out.println("------------");

		System.out.println(desertService.fineAreaByName("Namib"));
		System.out.println(desertService.findByNameAndConutryAndArea("Namib", "South Africa", 13322.432));
		System.out.println(desertService.find(desertDTO));
		System.out.println(desertService.findByName("Namib"));

		System.out.println("Total saved is:" + desertService.total());
	}
}
