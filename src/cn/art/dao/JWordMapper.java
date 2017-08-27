package cn.art.dao;

import java.util.List;

import cn.art.model.JWord;

public interface JWordMapper {
    int deleteByPrimaryKey(Integer jwid);

    int insert(JWord record);

    int insertSelective(JWord record);

    JWord selectByPrimaryKey(Integer jwid);
    List<JWord> selectByTID(Integer tid);

    int updateByPrimaryKeySelective(JWord record);

    int updateByPrimaryKey(JWord record);
}