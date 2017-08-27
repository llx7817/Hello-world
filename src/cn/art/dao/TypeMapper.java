package cn.art.dao;

import java.util.List;

import cn.art.model.Type;
import cn.art.util.pojo.typeIdName;

public interface TypeMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Type record);

    int insertSelective(Type record);

    Type selectByPrimaryKey(Integer tid);
    List<Type> selectAll();
    Type selectAllByName(String tname);
    
    List<typeIdName> selectAllByWordType(Integer twordtype);
    List<typeIdName> selectAllOnlyIdandName();
    
    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);
}