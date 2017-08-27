package cn.art.dao;

import cn.art.model.Survey;
import cn.art.util.pojo.surveyCA;

public interface SurveyMapper {
	int deleteByPrimaryKey(Integer sid);

	int insert(Survey record);

	int insertSelective(Survey record);

	Survey selectByPrimaryKey(Integer sid);

	Survey selectByTID(Integer tid);

	int updateByPrimaryKeySelective(Survey record);

	int updateByPrimaryKey(Survey record);

	int updateOnlyCA1(surveyCA record);

	int updateOnlyCA(Survey record);
}