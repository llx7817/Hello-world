package cn.art.util;

import java.util.List;
import java.util.Map;

import cn.art.model.Word;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonConvert<T> {
	
	public String Bean2Json(T object) {
		JSONObject jsonObject = JSONObject.fromObject(object);
		return jsonObject.toString();
	}
	public Word Json2Bean(String jsonstr) {
		JSONObject jsonObject = JSONObject.fromObject(jsonstr);
		Word word = (Word) JSONObject.toBean(jsonObject,Word.class);
		return word;
	}
	
	public String list2json(List<T> lists) {
		JSONArray jsonArray = JSONArray.fromObject(lists);
		return jsonArray.toString();
	}
	//转化为list形式
	public List<Word> json2list(String jsonliststr){
		JSONArray jsonArray = JSONArray.fromObject(jsonliststr);
		List<Word> words = JSONArray.toList(jsonArray,Word.class);
		return words;
	}
	public Word[] json2array(String jsonliststr) {
		JSONArray jsonArray = JSONArray.fromObject(jsonliststr);
		Word[] words = (Word[]) jsonArray.toArray(jsonArray,Word.class);
		return words;
	}
	
	public String mapobject2json(Map<String, T> map) {
		JSONObject jsonObject = JSONObject.fromObject(map);
		return jsonObject.toString();
	}
	public String maparray2json(Map<String, T> map) {
		JSONArray jsonArray = JSONArray.fromObject(map);
		return jsonArray.toString();
	}
	

}
