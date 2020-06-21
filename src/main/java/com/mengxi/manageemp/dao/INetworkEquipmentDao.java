package com.mengxi.manageemp.dao;

import com.mengxi.manageemp.domain.NetworkEquipment;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface INetworkEquipmentDao {
// 查找所有，注意这里的设备状态使用mybatis 1对1 查询
    @Results({
            @Result(id=true,property = "neid",column = "neid"),
            @Result(property = "NEstatus",column = "neid",one =@One(
                  select = "com.mengxi.manageemp.dao.INEstatusDao.findStatusByNeid"
            ))
    })
    @Select("select * from NetworkEquipmentBase")
    List<NetworkEquipment> findAll();
    //添加涉笔
    @Insert("insert NetworkEquipment(uuid,mac,fixed_id,name,tid,unitType,stock_date,remark)" +
            "values(#{uuid},#{mac},#{fixed_id},#{name},#{tid},#{unitType},#{stock_date},#{remark})")
    int addNetworkEquipment(NetworkEquipment networkEquipment);
//    更新
    @Update("update NetworkEquipment set uuid = #{uuid}, mac = #{mac},fixed_id = #{fixed_id}, name = #{name}, tid = #{tid},unitType = #{unitType},stock_date = #{stock_date},remark = #{remark} where neid = #{neid}")
    int upateNetworkEquipment(NetworkEquipment networkEquipment);

//    删除
    @Delete("delete from NetworkEquipment where neid = #{neid}")
    int deleteNetworkEquipment(int neid);
}
