package cn.art.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.art.model.Survey;
import cn.art.service.SurveyService;
import cn.art.service.TypeService;
import cn.art.util.pojo.typeIdName;

@Controller
@RequestMapping("manager/question")
public class M_questionController {
	private TypeService typeService;
	private SurveyService surveyService;

	public TypeService getTypeService() {
		return typeService;
	}

	@Autowired
	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}

	public SurveyService getSurveyService() {
		return surveyService;
	}

	@Autowired
	public void setSurveyService(SurveyService surveyService) {
		this.surveyService = surveyService;
	}

	@RequestMapping("list")
	public String list(Model model, Survey survey, Integer tid) {
		List<typeIdName> typeList = typeService.selectAllOnlyIdandName();
		model.addAttribute("typeList", typeList);
		if (tid != null) {
			survey = surveyService.selectByTID(tid);
		}
		model.addAttribute("survey", survey);
		return "manager/yuyi/question/list";
	}

	@RequestMapping("/load/edit")
	@ResponseBody
	public String edit(Model model, Integer tid) {
		Survey survey = new Survey();
		if (tid != null) {
			survey = surveyService.selectByTID(tid);
		}
		model.addAttribute("survey", survey);
		return "0";
	}

	// 语义库管理 问卷调查与检验 (默认接口)
	@RequestMapping("")
	public String semanticQuestion(HttpServletRequest request) {
		String types = typeService.getOnlyIdandName();
		request.setAttribute("types", types);
		return "manager/testlogin";
	}

	// 意象词汇降维调查 接口
	@RequestMapping("{tid}/WordSurvey")
	public String semanticQuestionWordSurvey(@PathVariable Integer tid, HttpServletRequest request) {
		String wordsurveys = surveyService.getWordSurvey(tid);
		request.setAttribute("wordsurveys", wordsurveys);

		return "manager/testlogin";
	}

	// 意象词汇降维调查 保存接口
	@RequestMapping("{tid}/WordSurvey/save")
	public void semanticQuestionWordSurveySave(@PathVariable Integer tid, HttpServletRequest request) {
		String wordsurvey1 = request.getParameter("wordsurvey1");
		String wordsurvey2 = request.getParameter("wordsurvey2");
		String wordsurvey3 = request.getParameter("wordsurvey3");
		if (wordsurvey1 != null && wordsurvey1.trim() != "") {
			int isok = surveyService.saveWordSurvey(tid, wordsurvey1);
			if (isok == 1) {
				request.setAttribute("wordsurvey1_status", 200);
			} else {
				request.setAttribute("wordsurvey1_status", 100);
				request.setAttribute("wordsurvey1_errorMessage", "该词汇调查链接已存在");
			}
		}
		if (wordsurvey2 != null && wordsurvey2.trim() != "") {
			int isok = surveyService.saveWordSurvey(tid, wordsurvey2);
			if (isok == 1) {
				request.setAttribute("wordsurvey2_status", 200);
			} else {
				request.setAttribute("wordsurvey2_status", 100);
				request.setAttribute("wordsurvey2_errorMessage", "该词汇调查链接已存在");
			}
		}
		if (wordsurvey3 != null && wordsurvey3.trim() != "") {
			int isok = surveyService.saveWordSurvey(tid, wordsurvey3);
			if (isok == 1) {
				request.setAttribute("wordsurvey3_status", 200);
			} else {
				request.setAttribute("wordsurvey3_status", 100);
				request.setAttribute("wordsurvey3_errorMessage", "该词汇调查链接已存在");
			}
		}
	}

	// 词汇降维调查结果 接口
	@RequestMapping("{tid}/WordResult")
	public void semanticQuestionWordResult(@PathVariable Integer tid, HttpServletRequest request) {
		String wordresults = surveyService.getWordResult(tid);
		request.setAttribute("wordresults", wordresults);

	}

	// 词汇降维调查结果 保存接口
	@RequestMapping("{tid}/WordResult/save")
	public void semanticQuestionWordResultSave(@PathVariable Integer tid, HttpServletRequest request) {
		String wordresult1 = request.getParameter("WordResult1");
		String wordresult2 = request.getParameter("WordResult2");
		String wordresult3 = request.getParameter("WordResult3");
		if (wordresult1 != null && wordresult1.trim() != "") {
			int isok = surveyService.saveWordResult(tid, wordresult1);
			if (isok == 1) {
				request.setAttribute("wordresult1_status", 200);
			} else {
				request.setAttribute("wordresult1_status", 100);
				request.setAttribute("wordresult1_errorMessage", "该词汇调查结果链接已存在");
			}
		}
		if (wordresult2 != null && wordresult2.trim() != "") {
			int isok = surveyService.saveWordResult(tid, wordresult2);
			if (isok == 1) {
				request.setAttribute("wordresult2_status", 200);
			} else {
				request.setAttribute("wordresult2_status", 100);
				request.setAttribute("wordresult2_errorMessage", "该词汇调查结果链接已存在");
			}
		}
		if (wordresult3 != null && wordresult3.trim() != "") {
			int isok = surveyService.saveWordResult(tid, wordresult3);
			if (isok == 1) {
				request.setAttribute("wordresult3_status", 200);
			} else {
				request.setAttribute("wordresult3_status", 100);
				request.setAttribute("wordresult3_errorMessage", "该词汇调查结果链接已存在");
			}
		}
	}

	// 意象造型关联 接口
	@RequestMapping("{tid}/ConnectSurvey")
	public void semanticQuestionConnectSurvey(@PathVariable Integer tid, HttpServletRequest request) {
		String connectSurveys = surveyService.getConnectSurvey(tid);
		request.setAttribute("connectSurveys", connectSurveys);

	}

	// 意象造型关联 保存接口
	@RequestMapping("{tid}/ConnectSurvey/save")
	public void semanticQuestionConnectSurveySave(@PathVariable Integer tid, HttpServletRequest request) {
		String connectSurvey1 = request.getParameter("ConnectSurvey1");
		String connectSurvey2 = request.getParameter("ConnectSurvey2");
		String connectSurvey3 = request.getParameter("ConnectSurvey3");
		if (connectSurvey1 != null && connectSurvey1.trim() != "") {
			int isok = surveyService.saveConnectSurvey(tid, connectSurvey1);
			if (isok == 1) {
				request.setAttribute("connectSurvey1_status", 200);
			} else {
				request.setAttribute("connectSurvey1_status", 100);
				request.setAttribute("connectSurvey1_errorMessage", "该词汇关联调查链接已存在");
			}
		}
		if (connectSurvey2 != null && connectSurvey2.trim() != "") {
			int isok = surveyService.saveConnectSurvey(tid, connectSurvey2);
			if (isok == 1) {
				request.setAttribute("connectSurvey2_status", 200);
			} else {
				request.setAttribute("connectSurvey2_status", 100);
				request.setAttribute("connectSurvey2_errorMessage", "该词汇关联调查链接已存在");
			}
		}
		if (connectSurvey3 != null && connectSurvey3.trim() != "") {
			int isok = surveyService.saveConnectSurvey(tid, connectSurvey3);
			if (isok == 1) {
				request.setAttribute("connectSurvey3_status", 200);
			} else {
				request.setAttribute("connectSurvey3_status", 100);
				request.setAttribute("connectSurvey3_errorMessage", "该词汇关联调查链接已存在");
			}
		}
	}

	// 造型关联调查结果 接口
	@RequestMapping("{tid}/ConnectResult")
	public void semanticQuestionConnectResult1(@PathVariable Integer tid, HttpServletRequest request) {
		String connectResults = surveyService.getConnectResult(tid);
		request.setAttribute("connectResults", connectResults);

	}

	// 造型关联调查结果 保存接口
	@RequestMapping("{tid}/ConnectResult/save")
	public void semanticQuestionConnectResultSave(@PathVariable Integer tid, HttpServletRequest request) {
		String connectResult1 = request.getParameter("ConnectResult1");
		String connectResult2 = request.getParameter("ConnectResult2");
		String connectResult3 = request.getParameter("ConnectResult3");
		if (connectResult1 != null && connectResult1.trim() != "") {
			int isok = surveyService.saveConnectResult(tid, connectResult1);
			if (isok == 1) {
				request.setAttribute("connectResult1_status", 200);
			} else {
				request.setAttribute("connectResult1_status", 100);
				request.setAttribute("connectResult1_errorMessage", "该词汇关联调查结果链接已存在");
			}
		}
		if (connectResult2 != null && connectResult2.trim() != "") {
			int isok = surveyService.saveConnectResult(tid, connectResult2);
			if (isok == 1) {
				request.setAttribute("connectResult2_status", 200);
			} else {
				request.setAttribute("connectResult2_status", 100);
				request.setAttribute("connectResult2_errorMessage", "该词汇关联调查结果链接已存在");
			}
		}
		if (connectResult3 != null && connectResult3.trim() != "") {
			int isok = surveyService.saveConnectResult(tid, connectResult3);
			if (isok == 1) {
				request.setAttribute("connectResult3_status", 200);
			} else {
				request.setAttribute("connectResult3_status", 100);
				request.setAttribute("connectResult3_errorMessage", "该词汇关联调查结果链接已存在");
			}
		}
	}

	// 意象造型关联算法 接口
	@RequestMapping("{tid}/Algorithms")
	public void semanticQuestionAlgorithms(@PathVariable Integer tid, HttpServletRequest request) {
		String algorithms = surveyService.getAlgorithms(tid);
		request.setAttribute("algorithms", algorithms);

	}

	// 意象造型关联算法 保存接口
	@RequestMapping("{tid}/Algorithms/save")
	public void semanticQuestionAlgorithmsSave(@PathVariable Integer tid, HttpServletRequest request) {
		String algorithms1 = request.getParameter("Algorithms1");
		String algorithms2 = request.getParameter("Algorithms2");
		String algorithms3 = request.getParameter("Algorithms3");
		if (algorithms1 != null && algorithms1.trim() != "") {
			int isok = surveyService.saveAlgorithms(tid, algorithms1);
			if (isok == 1) {
				request.setAttribute("algorithms1_status", 200);
			} else {
				request.setAttribute("algorithms1_status", 100);
				request.setAttribute("algorithms1_errorMessage", "该词汇算法调查链接已存在");
			}
		}
		if (algorithms2 != null && algorithms2.trim() != "") {
			int isok = surveyService.saveAlgorithms(tid, algorithms2);
			if (isok == 1) {
				request.setAttribute("algorithms2_status", 200);
			} else {
				request.setAttribute("algorithms2_status", 100);
				request.setAttribute("algorithms2_errorMessage", "该词汇算法调查链接已存在");
			}
		}
		if (algorithms3 != null && algorithms3.trim() != "") {
			int isok = surveyService.saveAlgorithms(tid, algorithms3);
			if (isok == 1) {
				request.setAttribute("algorithms3_status", 200);
			} else {
				request.setAttribute("algorithms3_status", 100);
				request.setAttribute("algorithms3_errorMessage", "该词汇算法调查链接已存在");
			}
		}
	}

	// 造型检测匹配率 接口
	@RequestMapping("{tid}/Ratio")
	public void semanticQuestionConnectResult(@PathVariable Integer tid, HttpServletRequest request) {
		String ratios = surveyService.getRatio(tid);
		request.setAttribute("ratios", ratios);

	}

	// 造型检测匹配率 保存接口
	@RequestMapping("{tid}/Ratio/save")
	public void semanticQuestionRatioSave(@PathVariable Integer tid, HttpServletRequest request) {
		String ratio1 = request.getParameter("Ratio1");
		String ratio2 = request.getParameter("Ratio2");
		String ratio3 = request.getParameter("Ratio3");
		if (ratio1 != null && ratio1.trim() != "") {
			int isok = surveyService.saveAlgorithms(tid, ratio1);
			if (isok == 1) {
				request.setAttribute("ratio1_status", 200);
			} else {
				request.setAttribute("ratio1_status", 100);
				request.setAttribute("ratio1_errorMessage", "该词汇匹配率调查链接已存在");
			}
		}
		if (ratio2 != null && ratio2.trim() != "") {
			int isok = surveyService.saveAlgorithms(tid, ratio2);
			if (isok == 1) {
				request.setAttribute("ratio2_status", 200);
			} else {
				request.setAttribute("ratio2_status", 100);
				request.setAttribute("ratio2_errorMessage", "该词汇匹配率调查链接已存在");
			}
		}
		if (ratio3 != null && ratio3.trim() != "") {
			int isok = surveyService.saveAlgorithms(tid, ratio3);
			if (isok == 1) {
				request.setAttribute("ratio3_status", 200);
			} else {
				request.setAttribute("ratio3_status", 100);
				request.setAttribute("ratio3_errorMessage", "该词汇匹配率调查链接已存在");
			}
		}
	}

}
