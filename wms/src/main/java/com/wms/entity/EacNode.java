package com.wms.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Data
@Builder
@Node("EAC")
public class EacNode {
    @Id
    Long id0;

    @Property(name = "id")
    private String id;

    @Property(name = "name")
    private String name;

    @Property(name = "description")
    private String des;
}