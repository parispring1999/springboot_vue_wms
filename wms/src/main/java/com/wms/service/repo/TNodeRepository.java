package com.wms.service.repo;


import com.wms.entity.TNode;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TNodeRepository extends Neo4jRepository<TNode, Long> {
    TNode findTNodeById(String id);
}
