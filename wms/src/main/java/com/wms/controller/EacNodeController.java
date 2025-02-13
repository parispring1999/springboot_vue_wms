package com.wms.controller;

import com.wms.entity.EacNode;

import com.wms.service.repo.reposervice.EacNodeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eac_node")
public class EacNodeController {
    @Autowired
    private EacNodeService eacNodeService;

    @GetMapping("/get_all_eac_node")
    public List<EacNode> getAllEacNode(){
        return eacNodeService.getAllEacNode();
    }

    @GetMapping("/get_eac_node")
    public EacNode getEacNode(@RequestParam("id")String id){
        return eacNodeService.getEacNodeById(id);
    }


    @PostMapping("/add_eac_node")
    public EacNode addEacNode(@RequestParam("id")String id){
        return eacNodeService.addEacNode(id);
    }

    @DeleteMapping("/delete_eac_node")
    public void deleteEacNode(@RequestParam("id")String id){
        eacNodeService.deleteEacNode(id);
    }
}
