package com.mengxi.manageemp.controller;

import com.mengxi.manageemp.dao.INEstatusDao;
import com.mengxi.manageemp.dao.INEstatus_typeDao;
import com.mengxi.manageemp.dao.INetworkEquipmentDao;
import com.mengxi.manageemp.domain.NEstatus;
import com.mengxi.manageemp.domain.NEstatus_type;
import com.mengxi.manageemp.domain.NetworkEquipment;
import com.mengxi.manageemp.service.NEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "NetworkEquipment")
public class NeConstroller {
    @Autowired
    private NEService neService;
    @Autowired
    private INEstatus_typeDao inEstatus_typeDao;
    @Autowired
    private INEstatusDao inEstatusDao;

    @RequestMapping(path ="NetEquip",method = RequestMethod.GET)
    public List<NetworkEquipment> finAll(){
        return neService.getAll();
    }
    @RequestMapping(path = "status_type", method = RequestMethod.GET)
    public List<NEstatus_type> finAllstatus_type(){
        return inEstatus_typeDao.findAll();
    }
    @RequestMapping(path = "nEstatus",method = RequestMethod.DELETE)
    public void deleteStatus(@RequestParam(name = "neid") int neid, @RequestParam(name = "status_name") String status_name){

        inEstatusDao.deleteStatus(neid,status_name);
    }

    @RequestMapping(path = "nEstatus",method = RequestMethod.POST)
    public String addStatus(@RequestBody NEstatus nEstatus){
//        System.out.print(nEstatus);

        if(inEstatusDao.addStatus(nEstatus) == 1){
            return "success";
        }else{
            return "false";
        }
    }
    @RequestMapping(path = "nEstatus",method = RequestMethod.PUT)
    public int updateStatus(@RequestBody NEstatus nEstatus){
//        System.out.print("updateStatus:");
//        System.out.print(nEstatus);
        return inEstatusDao.updateStatus(nEstatus);
    }
}
