package cn.art.service;

import java.util.List;

import cn.art.model.TextureType;

public interface TextureTypeService {
	 	int deleteByPrimaryKey(Integer ttid);

	    int insert(TextureType record);

	    int insertSelective(TextureType record);

	    TextureType selectByPrimaryKey(Integer ttid);
	    List<TextureType> selectByTID(Integer tid);

	    int updateByPrimaryKeySelective(TextureType record);

	    int updateByPrimaryKey(TextureType record);

}
