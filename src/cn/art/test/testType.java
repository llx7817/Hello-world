package cn.art.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.art.dao.TypeMapper;
import cn.art.model.Type;
import cn.art.util.pojo.typeIdName;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class testType {
	private TypeMapper typeMapper;

	public TypeMapper getTypeMapper() {
		return typeMapper;
	}
	@Autowired
	public void setTypeMapper(TypeMapper typeMapper) {
		this.typeMapper = typeMapper;
	}
	
	@Test
	public void typeselectAll(){
		List<Type> types = typeMapper.selectAll();
		for(Type type:types){
			System.out.println(type.getTid()+" "+type.getTname());
		}
	}
	
	@Test
	public void typeselectAllOnlyIdandName(){
		List<typeIdName> types = typeMapper.selectAllOnlyIdandName();
		for(typeIdName type:types){
			System.out.println(type.getTid()+" "+type.getTname());
		}
	}
	@Test
	public void typeupdateByselective(){
		Type type = new Type();
		type.setTid(2);
		type.setTtiaozheng("9579");
		int isok = typeMapper.updateByPrimaryKeySelective(type);
	}

}
