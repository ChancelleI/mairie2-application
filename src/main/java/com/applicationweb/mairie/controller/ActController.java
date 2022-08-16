package com.applicationweb.mairie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.applicationweb.mairie.model.Act;
import com.applicationweb.mairie.model.Birth;
import com.applicationweb.mairie.model.Death;
import com.applicationweb.mairie.model.Wedding;
import com.applicationweb.mairie.service.ActService;

@RestController
public class ActController {
	@Autowired
	private ActService actService;
	
	@PostMapping("/saveAct")
	public Act saveAct(@RequestBody Act act) {
		actService.saveact(act);
		return actService.saveact(act);
	}
	
	@PostMapping("/saveBirth")
	public Birth saveBirth(@RequestBody Birth birth) {
		actService.savebirth(birth);
		return actService.savebirth(birth);
		
		}
	@PostMapping("/saveDeath")
	public Death saveDeath(@RequestBody Death death) {
		actService.savedeath(death);
		return actService.savedeath(death);
	}
	
	@PostMapping("/saveWedding")
	public Wedding saveWedding(@RequestBody Wedding wedding) {
		actService.savewedding(wedding);
		return actService.savewedding(wedding);
	}

}
