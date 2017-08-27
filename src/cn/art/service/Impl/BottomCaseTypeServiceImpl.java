package cn.art.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.art.dao.BottomCaseTypeMapper;
import cn.art.model.BottomCaseType;
import cn.art.service.BottomCaseTypeService;
@Service("BottomCaseTypeService")
public class BottomCaseTypeServiceImpl implements BottomCaseTypeService {
	private BottomCaseTypeMapper bottomCaseTypeMapper;

	public BottomCaseTypeMapper getBottomCaseTypeMapper() {
		return bottomCaseTypeMapper;
	}
	@Autowired
	public void setBottomCaseTypeMapper(BottomCaseTypeMapper bottomCaseTypeMapper) {
		this.bottomCaseTypeMapper = bottomCaseTypeMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer bctid) {
		// TODO Auto-generated method stub
		return bottomCaseTypeMapper.deleteByPrimaryKey(bctid);
	}

	@Override
	public int insert(BottomCaseType record) {
		// TODO Auto-generated method stub
		return bottomCaseTypeMapper.insert(record);
	}

	@Override
	public int insertSelective(BottomCaseType record) {
		// TODO Auto-generated method stub
		return bottomCaseTypeMapper.insertSelective(record);
	}

	@Override
	public BottomCaseType selectByPrimaryKey(Integer bctid) {
		// TODO Auto-generated method stub
		return bottomCaseTypeMapper.selectByPrimaryKey(bctid);
	}

	@Override
	public int updateByPrimaryKeySelective(BottomCaseType record) {
		// TODO Auto-generated method stub
		return bottomCaseTypeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(BottomCaseType record) {
		// TODO Auto-generated method stub
		return bottomCaseTypeMapper.updateByPrimaryKey(record);
	}
	@Override
	public List<BottomCaseType> selectByTID(Integer tid) {
		// TODO Auto-generated method stub
		return bottomCaseTypeMapper.selectByTID(tid);
	}

}
