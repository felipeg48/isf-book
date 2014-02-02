/**
 * 
 */
package com.apress.isf.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.apress.isf.java.model.Document;
import com.apress.isf.java.model.Type;
import com.apress.isf.java.service.SearchEngine;
import com.apress.isf.spring.data.TypeDataDAO;

/**
 * @author Felipe Gutierrez
 *
 */
@Service
public class ServiceSearchEngine implements SearchEngine {
	
	private TypeDataDAO typeDataDAO;


	public TypeDataDAO getTypeDataDAO() {
		return typeDataDAO;
	}


	public void setTypeDataDAO(TypeDataDAO typeDataDAO) {
		this.typeDataDAO = typeDataDAO;
	}


	public List<Document> findByType(Type documentType) {
		
		return null;
	}

	
	public List<Document> listAll() {
		
		return null;
	}

}
