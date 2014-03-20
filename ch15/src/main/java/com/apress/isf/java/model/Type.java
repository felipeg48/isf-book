/**
 * 
 */
package com.apress.isf.java.model;

import org.springframework.data.annotation.Id;

/**
 * @author Felipe Gutierrez
 *
 */
@org.springframework.data.mongodb.core.mapping.Document(collection="mydocuments")
public class Type {
	
	@Id
	private String typeId;
	private String name;	
	private String desc;
	private String extension;
	
	public Type(){
		this.typeId = java.util.UUID.randomUUID().toString();
	}
	
	public Type(String name,String extension){
		this.typeId = java.util.UUID.randomUUID().toString();
		this.name = name;
		this.extension = extension;
	}
	
	public Type(String name,String extension, String description){
		this.typeId = java.util.UUID.randomUUID().toString();
		this.name = name;
		this.desc = description;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
	
	public String toString(){
		StringBuilder builder = new StringBuilder("Type(");
		builder.append("id: ");
		builder.append(typeId);
		builder.append(", name: ");
		builder.append(name);
		builder.append(", description: ");
		builder.append(desc);
		builder.append(", extension: ");
		builder.append(extension);
		builder.append(")");
		return builder.toString();
	}
}
