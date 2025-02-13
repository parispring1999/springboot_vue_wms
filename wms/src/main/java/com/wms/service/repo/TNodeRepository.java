package com.wms.service.repo;

import com.wms.entity.EacNode;
import com.wms.entity.TNode;
import org.neo4j.driver.internal.value.PathValue;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TNodeRepository extends Neo4jRepository<TNode, Long> {
    TNode findTNodeById(String id);
    @Query(value = "match p=(s:T)-[r:技术对应活动]-() where s.name={0} return p")
    List<PathValue> findRelationshipById(String id);
    @Query(value = "MATCH (s:T)-[r:技术对应活动]-(n) WHERE s.name = {0} RETURN n")
    List<EacNode> findRelatedNodeById(String id);
}
