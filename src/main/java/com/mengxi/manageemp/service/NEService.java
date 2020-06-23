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
        List<NetworkEquipment> networkEquipments = iNetworkEquipmentDao.findAll();
        return networkEquipments;
    }
    // 更新设备详细信息
    public int upateNetworkEquipment(NetworkEquipment networkEquipment){
        return iNetworkEquipmentDao.upateNetworkEquipment(networkEquipment);
    }
    @Override
    public int deleteNetworkEquipment(int neid) {
//        1.判断状态类型时候为空，空则直接删除，非空需要先删除状态
        if(inEstatusDao.findStatusByNeid(neid) == null){
            System.out.print("The status is null");
            if(iNetworkEquipmentDao.deleteNetworkEquipment(neid) == 1){
                return  1;
            }else {
                return 0;
            }

        }{
            //删除状态
            if (inEstatusDao.deleteSTatusByNeid(neid) == 1 ){
                iNetworkEquipmentDao.deleteNetworkEquipment(neid);
                return 1;
            }
        }

        return 0;
    }

    @Override
    public int addNetworkEquipment(NetworkEquipment networkEquipment) {
        return iNetworkEquipmentDao.addNetworkEquipment(networkEquipment);
    }
}
