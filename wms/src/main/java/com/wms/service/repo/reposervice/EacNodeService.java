package com.wms.service.repo.reposervice;

import com.wms.entity.EacNode;
import com.wms.entity.TNode;
import com.wms.service.repo.EacNodeRepository;
import com.wms.service.repo.TNodeRepository;
import org.neo4j.driver.internal.value.PathValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EacNodeService {
    @Autowired
    private EacNodeRepository eacNodeRepository;

    public List<EacNode> getAllEacNode(){
        return eacNodeRepository.findAll();
    }

    public EacNode getEacNodeById(String id){
        return eacNodeRepository.findEacNodeById(id);
    }


    public EacNode addEacNode(String id){
        return eacNodeRepository.save(EacNode.builder().id(id).build());
    }

    public void deleteEacNode(String id){
        eacNodeRepository.delete(getEacNodeById(id));
    }
}
