package cn.art.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.art.dao.SurveyMapper;
import cn.art.model.Survey;
import cn.art.service.SurveyService;
import cn.art.util.JsonConvert;
import cn.art.util.pojo.surveyCA;

@Service("SurveyService")
public class SurveyServiceImpl implements SurveyService {
	private SurveyMapper surveyMapper;
	private JsonConvert jsonConvert;

	public SurveyServiceImpl() {
		jsonConvert = new JsonConvert();
	}

	public SurveyMapper getSurveyMapper() {
		return surveyMapper;
	}

	@Autowired
	public void setSurveyMapper(SurveyMapper surveyMapper) {
		this.surveyMapper = surveyMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer sid) {
		// TODO Auto-generated method stub
		return surveyMapper.deleteByPrimaryKey(sid);
	}

	@Override
	public int insert(Survey record) {
		// TODO Auto-generated method stub
		return surveyMapper.insert(record);
	}

	@Override
	public int insertSelective(Survey record) {
		// TODO Auto-generated method stub
		return surveyMapper.insertSelective(record);
	}

	@Override
	public Survey selectByPrimaryKey(Integer sid) {
		// TODO Auto-generated method stub
		return surveyMapper.selectByPrimaryKey(sid);
	}

	@Override
	public Survey selectByTID(Integer tid) {
		// TODO Auto-generated method stub
		return surveyMapper.selectByTID(tid);
	}

	@Override
	public int updateByPrimaryKeySelective(Survey record) {
		// TODO Auto-generated method stub
		return surveyMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Survey record) {
		// TODO Auto-generated method stub
		return surveyMapper.updateByPrimaryKey(record);
	}

	@Override
	public int updateOnlyCA1(surveyCA record) {
		// TODO Auto-generated method stub
		return surveyMapper.updateOnlyCA1(record);
	}

	@Override
	public int updateOnlyCA(Survey record) {
		// TODO Auto-generated method stub
		return surveyMapper.updateOnlyCA(record);
	}

	@Override
	public String getWordSurvey(Integer tid) {
		// TODO Auto-generated method stub
		Survey survey = surveyMapper.selectByTID(tid);
		String str = survey.getWordsurvey();
		return str;
	}

	@Override
	public int saveWordSurvey(Integer tid, String wordsurvey) {
		// TODO Auto-generated method stub
		Survey survey = surveyMapper.selectByTID(tid);
		String str = survey.getWordsurvey();
		String[] wordsurveyArray = str.split("|");
		boolean isExist = false;
		// 判断该ID类型的词汇调查链接是否存在，不纯在则插入到数据库
		for (String wordsurvey2 : wordsurveyArray) {
			if (wordsurvey2.equals(wordsurvey)) {
				isExist = true;
				break;
			}
		}
		if (!isExist) {
			str += "|" + wordsurvey;
			survey.setWordsurvey(str);
			return surveyMapper.insertSelective(survey);
		}
		return 0;
	}

	@Override
	public int saveWordResult(Integer tid, String wordresult) {
		// TODO Auto-generated method stub
		Survey survey = surveyMapper.selectByTID(tid);
		String str = survey.getWordresult();
		String[] wordresultArray = str.split("|");
		boolean isExist = false;
		// 判断该ID类型的词汇调查链接是否存在，不纯在则插入到数据库
		for (String wordresult2 : wordresultArray) {
			if (wordresult2.equals(wordresult)) {
				isExist = true;
				break;
			}
		}
		if (!isExist) {
			str += "|" + wordresult;
			survey.setWordresult(str);
			return surveyMapper.insertSelective(survey);
		}
		return 0;
	}

	@Override
	public String getWordResult(Integer tid) {
		// TODO Auto-generated method stub
		Survey survey = surveyMapper.selectByTID(tid);
		String str = survey.getWordresult();
		return str;
	}

	@Override
	public String getConnectSurvey(Integer tid) {
		// TODO Auto-generated method stub
		Survey survey = surveyMapper.selectByTID(tid);
		String str = survey.getConnectsurvey();
		return str;
	}

