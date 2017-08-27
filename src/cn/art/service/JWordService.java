package cn.art.service;

import java.util.List;

import cn.art.model.JWord;

public interface JWordService {
	int deleteByPrimaryKey(Integer jwid);

    int insert(JWord record);

    int insertSelective(JWord record);

    JWord selectByPrimaryKey(Integer jwid);
    List<JWord> selectByTID(Integer tid);

    int updateByPrimaryKeySelective(JWord record);

    int updateByPrimaryKey(JWord record);
    
    String getVoca();
    String getcidui();
    int insertVoca(Integer wid,Integer tid);
    int insertCidui(Integer wid1,Integer wid2,Integer tid);
    
    String getAllJwordByTID(Integer tid);
  
}
