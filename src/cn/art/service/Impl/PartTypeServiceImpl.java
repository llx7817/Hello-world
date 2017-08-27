package cn.art.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.art.dao.PartTypeMapper;
import cn.art.model.PartType;
import cn.art.service.PartTypeService;

@Service("PartTypeService")
public class PartTypeServiceImpl implements PartTypeService {
	private PartTypeMapper partTypeMapper;

	public PartTypeMapper getPartTypeMapper() {
		return partTypeMapper;
	}
	@Autowired
	public void setPartTypeMapper(PartTypeMapper partTypeMapper) {
		this.partTypeMapper = partTypeMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer pbid) {
		// TODO Auto-generated method stub
		return partTypeMapper.deleteByPrimaryKey(pbid);
	}

	@Override
	public int insert(PartType record) {
		// TODO Auto-generated method stub
		return partTypeMapper.insert(record);
	}

	@Override
	public int insertSelective(PartType record) {
		// TODO Auto-generated method stub
		return partTypeMapper.insertSelective(record);
	}

	@Override
	public PartType selectByPrimaryKey(Integer pbid) {
		// TODO Auto-generated method stub
		return partTypeMapper.selectByPrimaryKey(pbid);
	}

	@Override
	public List<PartType> selectByTID(Integer tid) {
		// TODO Auto-generated method stub
		return partTypeMapper.selectByTID(tid);
	}

	@Override
	public int updateByPrimaryKeySelective(PartType record) {
		// TODO Auto-generated method stub
		return partTypeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(PartType record) {
		// TODO Auto-generated method stub
		return partTypeMapper.updateByPrimaryKey(record);
	}

}
