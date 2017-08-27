package cn.art.dao;

import java.util.List;
import java.util.Map;

import cn.art.model.OutLine;

public interface OutLineMapper {
    int deleteByPrimaryKey(Integer oid);

    int insert(OutLine record);

    int insertSelective(OutLine record);

    OutLine selectByPrimaryKey(Integer oid);
    List<OutLine> selectByTIDandOTID(Map map);
    List<OutLine> selectByTID(Integer tid);
    
    List<OutLine> selectByName(String odescription);
    int CountNumByName(String odescription);

    int updateByPrimaryKeySelective(OutLine record);

    int updateByPrimaryKey(OutLine record);
    
}