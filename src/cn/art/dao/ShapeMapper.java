package cn.art.dao;

import cn.art.model.Shape;

public interface ShapeMapper {
    int deleteByPrimaryKey(Integer shapeid);

    int insert(Shape record);

    int insertSelective(Shape record);

    Shape selectByPrimaryKey(Integer shapeid);

    int updateByPrimaryKeySelective(Shape record);

    int updateByPrimaryKey(Shape record);
}