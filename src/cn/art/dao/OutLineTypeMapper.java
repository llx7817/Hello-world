package cn.art.dao;

import java.util.List;

import cn.art.model.OutLineType;

public interface OutLineTypeMapper {
    int deleteByPrimaryKey(Integer otid);

    int insert(OutLineType record);

    int insertSelective(OutLineType record);

    OutLineType selectByPrimaryKey(Integer otid);
    List<OutLineType> selectByTID(Integer tid);

    int updateByPrimaryKeySelective(OutLineType record);

    int updateByPrimaryKey(OutLineType record);
}