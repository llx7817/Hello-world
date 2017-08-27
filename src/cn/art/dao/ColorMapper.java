package cn.art.dao;

import java.util.List;
import java.util.Map;

import cn.art.model.Color;

public interface ColorMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Color record);

    int insertSelective(Color record);

    Color selectByPrimaryKey(Integer cid);
    List<Color> selectByTID(Integer tid);
    List<Color> selectByTIDandCBID(Map map);
    
    List<Color> selectByName(String cdescription);
    int CountNumByName(String cdescription);
    
    int updateByPrimaryKeySelective(Color record);

    int updateByPrimaryKey(Color record);
    
    String selectColorD(Integer cid);
}