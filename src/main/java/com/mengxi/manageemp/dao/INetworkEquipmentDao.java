package com.mengxi.manageemp.dao;

import com.mengxi.manageemp.domain.NetworkEquipment;
import com.mengxi.manageemp.domain.charts.StatusCount;
import com.mengxi.manageemp.domain.charts.TypeOverview;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface INetworkEquipmentDao {
//  查找所有，注意这里的设备状态使用mybatis 1对1 查询
    @Results({
            @Result(id=true,property = "neid",column = "neid"),
            @Result(property = "NEstatus",column = "neid",one =@One(
                  select = "com.mengxi.manageemp.dao.INEstatusDao.findStatusByNeid"
            ))
    })
    @Select("select * from NetworkEquipmentBase")
    List<NetworkEquipment> findAll();

//  添加设备
    @Insert("insert NetworkEquipment(uuid,mac,fixed_id,name,tid,unitType,stock_date,remark)" +
            "values(#{uuid},#{mac},#{fixed_id},#{name},#{tid},#{unitType},#{stock_date},#{remark})")
    int addNetworkEquipment(NetworkEquipment networkEquipment);

//  更新设备
    @Update("update NetworkEquipment set uuid = #{uuid}, mac = #{mac},fixed_id = #{fixed_id}, name = #{name}, tid = #{tid},unitType = #{unitType},stock_date = #{stock_date},remark = #{remark} where neid = #{neid}")
    int upateNetworkEquipment(NetworkEquipment networkEquipment);

//  删除设备
    @Delete("delete from NetworkEquipment where neid = #{neid}")
    int deleteNetworkEquipment(int neid);

/**
 * 图表信息
 * */

//  查询按照列名分组的统计信息, NE_type
    @Select("select NE_type as 'name',COUNT(NE_type) as 'value' from NetworkEquipmentBase GROUP BY NE_type")
    List<TypeOverview> getAssetOverviewByCol();

//  查询按照类型获取所有状态的设备的数量 parm:设备类型
    @Select("select status,count(status) as count from NetworkEquipmentTypeStatus where NE_type = #{NEtype} GROUP BY status")
    List<StatusCount> getStatusCountsByNEtype(String NEtype);
}
