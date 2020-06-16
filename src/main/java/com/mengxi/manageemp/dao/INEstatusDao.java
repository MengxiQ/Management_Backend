package com.mengxi.manageemp.dao;

import com.mengxi.manageemp.domain.NEstatus;
import org.apache.ibatis.annotations.*;

@Mapper
public interface INEstatusDao {

    @Select("select * from NEstatus where neid = #{neid}")
    public NEstatus findStatusByNeid(int neid);

    @Delete("delete from NEstatus where neid = #{neid} and status_name = #{status_name}")
    public void deleteStatus(int neid,String status_name);

    @Insert("insert NEstatus(neid,status_name,date,site,remark) values(#{neid},#{status_name},#{date},#{site},#{remark})")
    @SelectKey(keyColumn="neid",keyProperty="neid",resultType=Integer.class,before =
            false, statement = { "select last_insert_id()" })
    public Integer addStatus(NEstatus nEstatus);

    @Update("update NEstatus set status_name = #{status_name},date = #{date},site = #{site},remark = #{remark} where neid = #{neid}")
    public int updateStatus(NEstatus nEstatus);
}
