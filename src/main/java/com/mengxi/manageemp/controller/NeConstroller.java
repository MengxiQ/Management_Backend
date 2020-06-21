package com.mengxi.manageemp.controller;

import com.mengxi.manageemp.dao.INEstatusDao;
import com.mengxi.manageemp.dao.INEstatus_typeDao;
import com.mengxi.manageemp.dao.INEtypeDao;
import com.mengxi.manageemp.domain.NEstatus;
import com.mengxi.manageemp.domain.NEstatus_type;
import com.mengxi.manageemp.domain.NEtype;
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
    @Autowired
    private INEtypeDao inEtypeDao;
//    获取所有的设备信息
    @RequestMapping(path ="NetEquip",method = RequestMethod.GET)
    public List<NetworkEquipment> finAll(){
        return neService.getAll();
    }
//    更新设备信息
    @RequestMapping(path = "NetEquip",method = RequestMethod.PUT)
    public int updateNetworkEquipment(@RequestBody NetworkEquipment networkEquipment){
        System.out.print(networkEquipment);
        return neService.upateNetworkEquipment(networkEquipment);
    }
    //  添加设备
    @RequestMapping(path = "NetEquip",method = RequestMethod.POST)
    public int addNetworkEquipment(@RequestBody NetworkEquipment networkEquipment){
        //删除设备先删除外模式
        if (neService.addNetworkEquipment(networkEquipment) == 1){
            return 1;
        }
        return 0;
    }


//    删除设备
    @RequestMapping(path = "NetEquip",method = RequestMethod.DELETE)
    public int deleteNetworkEquipment(int neid) {
        //删除设备先删除外模式
        if (neService.deleteNetworkEquipment(neid) == 1){
            return 1;
        }
        return 0;
    }

    //获取所有的设备类型
    @RequestMapping(path = "NEtype",method = RequestMethod.GET)
    public List<NEtype> getAllNEtype(){
        return inEtypeDao.findAll();
    }

//   获取所有的状态类型
    @RequestMapping(path = "status_type", method = RequestMethod.GET)
    public List<NEstatus_type> finAllstatus_type(){
        return inEstatus_typeDao.findAll();
    }


//    删除设备状态
    @RequestMapping(path = "nEstatus",method = RequestMethod.DELETE)
    public void deleteStatus(@RequestParam(name = "neid") int neid, @RequestParam(name = "status_name") String status_name){
        inEstatusDao.deleteStatus(neid,status_name);
    }

//    添加设备状态
    @RequestMapping(path = "nEstatus",method = RequestMethod.POST)
    public String addStatus(@RequestBody NEstatus nEstatus){
//        System.out.print(nEstatus);

        if(inEstatusDao.addStatus(nEstatus) == 1){
            return "success";
        }else{
            return "false";
        }
    }

//    更新设备状态
    @RequestMapping(path = "nEstatus",method = RequestMethod.PUT)
    public int updateStatus(@RequestBody NEstatus nEstatus){
//        System.out.print("updateStatus:");
//        System.out.print(nEstatus);
        return inEstatusDao.updateStatus(nEstatus);
    }


}