	@Override
	public String getConnectResult(Integer tid) {
		// TODO Auto-generated method stub
		Survey survey = surveyMapper.selectByTID(tid);
		String str = survey.getConnectresult();
		return str;
	}

	@Override
	public String getAlgorithms(Integer tid) {
		// TODO Auto-generated method stub
		Survey survey = surveyMapper.selectByTID(tid);
		String str = survey.getAlgorithms();
		return str;
	}

	@Override
	public String getRatio(Integer tid) {
		// TODO Auto-generated method stub
		Survey survey = surveyMapper.selectByTID(tid);
		String str = survey.getRatio();
		return str;
	}

	@Override
	public int saveConnectSurvey(Integer tid, String connectSurvey) {
		// TODO Auto-generated method stub
		Survey survey = surveyMapper.selectByTID(tid);
		String str = survey.getConnectsurvey();
		String[] connectSurveyArray = str.split("|");
		boolean isExist = false;
		// 判断该ID类型的词汇调查链接是否存在，不纯在则插入到数据库
		for (String connectSurvey2 : connectSurveyArray) {
			if (connectSurvey2.equals(connectSurvey)) {
				isExist = true;
				break;
			}
		}
		if (!isExist) {
			str += "|" + connectSurvey;
			survey.setConnectsurvey(str);
			return surveyMapper.insertSelective(survey);
		}
		return 0;
	}

	@Override
	public int saveConnectResult(Integer tid, String connectResult) {
		// TODO Auto-generated method stub
		Survey survey = surveyMapper.selectByTID(tid);
		String str = survey.getConnectresult();
		String[] connectResultArray = str.split("|");
		boolean isExist = false;
		// 判断该ID类型的词汇调查链接是否存在，不纯在则插入到数据库
		for (String connectResult2 : connectResultArray) {
			if (connectResult2.equals(connectResult)) {
				isExist = true;
				break;
			}
		}
		if (!isExist) {
			str += "|" + connectResult;
			survey.setConnectresult(str);
			return surveyMapper.insertSelective(survey);
		}
		return 0;
	}

	@Override
	public int saveAlgorithms(Integer tid, String algorithms) {
		// TODO Auto-generated method stub
		Survey survey = surveyMapper.selectByTID(tid);
		String str = survey.getAlgorithms();
		String[] algorithmsArray = str.split("|");
		boolean isExist = false;
		// 判断该ID类型的词汇调查链接是否存在，不纯在则插入到数据库
		for (String algorithms2 : algorithmsArray) {
			if (algorithms2.equals(algorithms)) {
				isExist = true;
				break;
			}
		}
		if (!isExist) {
			str += "|" + algorithms;
			survey.setAlgorithms(str);
			return surveyMapper.insertSelective(survey);
		}
		return 0;
	}

	@Override
	public int saveRatio(Integer tid, String ratio) {
		// TODO Auto-generated method stub
		Survey survey = surveyMapper.selectByTID(tid);
		String str = survey.getRatio();
		String[] ratioArray = str.split("|");
		boolean isExist = false;
		// 判断该ID类型的词汇调查链接是否存在，不纯在则插入到数据库
		for (String ratio2 : ratioArray) {
			if (ratio2.equals(ratio)) {
				isExist = true;
				break;
			}
		}
		if (!isExist) {
			str += "|" + ratio;
			survey.setRatio(str);
			return surveyMapper.insertSelective(survey);
		}
		return 0;
	}

	@Override
	public Survey selectSurveysByTID(Integer tid) {
		// TODO Auto-generated method stub
		Survey survey = surveyMapper.selectByTID(tid);
		return survey;
		// return jsonConvert.list2json(surveys);
	}

	@Override
	public String getChooseSurvey(Integer tid) {
		// TODO Auto-generated method stub
		Survey survey = surveyMapper.selectByTID(tid);
		String choosesurvey = survey.getChoosesurvey();
		return choosesurvey;
	}

}
