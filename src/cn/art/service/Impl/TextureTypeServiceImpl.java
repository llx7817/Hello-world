package cn.art.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.art.dao.TextureTypeMapper;
import cn.art.model.TextureType;
import cn.art.service.TextureTypeService;

@Service("TextureTypeService")
public class TextureTypeServiceImpl implements TextureTypeService {
	private TextureTypeMapper textureTypeMapper;

	public TextureTypeMapper getTextureTypeMapper() {
		return textureTypeMapper;
	}
	@Autowired
	public void setTextureTypeMapper(TextureTypeMapper textureTypeMapper) {
		this.textureTypeMapper = textureTypeMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer ttid) {
		// TODO Auto-generated method stub
		return textureTypeMapper.deleteByPrimaryKey(ttid);
	}

	@Override
	public int insert(TextureType record) {
		// TODO Auto-generated method stub
		return textureTypeMapper.insert(record);
	}

	@Override
	public int insertSelective(TextureType record) {
		// TODO Auto-generated method stub
		return textureTypeMapper.insertSelective(record);
	}

	@Override
	public TextureType selectByPrimaryKey(Integer ttid) {
		// TODO Auto-generated method stub
		return textureTypeMapper.selectByPrimaryKey(ttid);
	}

	@Override
	public List<TextureType> selectByTID(Integer tid) {
		// TODO Auto-generated method stub
		return textureTypeMapper.selectByTID(tid);
	}

	@Override
	public int updateByPrimaryKeySelective(TextureType record) {
		// TODO Auto-generated method stub
		return textureTypeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TextureType record) {
		// TODO Auto-generated method stub
		return textureTypeMapper.updateByPrimaryKey(record);
	}

}
