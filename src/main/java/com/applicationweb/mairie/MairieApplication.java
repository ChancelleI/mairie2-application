package com.applicationweb.mairie;





//import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.applicationweb.mairie.model.Address;
import com.applicationweb.mairie.model.Region;
import com.applicationweb.mairie.service.AddressService;
import com.applicationweb.mairie.service.CommuneService;
import com.applicationweb.mairie.service.DepartmentService;
import com.applicationweb.mairie.service.RegionService;


@SpringBootApplication
public class MairieApplication implements CommandLineRunner{

	@Autowired
	public RegionService regionService;
	
	@Autowired
	public DepartmentService departmentService;
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
		regionService.saveregion(new Region("ouest"));
		Address ad = new Address();
		ad.setVille("dschang");
		ad.setContact("2535");
		ad.setEmail("chancelle@gmail.com");
		ad.setQuartier("aja");
		this.addressService.saveaddress(ad);
		//departmentService.savedepartment(new Department("NDE",new ArrayList<>()));
		//Commune commune = new Commune();
		//communeService.savecommune(new Commune("Bangangté"));
		
	}
	
	
	
	
	
}
