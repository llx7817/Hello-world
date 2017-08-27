package cn.art.dao;

import java.util.List;

import cn.art.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);
    int insertSelectiveAndGetID(User record);

    User selectByPrimaryKey(Integer uid);

    List<User> selectUserByName(String uname);
    List<User> selectall();
    
    List<User> selectManagerByName(String uname);
    
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}