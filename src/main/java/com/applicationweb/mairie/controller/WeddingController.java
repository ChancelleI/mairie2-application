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

import com.applicationweb.mairie.model.Commune;
import com.applicationweb.mairie.model.Wedding;
import com.applicationweb.mairie.repository.Communerepository;
import com.applicationweb.mairie.repository.Personrepository;
import com.applicationweb.mairie.service.WeddingService;

@Controller
public class WeddingController {

	@Autowired
	Communerepository communerepository;
	
	@Autowired
	Personrepository personrepository;

	@Autowired
	private WeddingService weddingService;

	@RequestMapping(value = "/mariage", method = RequestMethod.GET)
	public String wedding(Model model) {

		Wedding wedding = new Wedding();
		
		model.addAttribute("wedding", wedding);

		List<Wedding> list = weddingService.getAllWedding();
		model.addAttribute("weddingList", list);

		List<Commune> listC = communerepository.findAll();
		model.addAttribute("communeList", listC);

		return "/mariage";
	}

	@PostMapping("/saveWedding")
	public String saveWedding(@ModelAttribute("wedding") Wedding wedding) {

		Commune c = wedding.getCommune();
		wedding.setCommune(c);
		System.out.println(wedding);
		communerepository.save(c);

		System.out.println(wedding);
		weddingService.savewedding(wedding);
		return "redirect:/mariage";
	}
	
	@GetMapping("/deleteWedding/{id}")
    public String deleteWedding(@PathVariable(value = "id") long id) {

        // call delete employee method 
        this.weddingService.deleteWeddingById(id);
        return "redirect:/naisance";
    }

}
