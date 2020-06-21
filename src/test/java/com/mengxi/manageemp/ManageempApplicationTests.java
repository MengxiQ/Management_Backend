package com.mengxi.manageemp;

import com.mengxi.manageemp.dao.INEstatusDao;
import com.mengxi.manageemp.dao.INEstatus_typeDao;
import com.mengxi.manageemp.dao.INEtypeDao;
import com.mengxi.manageemp.dao.INetworkEquipmentDao;
import com.mengxi.manageemp.domain.NEstatus;
import com.mengxi.manageemp.domain.NEstatus_type;
import com.mengxi.manageemp.domain.NetworkEquipment;
import com.mengxi.manageemp.service.NEService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class ManageempApplicationTests {
    @Autowired
    private INEstatus_typeDao inEstatus_typeDao;

    @Autowired
    private INetworkEquipmentDao networkEquipmentDao;

    @Autowired
    private INEstatusDao inEstatusDao;

    @Autowired
    private NEService neService;

    @Autowired
    private INEtypeDao inEtypeDao;
    @Test
    void contextLoads() {
//        List<NEstatus_type> nEstatus_types = inEstatus_typeDao.findAll();
//        System.out.print(nEstatus_types);
//        NEstatus_type nEstatus_type = inEstatus_typeDao.findStatusByName("other");
//        System.out.print(nEstatus_type);
//        List<NetworkEquipment> networkEquipments = networkEquipmentDao.findAll();
//        System.out.print(networkEquipments);

//        inEstatusDao.deleteStatus(5,"other");

    }
    /**
     * 测试的网络设备service
     */
    @Test
    void testNEservice(){
       List<NetworkEquipment> networkEquipments = neService.getAll();
       System.out.print(networkEquipments);
    }

    @Test
    void testNestatus(){
        NEstatus nEstatus =new NEstatus();
        nEstatus.setNeid(3);
        nEstatus.setStatus_name("putaway1");
        int tag = inEstatusDao.updateStatus(nEstatus);
        System.out.print("tag:"+tag);
    }
    @Test
    void testNEtype(){
        System.out.print(inEtypeDao.findAll());
    }

}
