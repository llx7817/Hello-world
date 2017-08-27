package cn.art.service;

import java.util.List;
import java.util.Map;

import cn.art.model.Part;

public interface PartService {
	int deleteByPrimaryKey(Integer pid);

    int insert(Part record);

    int insertSelective(Part record);

    Part selectByPrimaryKey(Integer pid);
    List<Part> selectByTIDandPBID(Map map);
    
    String selectByName(String pdescription);
    int CountNumByName(String pdescription);

    int updateByPrimaryKeySelective(Part record);

    int updateByPrimaryKey(Part record);
    
    String selectPartD(Integer pid);
    int update(Integer pid,String pdescription,String pbname,
    		String pimg,String pimg1,String pimg2,String pimg3,String pimg4);
    int insertSelect(Integer tid,String pdescription,String pbname,
    		String pimg,String pimg1,String pimg2,String pimg3,String pimg4);
    
    String getPartBasic(Integer tid);
    String getPartBasic4(Integer tid);

}
