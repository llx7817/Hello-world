package cn.art.controller;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.art.model.Word;
import cn.art.service.WordService;
import cn.art.util.pojo.wordp;
import net.sourceforge.pinyin4j.PinyinHelper;

@Controller
@RequestMapping("manager/basicSemantic")
public class M_basicSemanticController {
	private WordService wordService;

	public WordService getWordService() {
		return wordService;
	}

	@Autowired
	public void setWordService(WordService wordService) {
		this.wordService = wordService;
	}

	@RequestMapping("list")
	public String list(Model model) {
		List<Word> wordList = wordService.selectAll();
		model.addAttribute("wordList", wordList);
		return "manager/yuyi/basicSemantic/list";
	}

	/**
	 * 加载需要修改的信息
	 * 
	 * @param model
	 * @param id
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/edit")
	public String edit(Word item, Model model, Integer id) {
		if (id != null) {
			item = wordService.selectByPrimaryKey(id);
		}
		model.addAttribute("item", item);
		return "manager/yuyi/basicSemantic/edit";
	}

	@RequestMapping("todelete")
	public String todelete(Model model) {
		List<Word> wordList = wordService.selectAll();
		model.addAttribute("wordList", wordList);
		return "manager/yuyi/basicSemantic/delete";
	}

	/**
	 * 保存
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/load/save")
	@ResponseBody
	public int save(Word item) {
		List<Word> typesList = wordService.selectAll();
		String Wword = item.getWword();
		String[] pinyinArray = PinyinHelper.toHanyuPinyinStringArray(Wword.charAt(0));
		if (pinyinArray != null) {
			String pinyin = pinyinArray[0].toString().toUpperCase().substring(0, 1);
			item.setWfirstchar(pinyin);
		}

		int message = 0;// 插入新类型成功
		if (item.getWid() != null) {
			for (Word typeIdName : typesList) {
				if (typeIdName.getWid().toString().equals(item.getWid().toString())) {

					wordService.updateByPrimaryKey(item);
					message = 1;// 更新类型成功
					return message;
				}
			}
		}

		wordService.insert(item);
		return message;
	}

	@RequestMapping("/load/delete")
	@ResponseBody
	public int delete(Integer id) {
		int delete = wordService.deleteByPrimaryKey(id);
		return delete;
	}

	// 基础意象语义库 (默认接口)
	@RequestMapping("")
	public String semanticBasic(HttpServletRequest request) {
		List<Word> words = wordService.selectAll();
		wordp wordp;
		List<wordp> word = new LinkedList<wordp>();
		for (Word word2 : words) {
			wordp = new wordp();
			wordp.setWfirstchar(word2.getWfirstchar());
			wordp.setWid(word2.getWid());
			wordp.setWword(word2.getWword());
			word.add(wordp);
		}
		// request.setAttribute("words", jsonConvert.list2json(word));

		return "manager/testlogin";
	}

	// 基础语义库 编辑接口
	@RequestMapping("edit/{id}")
	public String semanticBasicEdit(@PathVariable Integer id, HttpServletRequest request) {
		String word = wordService.selectWordByPrimaryKey(id);
		request.setAttribute("word", word);

		return "manager/testlogin";
	}

	// 编辑保存 新增词汇保存接口 目前存在一些 问题 接口状态待定。。。。。。。。。。。。。。。。
	// 基础意象语义库 编辑保存接口
	@RequestMapping("edit/{wid}/confirm")
	public String semanticBasicEditSave(@PathVariable Integer wid, HttpServletRequest request) {
		String WWord = request.getParameter("WWord");
		String WBasic = request.getParameter("WBasic");
		String WDetail = request.getParameter("WDetail");
		String WSimilar = request.getParameter("WSimilar");
		String WOpposite = request.getParameter("WOpposite");
		String WColorWarm = request.getParameter("WColorWarm");

		int isok = wordService.update(wid, WWord, WBasic, WDetail, WSimilar, WOpposite, Integer.parseInt(WColorWarm));
		if (isok == 1) {
			request.setAttribute("status", 200);
		} else {
			request.setAttribute("status", 100);
			request.setAttribute("errorMessage", "基础意象语义库编辑保存失败");
		}

		return "manager/testlogin";
	}

	// 基础意象语义库 添加新词汇接口
	@RequestMapping("addword")
	public String semanticBasicAddWord(HttpServletRequest request) {
		String WWord = request.getParameter("WWord");
		String WBasic = request.getParameter("WBasic");
		String WDetail = request.getParameter("WDetail");
		String WSimilar = request.getParameter("WSimilar");
		String WOpposite = request.getParameter("WOpposite");

		int isok = wordService.insertSelect(WWord, WBasic, WDetail, WSimilar, WOpposite);
		if (isok == 1) {
			request.setAttribute("status", 200);
		} else {
			request.setAttribute("status", 100);
			request.setAttribute("errorMessage", "基础意象语义库编辑保存失败");
		}

		return "manager/testlogin";
	}

	/*
	 * 删除接口 该功能模块风险较大 很容易对数据库造成不可估量的风险 咱不对外提供 //基础意象语义库 删除接口
	 * 
	 * @RequestMapping("delete/{id}") public String
	 * semanticBasicDelete(@PathVariable Integer id,HttpServletRequest request){ int
	 * isDelete = wordService.deleteByPrimaryKey(id); if(isDelete==1){
	 * request.setAttribute("status", 200); }else{ request.setAttribute("status",
	 * 100); request.setAttribute("erroeMessage", "该词汇删除失败"); }
	 * 
	 * return "manager/testlogin"; }
	 */

}
