package com.applicationweb.mairie;



import java.util.ArrayList;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.applicationweb.mairie.model.Department;
import com.applicationweb.mairie.model.Region;
import com.applicationweb.mairie.service.DepartmentService;
import com.applicationweb.mairie.service.RegionService;


@SpringBootApplication
public class MairieApplication implements CommandLineRunner{

	@Autowired
	public RegionService regionService;
	
	@Autowired
	public DepartmentService departmentService;
	
	
//	public CommuneService communeService; 
	public static void main(String[] args) {
		SpringApplication.run(MairieApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		regionService.saveregion(new Region("ouest",new ArrayList<>()));
		departmentService.savedepartment(new Department("NDE",new ArrayList<>()));
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
