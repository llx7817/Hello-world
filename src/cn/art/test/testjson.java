
package cn.art.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.art.model.User;
import cn.art.model.Word;
import cn.art.service.UserService;
import cn.art.service.WordService;
import cn.art.util.JsonConvert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class testjson {
	private WordService wordservice;
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public WordService getWordservice() {
		return wordservice;
	}

	@Autowired
	public void setWordservice(WordService wordservice) {
		this.wordservice = wordservice;
	}

	@Test
	public void bean2json() {
		// Word word = wordservice.selectByPrimaryKey(1);
		// User user = userService.selectUserById(1);
		JsonConvert jsonConvert = new JsonConvert();
		// System.out.println(word.getWbasic());
		// System.out.println(jsonConvert.Bean2Json(word));
	}

	@Test
	public void json2bean() {
		String jsonstr = "{\"wsimilar\":\"悠闲 安定 安适 安好 安详 清静 安逸 稳重 安详 平和 和缓 安闲 平宁 平安 宁静 安全 安静 安清 镇静 幽静 静谧 稳定 清闲 平静 承平 安乐 安谧 从容 自在 舒适 太平 寂静 冷静 和平 安稳 安然\",\"wid\":5,\"wvocatype\":\"大气\",\"wbasic\":\"1.秩序正常，没有骚扰；2.心情安定、平静。\",\"wcolorwarm\":1,\"wword\":\"安宁\",\"wdetail\":\"1.安定，太平。\",\"wfirstchar\":\"A\",\"woposite\":\"混乱 纷乱 烦躁 烦恼 动乱 骚扰 烦扰 动荡 烦闷 纷扰\"}";
		JsonConvert jsonConvert = new JsonConvert();
		Word word = jsonConvert.Json2Bean(jsonstr);
		// System.out.println(word.getWbasic());
		System.out.println(word.getWbasic() + " " + word.getWdetail());
	}

	@Test
	public void list2json() {
		JsonConvert jsonConvert = new JsonConvert();
		// List<Word> lists = wordservice.selectByWFirstChar("A");
		List<User> lists1 = userService.selectUserByName("222");
		System.out.println(jsonConvert.list2json(lists1));
	}

	@Test
	public void json2list() {
		String jsonstr = "[{\"wsimilar\":\"悠闲 安定 安适 安好 安详 清静 安逸 稳重 安详 平和 和缓 安闲 平宁 平安 宁静 安全 安静 安清 镇静 幽静 静谧 稳定 清闲 平静 承平 安乐 安谧 从容 自在 舒适 太平 寂静 冷静 和平 安稳 安然\",\"wid\":1,\"wvocatype\":\"大气\",\"wbasic\":\"1.秩序正常，没有骚扰；2.心情安定、平静。\",\"wcolorwarm\":1,\"wword\":\"安宁\",\"wdetail\":\"1.安定，太平。\",\"wfirstchar\":\"A\",\"woposite\":\"混乱 纷乱 烦躁 烦恼 动乱 骚扰 烦扰 动荡 烦闷 纷扰\"},{\"wsimilar\":\"安定 稳定\",\"wid\":2,\"wvocatype\":\"欧亚\",\"wbasic\":\"1.秩序正常，没有骚扰\",\"wcolorwarm\":1,\"wword\":\"安稳\",\"wdetail\":\"1.安定，太平。\",\"wfirstchar\":\"A\",\"woposite\":\"晃动 动荡\"},{\"wsimilar\":\"清净 安定\",\"wid\":5,\"wvocatype\":\"优雅\",\"wbasic\":\"1.秩序正常，没有骚扰\",\"wcolorwarm\":1,\"wword\":\"安静\",\"wdetail\":\"1.安定，太平。\",\"wfirstchar\":\"A\",\"woposite\":\"喧哗 烦躁\"}]";
		JsonConvert jsonConvert = new JsonConvert();
		List<Word> words = jsonConvert.json2list(jsonstr);
		for (Word word : words) {
			System.out.println(word.getWbasic() + " " + word.getWdetail());
		}
	}

	@Test
	public void json2array() {
		String jsonstr = "[{\"wsimilar\":\"悠闲 安定 安适 安好 安详 清静 安逸 稳重 安详 平和 和缓 安闲 平宁 平安 宁静 安全 安静 安清 镇静 幽静 静谧 稳定 清闲 平静 承平 安乐 安谧 从容 自在 舒适 太平 寂静 冷静 和平 安稳 安然\",\"wid\":1,\"wvocatype\":\"大气\",\"wbasic\":\"1.秩序正常，没有骚扰；2.心情安定、平静。\",\"wcolorwarm\":1,\"wword\":\"安宁\",\"wdetail\":\"1.安定，太平。\",\"wfirstchar\":\"A\",\"woposite\":\"混乱 纷乱 烦躁 烦恼 动乱 骚扰 烦扰 动荡 烦闷 纷扰\"},{\"wsimilar\":\"安定 稳定\",\"wid\":2,\"wvocatype\":\"欧亚\",\"wbasic\":\"1.秩序正常，没有骚扰\",\"wcolorwarm\":1,\"wword\":\"安稳\",\"wdetail\":\"1.安定，太平。\",\"wfirstchar\":\"A\",\"woposite\":\"晃动 动荡\"},{\"wsimilar\":\"清净 安定\",\"wid\":3,\"wvocatype\":\"优雅\",\"wbasic\":\"1.秩序正常，没有骚扰\",\"wcolorwarm\":1,\"wword\":\"安静\",\"wdetail\":\"1.安定，太平。\",\"wfirstchar\":\"A\",\"woposite\":\"喧哗 烦躁\"}]";
		JsonConvert jsonConvert = new JsonConvert();
		Word[] words = jsonConvert.json2array(jsonstr);
		for (Word word : words) {
			System.out.println(word.getWbasic() + " " + word.getWdetail());
		}
	}

	@Test
	public void mapobject2json() {
		// Word word = wordservice.selectByPrimaryKey(1);
		JsonConvert jsonConvert = new JsonConvert();
		Map<String, Word> map = new HashMap<String, Word>();
		// map.put("first", word);
		System.out.println(jsonConvert.mapobject2json(map));
	}

	@Test
	public void maparray2json() {
		List<Word> lists = wordservice.selectByWFirstChar("A");
		JsonConvert jsonConvert = new JsonConvert();
		Map<String, Word> map = new HashMap<String, Word>();
		String id;
		for (Word word : lists) {
			id = word.getWid() + "";
			map.put(id, word);
		}
		System.out.println(jsonConvert.maparray2json(map));
	}

}
