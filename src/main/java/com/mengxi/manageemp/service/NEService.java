package com.mengxi.manageemp.service;

import com.mengxi.manageemp.dao.INEstatusDao;
import com.mengxi.manageemp.dao.INEstatus_typeDao;
import com.mengxi.manageemp.dao.INetworkEquipmentDao;
import com.mengxi.manageemp.domain.NEstatus;
import com.mengxi.manageemp.domain.NetworkEquipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class NEService implements INEService {
    @Autowired
    private INetworkEquipmentDao iNetworkEquipmentDao;

    @Autowired
    private INEstatusDao inEstatusDao;
    @Autowired
    private INEstatus_typeDao inEstatus_typeDao;
    public List<NetworkEquipment> getAll(){
        //当没有状态时，添加默认状态，防止返回的nestatus对象为null
        List<NetworkEquipment> networkEquipments = iNetworkEquipmentDao.findAll();
//        for (NetworkEquipment networkEquipment : networkEquipments){
//            if (networkEquipment.getNEstatus() == null){
//                NEstatus nEstatus = new NEstatus();
//                nEstatus.setNeid(networkEquipment.getNeid());
//                nEstatus.setStatus_name("default");
//                nEstatus.setRemark("null");
//                nEstatus.setSite("null");
//                networkEquipment.setNEstatus(nEstatus);
//            }
//
//        }
        return networkEquipments;
    }
//    对添加的的新设备状态进行处理
    public void addStatus(int neid,String status_name){
        NEstatus nEstatus = new NEstatus();
        nEstatus.setNeid(neid);
        nEstatus.setStatus_name(status_name);
        nEstatus.setDate(new Date());
        inEstatusDao.addStatus(nEstatus);
    }
}
