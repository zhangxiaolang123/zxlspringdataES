package com.zxl.es.service;


import com.zxl.es.entity.Entity;

import java.util.List;

public interface CityESService {
	
	Long saveEntity(Entity entity);
	
	List<Entity> searchEntity(int pageNumber, int pageSize, String searchContent);
}
