package cn.art.service;

import java.util.List;
import java.util.Map;

import cn.art.model.Color;

public interface ColorService {
	int deleteByPrimaryKey(Integer cid);

    int insert(Color record);
    int insertSelective(Color record);

    Color selectByPrimaryKey(Integer cid);
    List<Color> selectByTID(Integer tid);
    List<Color> selectByTIDandCBID(Map map);
    
    String selectByName(String cdescription);
    int CountNumByName(String cdescription);

    int updateByPrimaryKeySelective(Color record);

    int updateByPrimaryKey(Color record);
    
    String selectColorD(Integer cid);
    int update(Integer cid,String cdescription,String cbname,String crgb,
    		String cimg1,String cimg2,String cimg3,String cimg4);
    int insertSelect(Integer tid,String cdescription,String cbname,String crgb,
    		String cimg1,String cimg2,String cimg3,String cimg4);
    
    String getColorBasic(Integer tid);
    String getColorBasic4(Integer tid);

}
