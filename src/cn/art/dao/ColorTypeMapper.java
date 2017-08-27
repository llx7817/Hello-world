package cn.art.dao;

import java.util.List;

import cn.art.model.ColorType;

public interface ColorTypeMapper {
    int deleteByPrimaryKey(Integer cbid);

    int insert(ColorType record);

    int insertSelective(ColorType record);

    ColorType selectByPrimaryKey(Integer cbid);
    List<ColorType> selectByTID(Integer tid);
    

    int updateByPrimaryKeySelective(ColorType record);

    int updateByPrimaryKey(ColorType record);
}