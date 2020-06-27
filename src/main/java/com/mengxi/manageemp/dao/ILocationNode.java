package com.mengxi.manageemp.dao;

import com.mengxi.manageemp.domain.locationNode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface ILocationNode {

    //查询所有的根节点
    @Select("select node_id as id ,node_name label from locationnode where parent_id is null")
    List<locationNode> getRootLocationNode();

    //根据父节点ID查询所有子节点
    @Select("select node_id as id ,node_name label  from locationnode where parent_id = #{parent_id}")
    List<locationNode> getLocationNodesByParent_id(int parent_id);
}
