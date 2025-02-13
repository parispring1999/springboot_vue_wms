package com.wms.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.*;

@Data
@Builder
@RelationshipProperties
public class DyRelationship {
    @Id
    @GeneratedValue
    Long id0;

    @TargetNode
    private  EacNode eacNode;
}

