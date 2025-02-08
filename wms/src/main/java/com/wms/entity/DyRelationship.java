package com.wms.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.*;

@Data
@Builder
@RelationshipProperties
public class DyRelationship {
    @Id
    Long id;

    @TargetNode
    private  EacNode eacNode;
}

