/**
 * 
 */
package com.apress.isf.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.apress.isf.java.model.Document;
import com.apress.isf.java.model.Type;
import com.apress.isf.java.service.SearchEngine;

/**
 * @author Felipe Gutierrez
 *
 */
@Service
public class ServiceSearchEngine implements SearchEngine {
	
	public List<Document> findByType(Type documentType) {
		
		return null;
	}

	
	public List<Document> listAll() {
		
		return null;
	}

}
