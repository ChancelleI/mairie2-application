package com.applicationweb.mairie.service;

import java.util.List;

import com.applicationweb.mairie.model.Document;


public interface DocumentService {
	
	public Document savedocument(Document document);
	boolean deleteDocumentById(Long id);
	public List<Document>getAllDocument();
	public Document getDocumentByid(Long id);

}
