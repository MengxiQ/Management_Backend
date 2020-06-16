package com.mengxi.manageemp.dao;

import com.mengxi.manageemp.domain.NEstatus_type;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface INEstatus_typeDao {
    @Select("select * from NEstatus_type")
    public List<NEstatus_type> findAll();

//    根据name 查询到类型详细信息
    @Select("select * from NEstatus_type where name = #{name}")
    public NEstatus_type findStatusByName(String name);
}
