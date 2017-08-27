package cn.art.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.art.dao.OutLineTypeMapper;
import cn.art.model.OutLineType;
import cn.art.service.OutLineTypeService;

@Service("OutLineTypeService")
public class OutLineTypeServiceImpl implements OutLineTypeService {
	private OutLineTypeMapper outLineTypeMapper;

	public OutLineTypeMapper getOutLineTypeMapper() {
		return outLineTypeMapper;
	}
	@Autowired
	public void setOutLineTypeMapper(OutLineTypeMapper outLineTypeMapper) {
		this.outLineTypeMapper = outLineTypeMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer otid) {
		// TODO Auto-generated method stub
		return outLineTypeMapper.deleteByPrimaryKey(otid);
	}

	@Override
	public int insert(OutLineType record) {
		// TODO Auto-generated method stub
		return outLineTypeMapper.insert(record);
	}

	@Override
	public int insertSelective(OutLineType record) {
		// TODO Auto-generated method stub
		return outLineTypeMapper.insertSelective(record);
	}

	@Override
	public OutLineType selectByPrimaryKey(Integer otid) {
		// TODO Auto-generated method stub
		return outLineTypeMapper.selectByPrimaryKey(otid);
	}

	@Override
	public List<OutLineType> selectByTID(Integer tid) {
		// TODO Auto-generated method stub
		return outLineTypeMapper.selectByTID(tid);
	}

	@Override
	public int updateByPrimaryKeySelective(OutLineType record) {
		// TODO Auto-generated method stub
		return outLineTypeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(OutLineType record) {
		// TODO Auto-generated method stub
		return outLineTypeMapper.updateByPrimaryKey(record);
	}

}
