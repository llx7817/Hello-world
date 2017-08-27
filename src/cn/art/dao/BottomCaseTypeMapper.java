package cn.art.dao;

import java.util.List;

import cn.art.model.BottomCaseType;

public interface BottomCaseTypeMapper {
    int deleteByPrimaryKey(Integer bctid);

    int insert(BottomCaseType record);

    int insertSelective(BottomCaseType record);

    BottomCaseType selectByPrimaryKey(Integer bctid);
    List<BottomCaseType> selectByTID(Integer tid);

    int updateByPrimaryKeySelective(BottomCaseType record);

    int updateByPrimaryKey(BottomCaseType record);
}