package com.mengxi.manageemp.dao;

import com.mengxi.manageemp.domain.Cabinet;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ICabinetDao {

    //查询所有的机柜
    @Select("select * from cabinet")
    List<Cabinet> getAllCabinet();



}
