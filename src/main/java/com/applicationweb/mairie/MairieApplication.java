package com.applicationweb.mairie;

//import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.applicationweb.mairie.model.Department;
import com.applicationweb.mairie.model.Region;
import com.applicationweb.mairie.repository.Departmentrepository;
import com.applicationweb.mairie.repository.Regionrepository;
import com.applicationweb.mairie.service.AddressService;
import com.applicationweb.mairie.service.CommuneService;
import com.applicationweb.mairie.service.DepartmentService;
import com.applicationweb.mairie.service.RegionService;

@SpringBootApplication
public class MairieApplication implements CommandLineRunner {

	@Autowired
	public RegionService regionService;
	
	@Autowired
	private Regionrepository regionrepository;

	@Autowired
	public DepartmentService departmentService;
	
	@Autowired
	private Departmentrepository departmentrepository;
	@Autowired
	public CommuneService communeService;
	@Autowired
	private AddressService addressService;

//	public CommuneService communeService; 
	public static void main(String[] args) {
		SpringApplication.run(MairieApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String regions[] = { "Adamaoua", "Centre", "Est", "Extreme Nord", "Littoral", "Nord", "Nord Ouest", "Ouest",
				"Sud", "Sud Ouest"
		};

		for (String region : regions) {
			if(regionrepository.existsByNomRegion(region)) {
				System.out.println("Region :" +region+" already exists !");
			}else {
				regionrepository.save(new Region(region));
			}
		}
		
		String departments[] = {"Bamboutos", "Haut-Nkam", "Hauts-Plateaux", "Koun-Khi", "Menoua", "Mifi","Nde", "Noun"
				
		};
		
		Region Ouest = regionrepository.findByNomRegion("Ouest").get();
		
		for (String department : departments) {
			if(departmentrepository.existsByNomDepartement(department)) {
				System.out.println("department :" +department+"already exists!");
			}else {
				departmentrepository.save(new Department(department , Ouest));
			}
		}
		
		
		
		
		
		// Address ad = new Address();
		// ad.setVille("dschang");
		// ad.setContact("2535");
		// ad.setEmail("chancelle@gmail.com");
		// ad.setQuartier("aja");
		// this.addressService.saveaddress(ad);
		// departmentService.savedepartment(new Department("NDE",new ArrayList<>()));
		// Commune commune = new Commune();
		// communeService.savecommune(new Commune("Bangangté"));

	}

}
