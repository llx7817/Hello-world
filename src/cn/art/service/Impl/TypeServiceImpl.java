package cn.art.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.art.dao.TypeMapper;
import cn.art.model.Type;
import cn.art.service.TypeService;
import cn.art.util.JsonConvert;
import cn.art.util.pojo.typeIdName;


@Service("TypeService")
public class TypeServiceImpl implements TypeService {
	private TypeMapper typeMapper;
	
	private JsonConvert jsonConvert;
	public TypeServiceImpl(){
		jsonConvert = new JsonConvert();
	}
	public TypeMapper getTypeMapper() {
		return typeMapper;
	}
	@Autowired
	public void setTypeMapper(TypeMapper typeMapper) {
		this.typeMapper = typeMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer tid) {
		// TODO Auto-generated method stub
		return typeMapper.deleteByPrimaryKey(tid);
	}

	@Override
	public int insert(Type record) {
		// TODO Auto-generated method stub
		return typeMapper.insert(record);
	}

	@Override
	public int insertSelective(Type record) {
		// TODO Auto-generated method stub
		return typeMapper.insertSelective(record);
	}

	@Override
	public Type selectByPrimaryKey(Integer tid) {
		// TODO Auto-generated method stub
		return typeMapper.selectByPrimaryKey(tid);
	}

	@Override
	public int updateByPrimaryKeySelective(Type record) {
		// TODO Auto-generated method stub
		return typeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Type record) {
		// TODO Auto-generated method stub
		return typeMapper.updateByPrimaryKey(record);
	}
	@Override
	public List<Type> selectAll() {
		// TODO Auto-generated method stub
		return typeMapper.selectAll();
	}
	@Override
	public Type selectAllByName(String tname) {
		// TODO Auto-generated method stub
		return typeMapper.selectAllByName(tname);
	}
	@Override
	public List<typeIdName> selectAllOnlyIdandName() {
		// TODO Auto-generated method stub
		return typeMapper.selectAllOnlyIdandName();
	}
	@Override
	public List<typeIdName> selectAllByWordType(Integer twordtype) {
		// TODO Auto-generated method stub
		return typeMapper.selectAllByWordType(twordtype);
	}
	@Override
	public String getOnlyIdandName() {
		// TODO Auto-generated method stub
		List<typeIdName> typeIdNames = typeMapper.selectAllOnlyIdandName();
		return jsonConvert.list2json(typeIdNames);
	}
	@Override
	public String selectAllOnlyIDName() {
		// TODO Auto-generated method stub
		List<typeIdName> typeIdNames = typeMapper.selectAllOnlyIdandName();
		return jsonConvert.list2json(typeIdNames);
	}
	@Override
	public int getFirstTid() {
		// TODO Auto-generated method stub
		List<typeIdName> typeIdNames = typeMapper.selectAllOnlyIdandName();
		int tid = 1;
		for (typeIdName typeIdName : typeIdNames) {
			tid = typeIdName.getTid();
			break;
		}
		return tid;
	}

}
