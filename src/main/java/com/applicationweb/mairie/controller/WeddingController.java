package com.applicationweb.mairie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.applicationweb.mairie.model.Wedding;
import com.applicationweb.mairie.service.WeddingService;

@RestController
public class WeddingController {
	
	@Autowired
	private WeddingService weddingService;
	
	@PostMapping("/saveWedding")
	public Wedding saveWedding(@RequestBody Wedding wedding) {
		weddingService.savewedding(wedding);
		return weddingService.savewedding(wedding);
	}

}
