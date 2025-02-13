package com.wms.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.*;
import java.util.List;


@Data
@Builder
@Node("T")
public class TNode {
    @Id
    @GeneratedValue
    Long id0;

    @Property(name = "id")
    private String id;

    @Property(name = "name")
    private String name;

    @Property(name = "description")
    private String des;

    @Relationship(type = "技术对应活动", direction = Relationship.Direction.OUTGOING)
    private List<DyRelationship> dyRelationship;
}

