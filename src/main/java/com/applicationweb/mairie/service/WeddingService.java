package com.applicationweb.mairie.service;

import java.util.List;

import com.applicationweb.mairie.model.Wedding;

public interface WeddingService {
	public Wedding savewedding(Wedding wedding);
	boolean deleteWeddingById(Long id);
	public List<Wedding>getAllWedding();
	public Wedding getWeddingByid(Long id);

}
