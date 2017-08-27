package cn.art.dao;

import java.util.List;
import java.util.Map;

import cn.art.model.Texture;

public interface TextureMapper {
    int deleteByPrimaryKey(Integer textureid);

    int insert(Texture record);

    int insertSelective(Texture record);

    Texture selectByPrimaryKey(Integer textureid);
    List<Texture> selectByTIDandTTID(Map map);
    List<Texture> selectByTID(Integer tid);
    
    List<Texture> selectByName(String tdescription);
    int CountNumByName(String tdescription);

    int updateByPrimaryKeySelective(Texture record);

    int updateByPrimaryKey(Texture record);
}