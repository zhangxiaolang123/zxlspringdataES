package com.zxl.es.repository;

import com.zxl.es.entity.Entity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Entity ES操作类
 * @author yejingtao
 *
 */
public interface EntityRepository extends ElasticsearchRepository<Entity,Long>{

}
