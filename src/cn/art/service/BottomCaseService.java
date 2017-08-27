package cn.art.service;

import java.util.List;
import java.util.Map;

import cn.art.model.BottomCase;

public interface BottomCaseService {
	int deleteByPrimaryKey(Integer bcid);

    int insert(BottomCase record);

    int insertSelective(BottomCase record);

    BottomCase selectByPrimaryKey(Integer bcid);
    List<BottomCase> selectByTIDandBCTID(Map map);
    
    String selectBottomcaseBByTID(Integer tid);
    String selectBottomcaseDByBCTID(Integer bcid);
    String selectByName(String  casename);
    int CountNumByName(String  casename);

    int updateByPrimaryKeySelective(BottomCase record);

    int updateByPrimaryKey(BottomCase record);
    int update(Integer bcid,String casename,String casebrand,String bctname,String caseimg,String caseimg1,String caseimg2,String caseimg3);
    int insertselect(Integer tid,String casename,String casebrand,String bctname,String caseimg,String caseimg1,String caseimg2,String caseimg3);
    
}
