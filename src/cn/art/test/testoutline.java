package cn.art.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.art.dao.OutLineMapper;
import cn.art.model.OutLine;
import cn.art.service.PartService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class testoutline {
	private OutLineMapper outLineMapper;
	private PartService partService;
	
	public PartService getPartService() {
		return partService;
	}
	@Autowired
	public void setPartService(PartService partService) {
		this.partService = partService;
	}
	public OutLineMapper getOutLineMapper() {
		return outLineMapper;
	}
	@Autowired
	public void setOutLineMapper(OutLineMapper outLineMapper) {
		this.outLineMapper = outLineMapper;
	}



	@Test
	public void testselectByTIDOTID() {
		Map<String, Integer> map = new HashMap<>();
		map.put("tid",1);
		map.put("otid",1);
		List<OutLine> outlines = outLineMapper.selectByTIDandOTID(map);
		for(OutLine outLine: outlines) {
			System.out.println(outLine.getOdescription());
		}
		//System.out.println(word.getWbasic());
		//System.out.println(word.getWbasic()+" "+word.getWdetail());
	}
	@Test
	public void testPartGetpartB4() {
		
		String part4 = partService.getPartBasic4(1);
		System.out.println("part4 "+part4);
		//System.out.println(word.getWbasic()+" "+word.getWdetail());
	}

}
