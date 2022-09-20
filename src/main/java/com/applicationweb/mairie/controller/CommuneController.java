package com.applicationweb.mairie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.applicationweb.mairie.model.Address;
import com.applicationweb.mairie.model.Commune;
import com.applicationweb.mairie.model.Department;
import com.applicationweb.mairie.model.Region;
import com.applicationweb.mairie.service.AddressService;
import com.applicationweb.mairie.service.CommuneService;
import com.applicationweb.mairie.service.DepartmentService;

@Controller
public class CommuneController {
	
	@Autowired
	private CommuneService communeService;
	@Autowired
	private AddressService addressService;
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(value="/mairie", method = RequestMethod.GET)
	public String commune(Model model) {
		Address address = new Address(); 
		Commune commune = new Commune();
		commune .setAddress(address);
		Department department = new Department(null, null);
		commune.setDepartment(department);
		model.addAttribute("commune", commune);
		
		List<Department> listdepartment = departmentService.getAllDepartment();
		model.addAttribute("departmentList", listdepartment);
		
		List<Commune> list = communeService.getAllCommune();
		model.addAttribute("communeList", list);
		
		return "mairie";
	}
	
	@PostMapping("/saveCommune")
	public String saveCommune(@ModelAttribute("commune") Commune commune) {
		System.out.println("Commune : "+commune);
		System.out.println("Departement : "+commune.getDepartment());
		communeService.savecommune(commune);
		return "redirect:/mairie";
	}
	
	//@GetMapping("/deletecom/{id}")
	//public String deleteCommune(@PathVariable(value = "id") Long id) {
		//this.communeService.deleteCommuneById(id);
		//return "redirect:/";
	//}

	@GetMapping("/deleteCommune/{id}")
    public String deleteCommune(@PathVariable(value = "id") long id) {

        // call delete employee method 
        this.communeService.deleteCommuneById(id);
        return "redirect:/mairie";
    }
}
