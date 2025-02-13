package com.wms.controller;

import com.wms.entity.EacNode;
import com.wms.entity.TNode;
import com.wms.service.repo.reposervice.TNodeService;
import org.neo4j.driver.internal.value.PathValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tnode")
public class TNodeController {
    @Autowired
    private TNodeService tNodeService;

    @GetMapping("/get_all_t_node")
    public List<TNode> getAllTNode(){
        return tNodeService.getAllTNode();
    }

    @GetMapping("/get_t_node")
    public TNode getTNode(@RequestParam("id")String id){
        return tNodeService.getTNodeById(id);
    }

    @GetMapping("/get_relationship")
    public List<PathValue> getRelationship(@RequestParam("id")String id){
        return tNodeService.getRelationshipById(id);
    }

    @GetMapping("/get_related_node")
    public List<EacNode> getRelatedNode(@RequestParam("id")String id){
        return tNodeService.getRelatedNodeById(id);
    }

    @PostMapping("/add_t_node")
    public TNode addTNode(@RequestParam("id")String id){
        return tNodeService.addTNode(id);
    }

    @DeleteMapping("/delete_t_node")
    public void deleteTNode(@RequestParam("id")String id){
        tNodeService.deleteTNode(id);
    }
}
