package cn.art.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.art.dao.ColorMapper;
import cn.art.model.Color;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml","classpath:spring-mybatis.xml"})

public class testcolor {
	private ColorMapper colorMapper;

	public ColorMapper getColorMapper() {
		return colorMapper;
	}
	@Autowired
	public void setColorMapper(ColorMapper colorMapper) {
		this.colorMapper = colorMapper;
	}
	
	@Test
	public void testselectByTIDandCBID(){
		Map<String, Integer> map = new HashMap<>();
		map.put("tid",1);
		map.put("cbid",1);
		List<Color> colors = colorMapper.selectByTIDandCBID(map);
	
		for(Color color: colors) {
			System.out.println("zzzzz"+color.getCdescription());
		}
	}
	

}
