package com.mengxi.manageemp.controller;

import com.mengxi.manageemp.dao.ICabinetDao;
import com.mengxi.manageemp.dao.ILocationNode;
import com.mengxi.manageemp.domain.Cabinet;
import com.mengxi.manageemp.domain.locationNode;
import com.mengxi.manageemp.service.CabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("CabinetList")
public class CabinetContoller {

    @Autowired
    private ICabinetDao iCabinetDao;

    @Autowired
    private CabinetService cabinetService;

    @RequestMapping(value = "Cabinet",method = RequestMethod.GET)
    public List<Cabinet> getAllCabine(){
        System.out.println("Cabinet");
        return iCabinetDao.getAllCabinet();
    }

    @RequestMapping(value = "SpanningTree",method = RequestMethod.GET)
    public List<locationNode> getSpanningTree(){
        return cabinetService.getSpanningTree();
    }
}
