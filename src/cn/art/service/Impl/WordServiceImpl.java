package cn.art.service.Impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.art.dao.WordMapper;
import cn.art.model.Word;
import cn.art.service.WordService;
import cn.art.util.JsonConvert;
import cn.art.util.pojo.wordFV;
import cn.art.util.pojo.wordFp;

@Service("WordService")
public class WordServiceImpl implements WordService {
	private WordMapper wordMapper;
	private JsonConvert jsonConvert;
	
	public WordServiceImpl(){
		jsonConvert = new JsonConvert();
	}

	public WordMapper getWordMapper() {
		return wordMapper;
	}
	@Autowired
	public void setWordMapper(WordMapper wordMapper) {
		this.wordMapper = wordMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer wid) {
		// TODO Auto-generated method stub
		return wordMapper.deleteByPrimaryKey(wid);
	}

	@Override
	public int insert(Word record) {
		// TODO Auto-generated method stub
		return wordMapper.insert(record);
	}

	@Override
	public int insertSelective(Word record) {
		// TODO Auto-generated method stub
		return wordMapper.insertSelective(record);
	}

	@Override
	public String selectWordByPrimaryKey(Integer wid) {
		// TODO Auto-generated method stub
		return jsonConvert.Bean2Json(wordMapper.selectByPrimaryKey(wid));
	}

	@Override
	public List<Word> selectByWFirstChar(String wfirstchar) {
		// TODO Auto-generated method stub
		return wordMapper.selectByWFirstChar(wfirstchar);
	}

	@Override
	public int updateByPrimaryKeySelective(Word record) {
		// TODO Auto-generated method stub
		return wordMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Word record) {
		// TODO Auto-generated method stub
		return wordMapper.updateByPrimaryKey(record);
	}
	@Override
	public List<Word> selectByWVocaType(String wvocatype) {
		// TODO Auto-generated method stub
		return wordMapper.selectByWVocaType(wvocatype);
	}
	@Override
	public List<Word> selectAll() {
		// TODO Auto-generated method stub
		return wordMapper.selectAll();
	}
	@Override
	public String getwordFp() {
		// TODO Auto-generated method stub
		wordFp wordFp;
		List<Word> words = wordMapper.selectAll();
		List<wordFp> wordFps = new LinkedList<wordFp>();
		for(Word word: words){
			wordFp = new wordFp();
			wordFp.setWfirstchar(word.getWfirstchar());
			wordFp.setWid(word.getWid());
			wordFp.setWword(word.getWword());
			wordFps.add(wordFp);
		}
		return jsonConvert.list2json(wordFps);
	}

	@Override
	public String getWordFV() {
		// TODO Auto-generated method stub
		wordFV wordFV;
		List<Word> words = wordMapper.selectAll();
		List<wordFV> wordFVs = new LinkedList<wordFV>();
		for(Word word: words){
			wordFV = new wordFV();
			wordFV.setWfirstchar(word.getWfirstchar());
			wordFV.setWid(word.getWid());
			wordFV.setWword(word.getWword());
			wordFV.setWoposite(word.getWoposite());
			wordFV.setWsimilar(word.getWsimilar());
			wordFV.setWfirstchar(word.getWfirstchar());
			wordFV.setWvocatype(word.getWvocatype());
			wordFVs.add(wordFV);
		}
		return jsonConvert.list2json(wordFVs);

	}

	@Override
	public Word selectByPrimaryKey(Integer wid) {
		// TODO Auto-generated method stub
		return wordMapper.selectByPrimaryKey(wid);
	}

	@Override
	public int update(Integer wid, String wword, String wbasic,
			String wdetail, String wsimilar, String wopposite, Integer wcolorwarm) {
		// TODO Auto-generated method stub
		Word word = wordMapper.selectByPrimaryKey(wid);
		word.setWword(wword);
		word.setWbasic(wbasic);
		word.setWdetail(wdetail);
		word.setWsimilar(wsimilar);
		word.setWoposite(wopposite);
		word.setWcolorwarm(wcolorwarm);
		
		return wordMapper.updateByPrimaryKeySelective(word);
	}

	@Override
	public int insertSelect(String wword, String wbasic,
			String wdetail, String wsimilar, String wopposite) {
		// TODO Auto-generated method stub
		Word word = new Word();
		word.setWword(wword);
		word.setWbasic(wbasic);
		word.setWdetail(wdetail);
		word.setWsimilar(wsimilar);
		word.setWoposite(wopposite);
		
		return wordMapper.insertSelective(word);
	}


}
