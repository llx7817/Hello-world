package cn.art.service;

import java.util.List;

import cn.art.model.Word;

public interface WordService {
	public int deleteByPrimaryKey(Integer wid);

    public int insert(Word record);

    public int insertSelective(Word record);
    public Word selectByPrimaryKey(Integer wid);
    public String selectWordByPrimaryKey(Integer wid);
    public List<Word> selectByWFirstChar(String wfirstchar);
    public List<Word> selectByWVocaType(String wvocatype);
    public List<Word> selectAll();
    
    public int updateByPrimaryKeySelective(Word record);

    public int updateByPrimaryKey(Word record);
    public String getwordFp();
    
    public String getWordFV();
    
    public int update(Integer wid,String wword,String wbasic,String wdetail,String wsimilar,
    		String wopposite,Integer wcolorwarm);
    public int insertSelect(String wword,String wbasic,String wdetail,String wsimilar,
    		String wopposite);
   

}
