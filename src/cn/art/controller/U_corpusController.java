package cn.art.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.art.service.JWordService;
import cn.art.service.SurveyService;
import cn.art.service.TypeService;
import cn.art.service.WordService;

@Controller
@RequestMapping("corpus")
public class U_corpusController {
	private WordService wordService;
	private TypeService typeService;
	private JWordService jWordService;
	private SurveyService seurveyService;

	public SurveyService getSeurveyService() {
		return seurveyService;
	}

	@Autowired
	public void setSeurveyService(SurveyService seurveyService) {
		this.seurveyService = seurveyService;
	}

	public JWordService getjWordService() {
		return jWordService;
	}

	@Autowired
	public void setjWordService(JWordService jWordService) {
		this.jWordService = jWordService;
	}

	public TypeService getTypeService() {
		return typeService;
	}

	@Autowired
	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}

	public WordService getWordService() {
		return wordService;
	}

	@Autowired
	public void setWordService(WordService wordService) {
		this.wordService = wordService;
	}

	// 基础意象词汇库 详细分类接口
	@RequestMapping("basic/{basicSubInfo}")
	public String corpusBasic(@PathVariable String basicSubInfo, HttpServletRequest request) {
		if ("firstChar".equals(basicSubInfo)) {
			String words = wordService.getWordFV();
			request.setAttribute("words", words);
		} else if ("vocabularyType".equals(basicSubInfo)) {
			String words = wordService.getWordFV();
			request.setAttribute("words", words);
		} else {
			request.setAttribute("errorMessage", "请求词汇分类错误");
		}

		return "manager/testlogin";
	}

	// 基础意象语义库 详细词汇接口(比如"安宁")
	@RequestMapping("basic/word/{wid}")
	public String corpusBasicWordDetail(@PathVariable Integer wid, HttpServletRequest request) {
		String word = wordService.selectWordByPrimaryKey(wid);
		request.setAttribute("word", word);

		return "manager/testlogin";
	}

	// 降维词汇库 物件类型默认接口
	@RequestMapping("dimense")
	public String corpusDimense(HttpServletRequest request) {
		String types = typeService.selectAllOnlyIDName();
		request.setAttribute("types", types);

		int tid = typeService.getFirstTid();
		String words = jWordService.getAllJwordByTID(tid);
		request.setAttribute("words", words);

		// request.setAttribute("word", word);

		return "manager/testlogin";
	}

	// 基础意象语义库 详细词汇接口(比如"安宁")
	@RequestMapping("dimense/{tid}")
	public String corpusDimenseDetail(@PathVariable Integer tid, HttpServletRequest request) {
		String words = jWordService.getAllJwordByTID(tid);
		request.setAttribute("words", words);

		return "manager/testlogin";
	}

	// 降维词汇库 详细词汇接口(比如"朝气")
	@RequestMapping("dimense/word/{wid}")
	public String corpusDimenseWordDetail1(@PathVariable Integer wid, HttpServletRequest request) {
		String word = wordService.selectWordByPrimaryKey(wid);
		request.setAttribute("word", word);

		return "manager/testlogin";
	}

	// 问卷调查与检验 物件类型默认接口
	@RequestMapping("question")
	public String corpusQuestion(HttpServletRequest request) {
		String types = typeService.selectAllOnlyIDName();
		request.setAttribute("types", types);

		int tid = typeService.getFirstTid();
		// String surveys = seurveyService.selectSurveysByTID(tid);
		// request.setAttribute("surveys", surveys);

		return "manager/testlogin";
	}

	// 问卷调查与检验 xx物件类型调查接口
	@RequestMapping("question/{tid}")
	public String corpusQuestionClassify(@PathVariable Integer tid, HttpServletRequest request) {

		// String surveys = seurveyService.selectSurveysByTID(tid);
		// request.setAttribute("surveys", surveys);

		return "manager/testlogin";
	}

}
