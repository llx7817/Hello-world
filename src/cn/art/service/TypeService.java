package cn.art.service;

import java.util.List;

import cn.art.model.Type;
import cn.art.util.pojo.typeIdName;

public interface TypeService {

	public int deleteByPrimaryKey(Integer tid);

	public int insert(Type record);

	public int insertSelective(Type record);

	public Type selectByPrimaryKey(Integer tid);

	public List<Type> selectAll();

	public Type selectAllByName(String tname);

	public List<typeIdName> selectAllByWordType(Integer twordtype);

	public List<typeIdName> selectAllOnlyIdandName();

	public int updateByPrimaryKeySelective(Type record);
	// public void updateByPrimaryKeySelective(Type record);

	public int updateByPrimaryKey(Type record);

	public String getOnlyIdandName();

	public String selectAllOnlyIDName();

	public int getFirstTid();

}
