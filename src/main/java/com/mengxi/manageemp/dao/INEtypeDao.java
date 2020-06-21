package com.mengxi.manageemp.dao;

import com.mengxi.manageemp.domain.NEtype;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface INEtypeDao {
    @Select("SELECT * FROM `NE_type`")
    public List<NEtype> findAll();
}
