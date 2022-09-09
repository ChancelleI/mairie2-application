package com.applicationweb.mairie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.applicationweb.mairie.model.Region;
import com.applicationweb.mairie.service.RegionService;



@Controller
@RequestMapping("region")
public class RegionController {
	@Autowired
	private RegionService regionService;
	
	@PostMapping("/save")
	public Region saveRegion(@RequestBody Region region) {
		regionService.saveregion(region);
		 return regionService.saveregion(region);
}

@GetMapping("/deleteRegion/{id}")
public String deleteRegion(@PathVariable(value = "id") Long id) {
    this.regionService.deleteRegionById(id);
    return "redirect:/";
}

@GetMapping("/listRegion")
public List<Region> getAllregion(){
	return regionService.getAllRegion();
	}

}
