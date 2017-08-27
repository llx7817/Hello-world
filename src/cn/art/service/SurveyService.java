package cn.art.service;

import cn.art.model.Survey;
import cn.art.util.pojo.surveyCA;

public interface SurveyService {
	int deleteByPrimaryKey(Integer sid);

	int insert(Survey record);

	int insertSelective(Survey record);

	Survey selectByPrimaryKey(Integer sid);

	Survey selectByTID(Integer tid);

	Survey selectSurveysByTID(Integer tid);

	int updateByPrimaryKeySelective(Survey record);

	int updateByPrimaryKey(Survey record);

	int updateOnlyCA(Survey record);

	int updateOnlyCA1(surveyCA record);

	String getWordSurvey(Integer tid);

	int saveWordSurvey(Integer tid, String wordsurvey);

	String getWordResult(Integer tid);

	int saveWordResult(Integer tid, String wordresult);

	String getConnectSurvey(Integer tid);

	int saveConnectSurvey(Integer tid, String connectSurvey);

	String getConnectResult(Integer tid);

	int saveConnectResult(Integer tid, String connectResult);

	String getAlgorithms(Integer tid);

	int saveAlgorithms(Integer tid, String algorithms);

	String getRatio(Integer tid);

	int saveRatio(Integer tid, String ratio);

	String getChooseSurvey(Integer tid);

}
