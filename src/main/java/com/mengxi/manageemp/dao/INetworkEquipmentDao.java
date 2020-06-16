package com.mengxi.manageemp.dao;

import com.mengxi.manageemp.domain.NetworkEquipment;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Mapper
public interface INetworkEquipmentDao {
//
    @Results({
            @Result(id=true,property = "neid",column = "neid"),
            @Result(property = "NEstatus",column = "neid",one =@One(
                  select = "com.mengxi.manageemp.dao.INEstatusDao.findStatusByNeid"
            ))
    })
    @Select("select * from NetworkEquipmentBase")
    List<NetworkEquipment> findAll();

}
