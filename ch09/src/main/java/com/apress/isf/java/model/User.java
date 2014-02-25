/**
 * 
 */
package com.apress.isf.java.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Felipe Gutierrez
 *
 */
public class User {
	private String email;
	private String password;
	private String name;
	List<Document> documents = new ArrayList<Document>();
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Document> getDocuments() {
		return documents;
	}
	
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
	
}
