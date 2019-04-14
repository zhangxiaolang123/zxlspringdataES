package com.zxl.es.entity;

import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

@Document(indexName="index_entity", type="tstype")
public class Entity implements Serializable{

	private static final long serialVersionUID = -763638353551774166L;

	private Long id;
	
	private String name;
	
	public Entity() {
		super();
	}
	
	public Entity(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
