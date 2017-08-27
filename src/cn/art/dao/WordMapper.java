package cn.art.dao;

import java.util.List;

import cn.art.model.Word;

public interface WordMapper {
    int deleteByPrimaryKey(Integer wid);

    int insert(Word record);

    int insertSelective(Word record);

    Word selectByPrimaryKey(Integer wid);
    
    List<Word> selectByWFirstChar(String wfirstchar);
    List<Word> selectByWVocaType(String wvocatype);
    List<Word> selectAll();
    
    int updateByPrimaryKeySelective(Word record);

    int updateByPrimaryKey(Word record);
}