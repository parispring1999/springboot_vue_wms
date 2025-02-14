package com.wms.controller;


import com.wms.entity.TNode;
import com.wms.service.repo.reposervice.TNodeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/t_node")
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

    @PostMapping("/add_t_node")
    public TNode addTNode(@RequestParam("id")String id){
        return tNodeService.addTNode(id);
    }

    @DeleteMapping("/delete_t_node")
    public void deleteTNode(@RequestParam("id")String id){
        tNodeService.deleteTNode(id);
    }
}
