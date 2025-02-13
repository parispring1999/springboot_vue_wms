package com.wms.service.repo.reposervice;

import com.wms.entity.EacNode;
import com.wms.entity.TNode;

import com.wms.service.repo.TNodeRepository;
import org.neo4j.driver.internal.value.PathValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TNodeService {
    @Autowired
    private TNodeRepository tNodeRepository;

    public List<TNode> getAllTNode(){
        return tNodeRepository.findAll();
    }

    public TNode getTNodeById(String id){
        return tNodeRepository.findTNodeById(id);
    }
    public List<PathValue> getRelationshipById(String id){
        return tNodeRepository.findRelationshipById(id);
    }
    public List<EacNode> getRelatedNodeById(String id){
        return tNodeRepository.findRelatedNodeById(id);
    }

    public TNode addTNode(String id){
        return tNodeRepository.save(TNode.builder().id(id).build());
    }

    public void deleteTNode(String id){
        tNodeRepository.delete(getTNodeById(id));
    }
}
