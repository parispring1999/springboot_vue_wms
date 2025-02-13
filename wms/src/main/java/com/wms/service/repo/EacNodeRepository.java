package com.wms.service.repo;

import com.wms.entity.EacNode;


import org.springframework.data.neo4j.repository.Neo4jRepository;

import org.springframework.stereotype.Repository;



@Repository
public interface EacNodeRepository extends Neo4jRepository<EacNode, Long> {
    EacNode findEacNodeById(String id);
}
