package cn.art.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.art.service.WordService;


@Controller
@RequestMapping("")
public class wordController {
	private WordService wordService;

	public WordService getWordService() {
		return wordService;
	}
	@Autowired
	public void setWordService(WordService wordService) {
		this.wordService = wordService;
	}
	
	@RequestMapping("corpus/basic/word/{WID}")
	public String getWordByID(@PathVariable String WID , HttpServletRequest request ){
		//Word word = wordService.selectByPrimaryKey(Integer.parseInt(WID));
		//request.setAttribute("Word", word);
		return "user/word";
	}
	
	/*
	@RequestMapping("corpus/basic/{basicSubInfo}")
	public String VocabularyService(@PathVariable String basicSubInfo , HttpServletRequest request){
		word2X word2X = new word2X();
		if("wvocatype".equals(basicSubInfo)){
			List<Word> words = wordService.selectByWVocaType("大气");
			List<wordV> wordVs =  new ArrayList<wordV>();
			for(Word word : words){
				wordVs.add(word2X.word2wordV(word));
			}
			request.setAttribute("Word", wordVs);
			return "user/word1";
		}else{
			List<Word> words = wordService.selectByWFirstChar("A");
			List<wordF> wordFs = new ArrayList<wordF>();
			for(Word word:words){
				wordFs.add(word2X.word2wordF(word));
			}
			request.setAttribute("Word", wordFs);
		}
		return "user/word1";
	}
	*/
	
	

}
