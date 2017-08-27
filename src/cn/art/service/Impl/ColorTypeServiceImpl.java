package cn.art.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.art.dao.ColorTypeMapper;
import cn.art.model.ColorType;
import cn.art.service.ColorTypeService;

@Service("ColorTypeService")
public class ColorTypeServiceImpl implements ColorTypeService {
	private ColorTypeMapper colorTypeMapper;


	public ColorTypeMapper getColorTypeMapper() {
		return colorTypeMapper;
	}
	@Autowired
	public void setColorTypeMapper(ColorTypeMapper colorTypeMapper) {
		this.colorTypeMapper = colorTypeMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer cbid) {
		// TODO Auto-generated method stub
		return colorTypeMapper.deleteByPrimaryKey(cbid);
	}

	@Override
	public int insert(ColorType record) {
		// TODO Auto-generated method stub
		return colorTypeMapper.insert(record);
	}

	@Override
	public int insertSelective(ColorType record) {
		// TODO Auto-generated method stub
		return colorTypeMapper.insertSelective(record);
	}

	@Override
	public ColorType selectByPrimaryKey(Integer cbid) {
		// TODO Auto-generated method stub
		return colorTypeMapper.selectByPrimaryKey(cbid);
	}

	@Override
	public List<ColorType> selectByTID(Integer tid) {
		// TODO Auto-generated method stub
		return colorTypeMapper.selectByTID(tid);
	}

	@Override
	public int updateByPrimaryKeySelective(ColorType record) {
		// TODO Auto-generated method stub
		return colorTypeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ColorType record) {
		// TODO Auto-generated method stub
		return colorTypeMapper.updateByPrimaryKey(record);
	}

}
