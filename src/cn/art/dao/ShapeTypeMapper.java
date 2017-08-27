package cn.art.dao;

import cn.art.model.ShapeType;

public interface ShapeTypeMapper {
    int deleteByPrimaryKey(Integer stid);

    int insert(ShapeType record);

    int insertSelective(ShapeType record);

    ShapeType selectByPrimaryKey(Integer stid);

    int updateByPrimaryKeySelective(ShapeType record);

    int updateByPrimaryKey(ShapeType record);
}