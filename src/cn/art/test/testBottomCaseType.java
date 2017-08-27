package cn.art.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.art.dao.BottomCaseMapper;
import cn.art.dao.BottomCaseTypeMapper;
import cn.art.model.BottomCase;
import cn.art.model.BottomCaseType;
import cn.art.util.JsonConvert;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class testBottomCaseType {
	private BottomCaseTypeMapper bottomCaseTypeMapper;
	private BottomCaseMapper bottomCaseMapper;

	public BottomCaseMapper getBottomCaseMapper() {
		return bottomCaseMapper;
	}
	@Autowired
	public void setBottomCaseMapper(BottomCaseMapper bottomCaseMapper) {
		this.bottomCaseMapper = bottomCaseMapper;
	}
	public BottomCaseTypeMapper getBottomCaseTypeMapper() {
		return bottomCaseTypeMapper;
	}
	@Autowired
	public void setBottomCaseTypeMapper(BottomCaseTypeMapper bottomCaseTypeMapper) {
		this.bottomCaseTypeMapper = bottomCaseTypeMapper;
	}
	@Test
	public void testselectByTID(){
		 List<BottomCaseType> bottomCaseTypes = bottomCaseTypeMapper.selectByTID(1);
		 JsonConvert<BottomCaseType> jsonConvert = new JsonConvert<>();
		 String string = jsonConvert.list2json(bottomCaseTypes);
		 System.out.println(string);
	}
	
	@Test
	public void testBottomCase_selectByName(){
		 List<BottomCase> bottomCases = bottomCaseMapper.selectByName("444");
		 JsonConvert<BottomCase> jsonConvert = new JsonConvert<>();
		 String string = jsonConvert.list2json(bottomCases);
		 System.out.println(string);
	}
	
	@Test
	public void testBottomCase_CountNumByName(){
		 int num = bottomCaseMapper.CountNumByName("444");
		 //JsonConvert<BottomCase> jsonConvert = new JsonConvert<>();
		 //String string = jsonConvert.list2json(bottomCases);
		 System.out.println("count Num "+num);
	}

}
