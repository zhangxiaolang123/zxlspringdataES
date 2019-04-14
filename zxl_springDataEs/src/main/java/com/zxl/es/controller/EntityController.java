package com.zxl.es.controller;

import com.zxl.es.entity.Entity;
import com.zxl.es.service.CityESService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/entityController")
public class EntityController {
	
	
	@Autowired
	CityESService cityESService;
	
	@RequestMapping(value="/save", method=RequestMethod.GET)
	public String save(long id, String name) {
		if(id>0 && StringUtils.isNotEmpty(name)) {
			cityESService.saveEntity(new Entity(id,name));
			return "OK";
		}else {
			return "Bad input value";
		}
	}
	
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public List<Entity> save(String name) {
		List<Entity> entityList = null;
		if(StringUtils.isNotEmpty(name)) {
			entityList = cityESService.searchEntity(0, 0, name);
		}
		return entityList;
	}
}
