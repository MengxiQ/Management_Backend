package com.mengxi.manageemp.service;

import com.mengxi.manageemp.dao.ILocationNode;
import com.mengxi.manageemp.domain.locationNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CabinetService {
    @Autowired
    private ILocationNode iLocationNode;
    //递归查询子节点
    private List<locationNode> selectChildren(int parent_id){
        List<locationNode> locationNodes = iLocationNode.getLocationNodesByParent_id(parent_id);
        if (locationNodes != null){
            for(locationNode locationNode : locationNodes){
                locationNode.setChildren(selectChildren(locationNode.getId()));
            }
        }
        return locationNodes;
    }
    //查询所有的根节点并拿到所以的树
    public List<locationNode> getSpanningTree(){
        List<locationNode> locationNodes = iLocationNode.getRootLocationNode();
        for (locationNode locationNode : locationNodes){
            locationNode.setChildren(selectChildren(locationNode.getId()));
        }

        return locationNodes;
    }
}
