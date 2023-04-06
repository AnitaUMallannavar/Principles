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

		DesertDTO desertDTO3 = new DesertDTO(543, "Atacama", "Algentina", 3243.242, 10.32, 12.423);

		DesertDTO desertDTO4 = new DesertDTO(543, "Kalahari", "Africa", 3243.242, 10.32, 12.423);

		DesertDTO desertDTO5 = new DesertDTO(543, "Arabian", "Yemen", 3243.242, 10.32, 12.423);

		DesertDTO desertDTO6 = new DesertDTO(543, "Gobi", "China", 3243.242, 10.32, 12.423);

		DesertDTO desertDTO7 = new DesertDTO(543, "Great Victoria", "Australia", 3243.242, 10.32, 12.423);

		DesertDTO desertDTO8 = new DesertDTO(543, "Patagonian", "Algentina", 3243.242, 10.32, 12.423);

		DesertDTO desertDTO9 = new DesertDTO(543, "Thar", "India", 3243.242, 10.32, 12.423);

		DesertDTO desertDTO10 = new DesertDTO(543, "Takla Makan", "China", 3243.242, 10.32, 12.423);

		DesertDTO desertDTO11 = new DesertDTO(543, "Syrian", "Soudi Arabia", 3243.242, 10.32, 12.423);

		DesertDTO desertDTO12 = new DesertDTO(543, "Mojave", "United States", 3243.242, 10.32, 12.423);

		DesertDTO desertDTO13 = new DesertDTO(543, "Greadt Basin", "United States", 3243.242, 10.32, 12.423);

		DesertDTO desertDTO14 = new DesertDTO(543, "Karakum", "Turkmenistan", 3243.242, 10.32, 12.423);

		DesertDTO desertDTO15 = new DesertDTO(543, "Antarctic", "Antarctic", 3243.242, 10.32, 12.423);

		DesertDTO desertDTO16 = new DesertDTO(543, "Arctic", "Europ", 3243.242, 10.32, 12.423);

		DesertDTO desertDTO17 = new DesertDTO(543, "Chihuahuan", "Northern America", 3243.242, 10.32, 12.423);

		DesertDTO desertDTO18 = new DesertDTO(543, "Colorado Plateau", "Northern America", 3243.242, 10.32, 12.423);

		DesertDTO desertDTO19 = new DesertDTO(543, "Sonoran", "Northern America", 3243.242, 10.32, 12.423);

		DesertDTO desertDTO20 = new DesertDTO(543, "Kyzylkum", "Central Asia", 3243.242, 10.32, 12.423);

		DesertDTO desertDTO21 = new DesertDTO(543, "Taklamakan", "Eastern Asia", 3243.242, 10.32, 12.423);

		DesertDTO desertDTO22 = new DesertDTO(543, "Ogden", "Eastern America", 3243.242, 10.32, 12.423);

		DesertDTO desertDTO23 = new DesertDTO(543, "Guban", "Northern America", 3243.242, 10.32, 12.423);

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

		System.out.println(desertService.fineAreaByName("Sahara"));
		System.out.println(desertService.findByNameAndConutryAndArea("Sahara", "Algeria", 3243.242));
		System.out.println(desertService.find(desertDTO2));
		System.out.println(desertService.findByName("Sahara"));

		System.out.println("------------");

		System.out.println(desertService.fineAreaByName("Atacama"));
		System.out.println(desertService.findByNameAndConutryAndArea("Atacama", "Algentina", 3243.242));
		System.out.println(desertService.find(desertDTO3));
		System.out.println(desertService.findByName("Atacama"));

		System.out.println("------------");

		System.out.println(desertService.fineAreaByName("Kalahari"));
		System.out.println(desertService.findByNameAndConutryAndArea("Kalahari", "Africa", 3243.242));
		System.out.println(desertService.find(desertDTO4));
		System.out.println(desertService.findByName("Kalahari"));

		System.out.println("------------");

		System.out.println(desertService.fineAreaByName("Arabian"));
		System.out.println(desertService.findByNameAndConutryAndArea("Arabian", "Yemen", 3243.242));
		System.out.println(desertService.find(desertDTO5));
		System.out.println(desertService.findByName("Arabian"));
		System.out.println("------------");

		System.out.println(desertService.fineAreaByName("Gobi"));
		System.out.println(desertService.findByNameAndConutryAndArea("Gobi", "China", 3243.242));
		System.out.println(desertService.find(desertDTO6));
		System.out.println(desertService.findByName("Gobi"));

		System.out.println("------------");

		System.out.println(desertService.fineAreaByName("Great Victoria"));
		System.out.println(desertService.findByNameAndConutryAndArea("Great Victoria", "Australia", 3243.242));
		System.out.println(desertService.find(desertDTO7));
		System.out.println(desertService.findByName("Great Victoria"));

		System.out.println("------------");

		System.out.println(desertService.fineAreaByName("Patagonian"));
		System.out.println(desertService.findByNameAndConutryAndArea("Patagonian", "Algentina", 3243.242));
		System.out.println(desertService.find(desertDTO8));
		System.out.println(desertService.findByName("Patagonian"));

		System.out.println("------------");

		System.out.println(desertService.fineAreaByName("Thar"));
		System.out.println(desertService.findByNameAndConutryAndArea("Thar", "India", 3243.242));
		System.out.println(desertService.find(desertDTO9));
		System.out.println(desertService.findByName("Thar"));

		System.out.println("------------");

		System.out.println(desertService.fineAreaByName("Takla Makan"));
		System.out.println(desertService.findByNameAndConutryAndArea("Takla Makan", "China", 3243.242));
		System.out.println(desertService.find(desertDTO10));
		System.out.println(desertService.findByName("Takla Makan"));

		System.out.println("------------");

		System.out.println(desertService.fineAreaByName("Syrian"));
		System.out.println(desertService.findByNameAndConutryAndArea("Syrian", "Soudi Arabia", 3243.242));
		System.out.println(desertService.find(desertDTO11));
		System.out.println(desertService.findByName("Syrian"));

		System.out.println("------------");

		System.out.println(desertService.fineAreaByName("Mojave"));
		System.out.println(desertService.findByNameAndConutryAndArea("Mojave", "United States", 3243.242));
		System.out.println(desertService.find(desertDTO12));
		System.out.println(desertService.findByName("Mojave"));

		System.out.println("------------");

		System.out.println(desertService.fineAreaByName("Greadt Basin"));
		System.out.println(desertService.findByNameAndConutryAndArea("Greadt Basin", "United States", 3243.242));
		System.out.println(desertService.find(desertDTO13));
		System.out.println(desertService.findByName("Greadt Basin"));

		System.out.println("------------");

		System.out.println(desertService.fineAreaByName("Karakum"));
		System.out.println(desertService.findByNameAndConutryAndArea("Karakum", "Turkmenistan", 3243.242));
		System.out.println(desertService.find(desertDTO14));
		System.out.println(desertService.findByName("Karakum"));

		System.out.println("------------");

		System.out.println(desertService.fineAreaByName("Antarctic"));
		System.out.println(desertService.findByNameAndConutryAndArea("Antarctic", "Antarctic", 3243.242));
		System.out.println(desertService.find(desertDTO15));
		System.out.println(desertService.findByName("Antarctic"));

		System.out.println("------------");

		System.out.println(desertService.fineAreaByName("Arctic"));
		System.out.println(desertService.findByNameAndConutryAndArea("Arctic", "Europ", 3243.242));
		System.out.println(desertService.find(desertDTO16));
		System.out.println(desertService.findByName("Arctic"));

		System.out.println("------------");

		System.out.println(desertService.fineAreaByName("Chihuahuan"));
		System.out.println(desertService.findByNameAndConutryAndArea("Chihuahuan", "Northern America", 3243.242));
		System.out.println(desertService.find(desertDTO17));
		System.out.println(desertService.findByName("Chihuahuan"));

		System.out.println("------------");

		System.out.println(desertService.fineAreaByName("Colorado Plateau"));
		System.out.println(desertService.findByNameAndConutryAndArea("Colorado Plateau", "Northern America", 3243.242));
		System.out.println(desertService.find(desertDTO18));
		System.out.println(desertService.findByName("Colorado Plateau"));

		System.out.println("----181818--------");

		System.out.println(desertService.fineAreaByName("Sonoran"));
		System.out.println(desertService.findByNameAndConutryAndArea("Sonoran", "Northern America", 3243.242));
		System.out.println(desertService.find(desertDTO19));
		System.out.println(desertService.findByName("Sonoran"));

		System.out.println("------------");

		System.out.println(desertService.fineAreaByName("Kyzylkum"));
		System.out.println(desertService.findByNameAndConutryAndArea("Kyzylkum", "Central Asia", 3243.242));
		System.out.println(desertService.find(desertDTO20));
		System.out.println(desertService.findByName("Kyzylkum"));

		System.out.println("------------");

		System.out.println(desertService.fineAreaByName("Taklamakan"));
		System.out.println(desertService.findByNameAndConutryAndArea("Taklamakan", "Eastern Asia", 3243.242));
		System.out.println(desertService.find(desertDTO21));
		System.out.println(desertService.findByName("Taklamakan"));

		System.out.println("------------");

		System.out.println(desertService.fineAreaByName("Ogden"));
		System.out.println(desertService.findByNameAndConutryAndArea("Ogden", "Eastern America", 3243.242));
		System.out.println(desertService.find(desertDTO22));
		System.out.println(desertService.findByName("Ogden"));

		System.out.println("------------");

		
		System.out.println(desertService.fineAreaByName("Namib"));
		System.out.println(desertService.findByNameAndConutryAndArea("ogden", "South Africa", 13322.432));
		System.out.println(desertService.find(desertDTO23));
		System.out.println(desertService.findByName("Namib"));

		System.out.println("Total saved is:" + desertService.total());
	}
}
